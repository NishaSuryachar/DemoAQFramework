package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BrokenLinksPage
{
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementEdt;

    @FindBy(xpath = "//span[text()='Broken Links - Images']")
    private WebElement brokenLinkTabEdt;

    @FindBy(xpath = "//a[text()='Click Here for Valid Link']")
    private WebElement ValidLinkTabEdt;

    @FindBy(xpath = "//a[text()='Click Here for Broken Link']")
    private WebElement brokenLinkEdt;

    public BrokenLinksPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getBrokenLinkTabEdt() {
        return brokenLinkTabEdt;
    }

    public WebElement getValidLinkTabEdt() {
        return ValidLinkTabEdt;
    }

    public WebElement getBrokenLinkEdt() {
        return brokenLinkEdt;
    }

    public WebElement getElementEdt() {
        return elementEdt;
    }

    public void clickingBrokenLinks(WebDriver driver)
    {
        elementEdt.click();
        brokenLinkTabEdt.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        ValidLinkTabEdt.click();
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,500)");
        brokenLinkEdt.click();
    }
}
