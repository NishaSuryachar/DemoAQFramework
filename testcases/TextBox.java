package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.TextBoxPage;
import com.Qapitol.util.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
@Test
public class TextBox extends BaseClass {


    @Test
    public void textBox() throws IOException {
        TextBoxPage tb=new TextBoxPage(driver);
        ExcelUtil eutil=new ExcelUtil();
        String name = eutil.getDataFromExcel("Sheet1", 1, 0);
        String email = eutil.getDataFromExcel("Sheet1", 1, 1);
        String currentAddress = eutil.getDataFromExcel("Sheet1", 1, 2);
        String permanentAddress = eutil.getDataFromExcel("Sheet1", 1, 3);
       tb.textBox(driver, name, email, currentAddress, permanentAddress);

    }

}
