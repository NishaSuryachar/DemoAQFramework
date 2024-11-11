package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage
{
    @FindBy(xpath = "//span[text()='Radio Button']")
    private WebElement radioButtonEdt;

    @FindBy(xpath = "//input[@id='yesRadio']")
    private WebElement yesButtonEdt;

    public RadioButtonPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getRadioButtonEdt() {
        return radioButtonEdt;
    }

    public WebElement getYesButtonEdt() {
        return yesButtonEdt;
    }

    public void clickingRadioButton(WebDriver driver)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        radioButtonEdt.click();
        js.executeScript("arguments[0].click();",yesButtonEdt);

    }
}
