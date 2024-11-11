package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.ButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons extends BaseClass
{
    @Test
    public void buttons()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        ButtonPage bp=new ButtonPage(driver);
        bp.clickingButtons(driver);
    }
}
