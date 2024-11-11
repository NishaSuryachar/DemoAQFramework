package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CheckBox extends BaseClass
{
    @Test
    public void checkBox()
    {
        CheckBoxPage cb=new CheckBoxPage(driver);
        cb.clickingCheckBox(driver);
    }
}

