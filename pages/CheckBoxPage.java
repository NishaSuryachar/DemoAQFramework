package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage
{
    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@aria-label='Toggle']")
    private WebElement HomecheckBoxEdt;

    @FindBy(xpath = "//span[@class='rct-checkbox']")
    private WebElement subCheckBoxEdt;

    public CheckBoxPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getSubCheckBoxEdt() {
        return subCheckBoxEdt;
    }

    public WebElement getHomecheckBoxEdt() {
        return HomecheckBoxEdt;
    }

    public void clickingCheckBox(WebDriver driver)
    {
        checkBox.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        HomecheckBoxEdt.click();
        subCheckBoxEdt.click();

    }
}

