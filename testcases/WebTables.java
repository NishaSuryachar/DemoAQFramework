package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.WebTablesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WebTables extends BaseClass
{
    @Test
    public void webTables()
    {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        WebTablesPage wbp = new WebTablesPage(driver);
        wbp.validatingHeaders();
    }
}
