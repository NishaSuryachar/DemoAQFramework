package com.Qapitol.testcases;

import com.Qapitol.base.BaseClassMock;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginToApp extends BaseClassMock
{
    @DataProvider(name = "LoginPage")
    public Object[][] getData() throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol\\Desktop\\LoginPage.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sh= wb.getSheet("Sheet1");
        int row = sh.getPhysicalNumberOfRows();
        int col = sh.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][col];{};
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                data[i][j]=sh.getRow(i).getCell(j).toString();

            }
        }

        return data;
    }

    @Test(dataProvider = "LoginPage")
    public void Login(String email, String password) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("http://139.59.27.246:3000/login");
        driver.findElement(By.id("userNameOrEmail")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }
}
