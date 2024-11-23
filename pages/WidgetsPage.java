package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage
{
   @FindBy(xpath = "//h5[text()='Widgets']")
   private WebElement widgetsLink;

    @FindBy(xpath = "//span[text()='Accordian']")
    private WebElement accordianLink;

    @FindBy(xpath = "//span[text()='Auto Complete']")
    private WebElement autoCompleteLink;

    @FindBy(xpath = "//span[text()='Date Picker']")
    private WebElement DatePickerLink;

    @FindBy(xpath = "//span[text()='Slider']")
    private WebElement SliderLink;

    @FindBy(xpath = "//span[text()='Progress Bar']")
    private WebElement ProgressBarLink;

    @FindBy(xpath = "//span[text()='Tabs']")
    private WebElement TabsLink;

    @FindBy(xpath = "//span[text()='Tool Tips']")
    private WebElement ToolTipsLink;

    @FindBy(xpath = "//span[text()='Menu']")
    private WebElement MenuLink;

    @FindBy(xpath = "//span[text()='Select Menu']")
    private WebElement SelectMenuLink;

    public WidgetsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getWidgetsLink() {
        return widgetsLink;
    }

    public WebElement getSelectMenuLink() {
        return SelectMenuLink;
    }

    public WebElement getMenuLink() {
        return MenuLink;
    }

    public WebElement getToolTipsLink() {
        return ToolTipsLink;
    }

    public WebElement getTabsLink() {
        return TabsLink;
    }

    public WebElement getProgressBarLink() {
        return ProgressBarLink;
    }

    public WebElement getSliderLink() {
        return SliderLink;
    }

    public WebElement getAutoCompleteLink() {
        return autoCompleteLink;
    }

    public WebElement getDatePickerLink() {
        return DatePickerLink;
    }

    public WebElement getAccordianLink() {
        return accordianLink;
    }
}
