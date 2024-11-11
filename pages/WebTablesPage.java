package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebTablesPage
{
    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesLink;

    @FindBy(xpath = "//div[text()='First Name']")
    private WebElement firstNameEdt;

    @FindBy(xpath = "//div[text()='Last Name']")
    private WebElement LastNameEdt;

    @FindBy(xpath = "//div[text()='Age']")
    private WebElement AgeEdt;

    @FindBy(xpath = "//div[text()='Email']")
    private WebElement emailEdt;

    @FindBy(xpath = "//div[text()='Salary']")
    private WebElement salaryEdt;

    @FindBy(xpath = "//div[text()='Department']")
    private WebElement departmentEdt;

    @FindBy(xpath = "//div[text()='Action']")
    private WebElement ActionEdt;

    public WebTablesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getWebTablesLink() {
        return webTablesLink;
    }

    public WebElement getFirstNameEdt() {
        return firstNameEdt;
    }

    public WebElement getActionEdt() {
        return ActionEdt;
    }

    public WebElement getDepartmentEdt() {
        return departmentEdt;
    }

    public WebElement getSalaryEdt() {
        return salaryEdt;
    }

    public WebElement getEmailEdt() {
        return emailEdt;
    }

    public WebElement getAgeEdt() {
        return AgeEdt;
    }

    public WebElement getLastNameEdt() {
        return LastNameEdt;
    }

    public void validatingHeaders()
    {
        String ExpectedFirstName = "First Name";
        String ExpectedLastName = "Last Name";
        String ExpectedAge = "Age";
        String ExpectedEmail = "Email";
        String ExpectedSalary = "Salary";
        String ExpectedDepartment = "Department";
        String ExpectedAction = "Action";
        webTablesLink.click();
        String actualFirstName = firstNameEdt.getText();
        String actualLastNameEdt=LastNameEdt.getText();
        String actualEmailmail = emailEdt.getText();
        String actualAge = AgeEdt.getText();
        String actualAction = ActionEdt.getText();
        String actualSalary = salaryEdt.getText();
        String actualDepartment = departmentEdt.getText();
        System.out.println(actualFirstName);
        Assert.assertEquals(actualFirstName,ExpectedFirstName);
        Assert.assertEquals(actualLastNameEdt,ExpectedLastName);
        Assert.assertEquals(actualAge,ExpectedAge);
        Assert.assertEquals(actualEmailmail,ExpectedEmail);
        Assert.assertEquals(actualAction,ExpectedAction);
        Assert.assertEquals(actualSalary,ExpectedSalary);
        Assert.assertEquals(actualDepartment,ExpectedDepartment);


    }
}
