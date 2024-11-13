package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.*;
import com.Qapitol.util.ExcelUtil;
import com.Qapitol.util.ListenerImplementation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerImplementation.class)
@Test
public class ElementsTestCases extends BaseClass
{
    @Test(priority = 1)
    public void textBox() throws IOException {
        TextBoxPage tb=new TextBoxPage(driver);
        ExcelUtil eutil=new ExcelUtil();
        String name = eutil.getDataFromExcel("Sheet1", 1, 0);
        String email = eutil.getDataFromExcel("Sheet1", 1, 1);
        String currentAddress = eutil.getDataFromExcel("Sheet1", 1, 2);
        String permanentAddress = eutil.getDataFromExcel("Sheet1", 1, 3);
        tb.textBox(driver, name, email, currentAddress, permanentAddress);
    }

    @Test(priority = 2)
    public void checkBox()
    {
        CheckBoxPage cb=new CheckBoxPage(driver);
        cb.clickingCheckBox(driver);
    }

    @Test(priority = 3)
    public void radioButton()
    {
        RadioButtonPage rb=new RadioButtonPage(driver);
        rb.clickingRadioButton(driver);
    }

    @Test(priority = 4)
    public void webTables()
    {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        WebTablesPage wbp = new WebTablesPage(driver);
        wbp.validatingHeaders();
    }

    @Test(priority = 5)
    public void buttons()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        ButtonPage bp=new ButtonPage(driver);
        bp.clickingButtons(driver);
    }

    @Test(priority = 6)
    public void links()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

    }

    @Test(priority = 7)
    public void brokenLinks()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        BrokenLinksPage blp=new BrokenLinksPage(driver);
        blp.clickingBrokenLinks(driver);
    }

    @Test(priority = 8)
    public void upload() throws InterruptedException {

        UploadPage up=new UploadPage(driver);
        up.getElementEdt().click();
        up.uploadingFile(driver);
    }

    @Test(priority = 9)
    public void fillingForm() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,500)");
        FormsPage fp=new FormsPage(driver);
        fp.getFormsLink().click();
        fp.fillingForm(driver,"Nisha","ms","nishams@gmail.com","9986654241","wertyugfgh");
    }


}
