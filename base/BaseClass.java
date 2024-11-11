package com.Qapitol.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass
{
    public  WebDriver driver;
    @BeforeClass
   public void launchTheBrowser()
   {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
@BeforeMethod
    public void LoginToApp()
    {
        driver.get("https://demoqa.com/elements");
    }

//   @AfterClass
//   public void closTheBrowser()
//   {
//       driver.quit();
//   }

}

