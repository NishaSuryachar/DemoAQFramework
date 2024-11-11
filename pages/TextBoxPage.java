package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage
{
    @FindBy(xpath = "(//li[@class='btn btn-light ' and @id='item-0'])[1]")
    private WebElement checkBoxEdt;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    private WebElement FirstNameEdt;

    @FindBy(id = "userEmail")
    private WebElement emailEdt;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressEdt;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressEdt;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitEdt;


    public TextBoxPage(WebDriver driver)
    {
        PageFactory.initElements( driver, this );
    }

    public WebElement getCheckBoxEdt() {
        return checkBoxEdt;
    }

    public WebElement getFirstNameEdt() {
        return FirstNameEdt;
    }

    public WebElement getEmailEdt() {
        return emailEdt;
    }

    public WebElement getCurrentAddressEdt() {
        return currentAddressEdt;
    }

    public WebElement getPermanentAddressEdt() {
        return permanentAddressEdt;
    }

    public WebElement getSubmitEdt() {
        return submitEdt;
    }

    public void textBox(WebDriver driver,String firstname,String email,String currentAddress,String permanentAddress)
    {
        checkBoxEdt.click();
        FirstNameEdt.sendKeys("Nisha");
        emailEdt.sendKeys("nisha@gmail.com");
        currentAddressEdt.sendKeys("1st phase");
        permanentAddressEdt.sendKeys("1st phase");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000);");
        submitEdt.click();
    }
}
