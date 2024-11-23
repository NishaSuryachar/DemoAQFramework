package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class BrowserWindows
{
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsTitleEdt;

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMessageEdt;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowsTitleEdt;

    @FindBy(xpath = "//button[text()='New Tab']")
    private WebElement newTabButton;

    @FindBy(xpath = "//button[text()='New Window']")
    private WebElement newWindowButton;

    @FindBy(xpath = "//button[text()='New Window Message']")
    private WebElement  NewWindowMessageButton;

    @FindBy(xpath = "//h1[text()='This is a sample page']")
    private WebElement sampleTitleEdt1;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    private WebElement sampleMessageEdt2;


    public BrowserWindows(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAlertsTitleEdt() {
        return alertsTitleEdt;
    }

    public WebElement getAlertsMessageEdt() {
        return alertsMessageEdt;
    }

    public WebElement getBrowserWindowsTitleEdt() {
        return browserWindowsTitleEdt;
    }

    public WebElement getNewTabButton() {
        return newTabButton;
    }

    public WebElement getNewWindowButton() {
        return newWindowButton;
    }

    public WebElement getNewWindowMessageButton() {
        return NewWindowMessageButton;
    }

    public WebElement getSampleTitleEdt1() {
        return sampleTitleEdt1;
    }

    public WebElement getSampleMessageEdt2() {
        return sampleMessageEdt2;
    }

    public void performingWindowBrowser(WebDriver driver) throws InterruptedException {
        alertsTitleEdt.click();
        alertsMessageEdt.click();
        browserWindowsTitleEdt.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        newTabButton.click();
        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        child.remove(parent);
        for(String i:child)
        {
            driver.switchTo().window(i);
            System.out.println(sampleTitleEdt1.getText());
            driver.close();
        }
        driver.switchTo().window(parent);
        newWindowButton.click();
        String parent1 = driver.getWindowHandle();
         Set<String> child1 = driver.getWindowHandles();
         child1.remove(parent1);
        for(String i:child1)
        {
           driver.switchTo().window(i);
          System.out.println(sampleMessageEdt2.getText());
          driver.close();
        }
       driver.switchTo().window(parent1);




    }
}
