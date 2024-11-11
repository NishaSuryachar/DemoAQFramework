package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage
{
    @FindBy(xpath = "//span[text()='Buttons']")
    private WebElement buttonEdt;

    @FindBy(xpath = "//button[text()='Double Click Me']")
    private WebElement doubleClickButtonEdt;

    @FindBy(xpath = "//button[text()='Right Click Me']")
    private WebElement rightClickButtonEdt;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement clickButtonEdt;

    public ButtonPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getButtonEdt() {
        return buttonEdt;
    }

    public WebElement getDoubleClickButtonEdt() {
        return doubleClickButtonEdt;
    }

    public WebElement getRightClickButtonEdt() {
        return rightClickButtonEdt;
    }

    public WebElement getClickButtonEdt() {
        return clickButtonEdt;
    }

    public void clickingButtons(WebDriver driver)
    {
        buttonEdt.click();
        Actions a=new Actions(driver);
        a.moveToElement(doubleClickButtonEdt).perform();
        a.moveToElement(rightClickButtonEdt).perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        a.moveToElement(clickButtonEdt).perform();

    }
}
