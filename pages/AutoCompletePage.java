package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCompletePage
{
    WebDriver driver;
    @FindBy(xpath = "autoCompleteMultipleContainer")
   private WebElement searchBox1;

    @FindBy(xpath = "autoCompleteSingleContainer")
    private WebElement searchBox2;

    public AutoCompletePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void performingAutoCompletePage(String data1,String data2)
    {

        searchBox1.sendKeys(data1);
        searchBox2.sendKeys(data2);
    }

}
