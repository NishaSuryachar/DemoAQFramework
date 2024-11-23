package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage
{
    @FindBy(xpath = "//a[text()='Main Item 2']")
    private WebElement mainItem2Edt;

    @FindBy(xpath = "//a[text()='SUB SUB LIST »']")
    private WebElement subsubListEdt;

    @FindBy(xpath = "//a[text()='Sub Sub Item 1']")
    private WebElement subsubItem2Edt;

    public MenuPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void performingMenu(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(4000);
        Actions a = new Actions(driver);
        a.moveToElement(mainItem2Edt).perform();
        Thread.sleep(1000);
        a.moveToElement(subsubListEdt).perform();
    }
}
