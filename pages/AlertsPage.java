package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage
{
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsTitleEdt;

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMessageEdt;

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsButtonEdt;

    @FindBy(xpath = "//button[text()='Click me' and @id='alertButton']")
    private WebElement alertsOkButton;

    @FindBy(xpath = "//button[text()='Click me' and @id='timerAlertButton']")
    private WebElement WaitAlertButton;

    @FindBy(xpath = "//button[text()='Click me' and @id='confirmButton']")
    private WebElement confirmAlert;

    @FindBy(xpath = "//button[text()='Click me' and @id='promtButton']")
    private WebElement promptAlert;

    public AlertsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAlertsTitleEdt() {
        return alertsTitleEdt;
    }

    public WebElement getAlertsMessageEdt() {
        return alertsMessageEdt;
    }

    public WebElement getAlertsButtonEdt() {
        return alertsButtonEdt;
    }

    public WebElement getAlertsOkButton() {
        return alertsOkButton;
    }

    public WebElement getWaitAlertButton() {
        return WaitAlertButton;
    }

    public WebElement getConfirmAlert() {
        return confirmAlert;
    }

    public WebElement getPromptAlert() {
        return promptAlert;
    }
    public void performingAlerts(WebDriver driver) throws InterruptedException {
        alertsTitleEdt.click();
        alertsMessageEdt.click();
        alertsButtonEdt.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        alertsOkButton.click();
        driver.switchTo().alert().accept();
        WaitAlertButton.click();
       Thread.sleep(6000);
        driver.switchTo().alert().accept();
        js.executeScript("window.scrollBy(0,100)");
        confirmAlert.click();
        driver.switchTo().alert().dismiss();
        js.executeScript("window.scrollBy(0,100)");
        promptAlert.click();
        driver.switchTo().alert().sendKeys("hello good morning");
        driver.switchTo().alert().accept();
    }
}
