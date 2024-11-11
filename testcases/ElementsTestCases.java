package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.*;
import com.Qapitol.util.ExcelUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

public class ElementsTestCases extends BaseClass
{
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

    @Test
    public void checkBox()
    {
        CheckBoxPage cb=new CheckBoxPage(driver);
        cb.clickingCheckBox(driver);
    }

    @Test
    public void radioButton()
    {
        RadioButtonPage rb=new RadioButtonPage(driver);
        rb.clickingRadioButton(driver);
    }

    @Test
    public void webTables()
    {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        WebTablesPage wbp = new WebTablesPage(driver);
        wbp.validatingHeaders();
    }

    @Test
    public void buttons()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        ButtonPage bp=new ButtonPage(driver);
        bp.clickingButtons(driver);
    }

    @Test
    public void links()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

    }
}
