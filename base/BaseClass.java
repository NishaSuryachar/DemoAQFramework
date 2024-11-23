package com.Qapitol.base;

import com.Qapitol.util.PropertyUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

   @Parameters("browser")
    @BeforeClass
   public void launchTheBrowser(String browser)
   {
       if (browser.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("edge")) {
           driver = new EdgeDriver();
       }
      // driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
    @BeforeMethod

    public void LoginToApp() throws IOException {

        PropertyUtil putil = new PropertyUtil();
        String URL = putil.getDataFromProperty("url");
        driver.get(URL);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

//    public static void startChrome() throws MalformedURLException {
//        if( TestData.get("execution_env").equalsIgnoreCase("remote")){
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setBrowserName(Browser.CHROME.browserName());
//            capabilities.setPlatform(Platform.WIN11);
//            driver= new RemoteWebDriver(new URL(TestData.get("seleniumGridURL")), capabilities);
//        }
//        else {
//            // Ensure driver is only set up once
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            WebDriverManager.chromedriver().setup();
//        }


    @AfterClass
    public void closTheBrowser() {
        driver.quit();
    }

//    @BeforeSuite
//    public void startSession() throws MalformedURLException {
//        startChrome();
//    }


}

