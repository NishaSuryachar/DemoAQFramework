package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.FormsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ElementsMain extends BaseClass
{
    @Test
    public void textBox()
    {
        driver.findElement(By.xpath("(//li[@class='btn btn-light ' and @id='item-0'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Nisha");
        driver.findElement(By.id("userEmail")).sendKeys("nisha123@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("abc 13th cross");
        driver.findElement(By.id("permanentAddress")).sendKeys("abc 13th cross");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000);");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

    @Test
    public void checkBox()
    {
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
    }

    @Test
    public void radioButton()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        WebElement radio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
        js.executeScript("arguments[0].click();",radio);
    }

    @Test
    public void webTables()
    {
        String ExpectedFirstName = "First Name";
        String ExpectedLastName = "Last Name";
        String ExpectedAge = "Age";
        String ExpectedEmail = "Email";
        String ExpectedSalary = "Salary";
        String ExpectedDepartment = "Department";
        String ExpectedAction = "Action";
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Nisha");
        driver.findElement(By.id("lastName")).sendKeys("ms");
        driver.findElement(By.id("userEmail")).sendKeys("nishams123@gmail.com");
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.id("salary")).sendKeys("25000");
        driver.findElement(By.id("department")).sendKeys("Insurance");
        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
        js.executeScript("arguments[0].click();",submit);
        String actualFirstName = driver.findElement(By.xpath("//div[text()='First Name']")).getText();
        Assert.assertEquals(actualFirstName, ExpectedFirstName);
        String actualLastName = driver.findElement(By.xpath("//div[text()='Last Name']")).getText();
        Assert.assertEquals(actualLastName,ExpectedLastName);
        String actualAge = driver.findElement(By.xpath("//div[text()='Age']")).getText();
        Assert.assertEquals(actualAge, ExpectedAge);
        String actualEmail = driver.findElement(By.xpath("//div[text()='Email']")).getText();
        Assert.assertEquals(actualEmail,ExpectedEmail);
        String actualSalary = driver.findElement(By.xpath("//div[text()='Salary']")).getText();
        Assert.assertEquals(actualSalary,ExpectedSalary);
        String actualDepartment = driver.findElement(By.xpath("//div[text()='Department']")).getText();
        Assert.assertEquals(actualDepartment,ExpectedDepartment);
        String actualAction = driver.findElement(By.xpath("//div[text()='Action']")).getText();
        Assert.assertEquals(actualAction,ExpectedAction);
        //driver.findElement(By.xpath("//div[text()='Vega']/ancestor::div[@class='rt-tr -odd']/descendant::span[@title='Delete']")).click();

    }

    @Test
    public void buttons()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//span[text()='Buttons']")).click();
        Actions a=new Actions(driver);
        a.doubleClick(driver.findElement(By.xpath("//button[text()='Double Click Me']"))).perform();
        js.executeScript("window.scrollBy(0,500)");
        a.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).perform();
        js.executeScript("window.scrollBy(0,500)");
        WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
        a.moveToElement(click).perform();
        click.click();
    }

    @Test
    public void forms()
    {
        FormsPage fp=new FormsPage(driver);
        fp.getFormsLink().click();
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Nisha");
        driver.findElement(By.id("lastName")).sendKeys("ms");
        driver.findElement(By.id("userEmail")).sendKeys("nishams123@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("userNumber")).sendKeys("7777777777");
        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement yearDD = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select s1=new Select(yearDD);
        s1.selectByValue("1994");
        WebElement monthDD = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select s2=new Select(monthDD);
        s2.selectByValue("9");
        driver.findElement(By.xpath("(//div[text()='9'])[1]")).click();
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();
    }


}
