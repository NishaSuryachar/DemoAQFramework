package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPage
{
    @FindBy(id = "datePickerMonthYearInput")
    private WebElement monthYearInputEdt;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    private WebElement yearDDEdt;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    private WebElement monthDDEdt;

    @FindBy(xpath = "//div[@aria-label='Choose Sunday, October 9th, 1994']")
    private WebElement dateEdt;

    public DatePickerPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void performingDatePicker()
    {
        monthYearInputEdt.click();
        Select s1=new Select(yearDDEdt);
        s1.selectByValue("1994");
        Select s2=new Select(monthDDEdt);
        s2.selectByValue("9");
        dateEdt.click();
    }
}
