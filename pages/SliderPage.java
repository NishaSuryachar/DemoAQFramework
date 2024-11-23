package com.Qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Qapitol.base.BaseClass.driver;

public class SliderPage
{
    @FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
    private WebElement slider2;

    @FindBy(xpath = "//div[@class='range-slider__tooltip__label']")
    private WebElement slider3;

    public SliderPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void performingSlider()
    {
        Actions act = new Actions(driver);
        System.out.println(slider2.getLocation());
        act.clickAndHold(slider2).moveByOffset(400 - 337, 0).release().perform();
    }


}
