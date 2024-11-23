package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage
{
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsTitleEdt;

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMessageEdt;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesTitleEdt;

    @FindBy(id = "frame1")
    private WebElement frameEdt;

    @FindBy(xpath = "(//h1[@id='sampleHeading' and text()='This is a sample page'])[1]")
    private WebElement sampleHeadingEdt;

    public FramesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFrameEdt() {
        return frameEdt;
    }

    public WebElement getFramesTitleEdt() {
        return framesTitleEdt;
    }

    public WebElement getAlertsMessageEdt() {
        return alertsMessageEdt;
    }

    public WebElement getAlertsTitleEdt() {
        return alertsTitleEdt;
    }

    public void performingFrames(WebDriver driver)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        alertsTitleEdt.click();
        js.executeScript("window.scrollBy(0,100)");
        framesTitleEdt.click();
        js.executeScript("window.scrollBy(0,100)");
        driver.switchTo().frame(frameEdt);
        System.out.println(sampleHeadingEdt.getText());





    }
}
