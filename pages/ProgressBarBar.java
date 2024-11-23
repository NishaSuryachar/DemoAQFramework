package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarBar
{
    @FindBy(id = "startStopButton")
    private WebElement startAndStopButton;

    public ProgressBarBar(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void progressBar() throws InterruptedException {
        startAndStopButton.click();
        Thread.sleep(4000);
        startAndStopButton.click();
    }
}
