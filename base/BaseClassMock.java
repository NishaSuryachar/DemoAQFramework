package com.Qapitol.base;

import com.Qapitol.util.PropUtil;
import com.Qapitol.util.PropertyUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BaseClassMock
{
    public static WebDriver driver;
    @BeforeClass
    public void launchTheBrowser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod

    public void LoginToApp() throws IOException {

        PropUtil putil = new PropUtil();
        String URL = putil.getDataFromProperty("url");
        String URL1 = putil.getDataFromProperty("url1");
       driver.get(URL1);
      // driver.get(URL);
    }
    @AfterClass
    public void closTheBrowser() {
        driver.quit();
    }
}
