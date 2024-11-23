package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordianPage
{
    WebDriver driver=null;
    @FindBy(xpath = "//div[text()='What is Lorem Ipsum?']")
    private WebElement FirstLink;

    @FindBy(xpath = "//div[text()='Where does it come from?']")
    private WebElement secondLink;

    @FindBy(xpath = "//div[text()='Why do we use it?']")
    private WebElement thirdLink;

    @FindBy(id = "section1Content")
    private WebElement section1;

    @FindBy(xpath = "//div[@id=\"section2Content\"]")
    private WebElement section2;

    @FindBy(id = "section3Content")
    private WebElement section3;

    public AccordianPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void performingAccordian()
    {
        FirstLink.click();
        System.out.println(section1.getText());
        FirstLink.click();
        thirdLink.click();
        System.out.println(section3.getText());
    }
}
