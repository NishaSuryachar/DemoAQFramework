package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.*;
import com.Qapitol.util.ListenerImplementation;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;


@Listeners(ListenerImplementation.class)
public class Widgets extends BaseClass
{
    @Test
    public void accordian() throws IOException, InterruptedException {WidgetsPage wp=new WidgetsPage(driver);
       wp.getWidgetsLink().click();
       wp.getAccordianLink().click();
       AccordianPage ap=new AccordianPage(driver);
       ap.performingAccordian();
    }

    @Test
    public void datePicker() throws IOException, InterruptedException {WidgetsPage wp=new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        wp.getDatePickerLink().click();
        DatePickerPage dp=new DatePickerPage(driver);
        dp.performingDatePicker();
    }

    @Test
    public void slider() throws IOException, InterruptedException {
        WidgetsPage wp = new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        wp.getSliderLink().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100);");
        SliderPage sp=new SliderPage(driver);
    }

    @Test
    public void progressBar() throws IOException, InterruptedException {
        WidgetsPage wp = new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        wp.getProgressBarLink().click();
        ProgressBarBar pb=new ProgressBarBar(driver);
        pb.progressBar();
    }

    @Test
    public void tabs() throws IOException, InterruptedException {
        WidgetsPage wp = new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        wp.getTabsLink().click();
        TabsPage tp=new TabsPage(driver);
        tp.tabs(driver);

    }

    @Test
    public void tooltip() throws IOException, InterruptedException {
        WidgetsPage wp = new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        wp.getToolTipsLink().click();
        ToolTipPage tp=new ToolTipPage(driver);
        tp.tooltip(driver);

    }

    @Test
    public void menu() throws IOException, InterruptedException {
        WidgetsPage wp = new WidgetsPage(driver);
        wp.getWidgetsLink().click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        wp.getMenuLink().click();
        js.executeScript("window.scrollBy(0,500);");
        MenuPage mp=new MenuPage(driver);
        mp.performingMenu(driver);
    }


}
