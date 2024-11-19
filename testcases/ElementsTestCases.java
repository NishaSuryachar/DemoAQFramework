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

    @Test
    public void brokenLinks()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        BrokenLinksPage blp=new BrokenLinksPage(driver);
        blp.clickingBrokenLinks(driver);
    }

    @Test
    public void upload() throws InterruptedException {

        UploadPage up=new UploadPage(driver);
        up.getElementEdt().click();
        up.uploadingFile(driver);
    }

    @Test
    public void fillingForm() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        FormsPage fp=new FormsPage(driver);
        fp.getFormsLink().click();
        fp.getPracticeFormEdt().click();
        js.executeScript("window.scrollBy(0,200)");
        ExcelUtil eutil=new ExcelUtil();
        String fname = eutil.getDataFromExcel("Sheet1", 4, 0);
        String lname = eutil.getDataFromExcel("Sheet1", 4, 1);
        String email = eutil.getDataFromExcel("Sheet1", 4, 2);
        String phoneNo = eutil.getDataFromExcel("Sheet1", 4, 3);
        String address = eutil.getDataFromExcel("Sheet1", 4, 4);
        fp.fillingForm(driver,fname,lname,email,phoneNo,address);
    }


}
