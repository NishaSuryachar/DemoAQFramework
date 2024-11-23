package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage
{
    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    private WebElement DD1;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[2]")
    private WebElement DD2;

    @FindBy(id = "oldSelectMenu")
    private WebElement DD3;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[3]")
    private WebElement DD4;

    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    private WebElement op1;

    @FindBy(xpath = "//div[text()='Prof.']")
    private WebElement op2;

    public SelectMenuPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void performingSelectMenu(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        DD1.click();
        op1.click();
        Thread.sleep(2000);
        DD2.click();
        op2.click();
        Select s=new Select(DD1);
        s.selectByValue("1");


    }
}
