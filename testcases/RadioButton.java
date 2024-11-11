package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.RadioButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends BaseClass
{
    @Test
    public void radioButton()
    {
        RadioButtonPage rb=new RadioButtonPage(driver);
        rb.clickingRadioButton(driver);
    }
}
