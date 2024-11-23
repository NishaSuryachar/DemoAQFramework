package com.Qapitol.testcases;

import com.Qapitol.base.BaseClassMock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Cricbuzz extends BaseClassMock {
    @Test
    public void cricbuzz() {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        List<WebElement> teamsName = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-name']"));
        List<WebElement> pts = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-td text-bold']"));
        for (int i = 0; i < pts.size(); i++)
        {
            String pointsText = pts.get(i).getText();
            int points = Integer.parseInt(pointsText);
            if (points >= 9)
            {
                String teamName = teamsName.get(i).getText();
                System.out.println(teamName +":"+ points);
            }
        }
        driver.quit();
    }
}

