package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabsPage
{
    @FindBy(xpath = "//a[text()='What']")
    private WebElement whatLink;

    @FindBy(xpath = "//a[text()='Origin']")
    private WebElement OriginLink;

    @FindBy(xpath = "//a[text()='Use']")
    private WebElement UseLink;

    @FindBy(xpath = "//a[@aria-controls='demo-tabpane-more']")
    private WebElement MoreLink;

    public TabsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void tabs(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        whatLink.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        OriginLink.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        UseLink.click();

    }
}
