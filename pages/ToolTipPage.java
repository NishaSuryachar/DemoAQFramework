package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTipPage
{
    @FindBy(xpath = "//button[text()='Hover me to see']")
    private WebElement HoverMeToSeeEdt;

    @FindBy(xpath = "//div[text()='You hovered over the Button']")
    private WebElement toolTipEdt;


    public ToolTipPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void tooltip(WebDriver driver)
    {
        Actions a= new Actions(driver);
        a.moveToElement(HoverMeToSeeEdt).perform();
        System.out.println(toolTipEdt.getText());
    }
}
