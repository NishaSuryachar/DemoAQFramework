package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage
{
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementEdt;

    @FindBy(xpath = "//span[text()='Links']")
    private WebElement linksLinkEdt;

    @FindBy(xpath = "//a[text()='Home' and @id='simpleLink']")
    private WebElement firstLinkEdt;

    public LinksPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLinksLinkEdt() {
        return linksLinkEdt;
    }

    public WebElement getFirstLinkEdt() {
        return firstLinkEdt;
    }

    public WebElement getElementEdt() {
        return elementEdt;
    }

    public void clickingLink()
    {
        elementEdt.click();
        linksLinkEdt.click();
        firstLinkEdt.click();
    }
}
