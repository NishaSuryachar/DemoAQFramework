package com.Qapitol.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class UploadPage
    {
        @FindBy(xpath = "//h5[text()='Elements']")
        private WebElement elementEdt;

        @FindBy(xpath = "//span[text()='Upload and Download']")
        private WebElement uploadDownloadLink;

        @FindBy(xpath = "//a[text()='Download']")
        private WebElement downloadLink;

        @FindBy(xpath = "//input[@id='uploadFile']")
        private WebElement chooseFileLinkEdt;


        public UploadPage(WebDriver driver)
        {
            PageFactory.initElements(driver, this);
        }

        public WebElement getUploadDownloadLink() {
            return uploadDownloadLink;
        }

        public WebElement getDownloadLink() {
            return downloadLink;
        }

        public WebElement getChooseFileLinkEdt() {
            return chooseFileLinkEdt;
        }

        public WebElement getElementEdt() {
            return elementEdt;
        }

        public void uploadingFile(WebDriver driver) throws InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,500)");
            uploadDownloadLink.click();
            downloadLink.click();
            chooseFileLinkEdt.sendKeys("C:\\Users\\Qapitol\\Downloads\\sampleFile.jpeg");

        }

    }

