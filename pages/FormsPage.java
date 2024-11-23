package com.Qapitol.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsLink;

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormEdt;

    @FindBy(id = "firstName")
    private WebElement firstNameEdt;

    @FindBy(id = "lastName")
    private WebElement lastNameEdt;

    @FindBy(id = "userEmail")
    private WebElement emailEdt;

    @FindBy(id = "userNumber")
    private WebElement PhNoEdt;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dob;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    private WebElement monthDDEdt;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    private WebElement yearDDEdt;

    @FindBy(xpath = "(//div[text()='9'])[1]")
    private WebElement dateEdt;

   @FindBy(xpath = "//div[@class='subjects-auto-complete__control css-yk16xz-control']")
   private WebElement subjectEdt;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
    private WebElement hobbiesEdt;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement uploadLinkEdt;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    private WebElement currentAddressEdt;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    private WebElement stateEdt;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitBtnEdt;

    public WebElement getPracticeFormEdt() {
        return practiceFormEdt;
    }

    public FormsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFormsLink() {
        return formsLink;
    }

    public WebElement getSubjectEdt() {
        return subjectEdt;
    }

    public WebElement getFirstNameEdt() {
        return firstNameEdt;
    }

    public WebElement getLastNameEdt() {
        return lastNameEdt;
    }

    public WebElement getEmailEdt() {
        return emailEdt;
    }



    public WebElement getPhNoEdt() {
        return PhNoEdt;
    }

    public WebElement getDob() {
        return dob;
    }

    public WebElement getMonthDDEdt() {
        return monthDDEdt;
    }

    public WebElement getYearDDEdt() {
        return yearDDEdt;
    }

    public WebElement getDateEdt() {
        return dateEdt;
    }

    public WebElement getCurrentAddressEdt() {
        return currentAddressEdt;
    }

    public WebElement getUploadLinkEdt() {
        return uploadLinkEdt;
    }

    public WebElement getHobbiesEdt() {
        return hobbiesEdt;
    }

    public WebElement getStateEdt() {
        return stateEdt;
    }

    public WebElement getSubmitBtnEdt() {
        return submitBtnEdt;
    }

    public void fillingForm(WebDriver driver,String fname,String lname,String email,String phno,String address) throws InterruptedException {
        firstNameEdt.sendKeys(fname);
        lastNameEdt.sendKeys(lname);
        emailEdt.sendKeys(email);
        PhNoEdt.sendKeys(phno);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        dob.click();
        Select s1=new Select(yearDDEdt);
        s1.selectByValue("1994");
        Select s2=new Select(monthDDEdt);
        s2.selectByValue("9");
        getDateEdt().click();
       uploadLinkEdt.sendKeys("C:\\Users\\Qapitol\\Downloads\\sampleFile.jpeg");
       currentAddressEdt.sendKeys(address);
        js.executeScript("window.scrollBy(0,200)");
       submitBtnEdt.click();
    }
}
