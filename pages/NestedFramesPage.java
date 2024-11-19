package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPage
{
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsTitleEdt;

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMessageEdt;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    private WebElement nestedFramesTitleEdt;

    @FindBy(id="frame1")
    private WebElement frame1Edt;

    @FindBy(xpath = "//body[text()='Parent frame']")
    private WebElement parentElementEdt;

    @FindBy(xpath="//p[text()='Child Iframe']")
    private WebElement childIframeEdt;


    public NestedFramesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void performingNestedFrames(WebDriver driver)
    {
        alertsTitleEdt.click();
        alertsMessageEdt.click();
        nestedFramesTitleEdt.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        driver.switchTo().frame(frame1Edt);
        System.out.println(parentElementEdt.getText());
        driver.switchTo().frame(0);
        System.out.println(childIframeEdt.getText());
    }

}
