package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage
{
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementEdt;

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

    public WebElement getElementEdt() {
        return elementEdt;
    }

    public void clickingButtons(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        elementEdt.click();
        buttonEdt.click();
        Actions a=new Actions(driver);
        a.doubleClick(doubleClickButtonEdt).perform();
        js.executeScript("window.scrollBy(0,500)");
        a.contextClick(rightClickButtonEdt).perform();

        js.executeScript("window.scrollBy(0,500)");
        a.moveToElement(clickButtonEdt).perform();

    }
}
