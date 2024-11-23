package com.Qapitol.testcases;

import com.Qapitol.base.BaseClass;
import com.Qapitol.pages.*;
import com.Qapitol.util.ExcelUtil;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class AlertsTest extends BaseClass
{
    @Test(priority = 1)
    public void alerts() throws IOException, InterruptedException {
        AlertsPage at = new AlertsPage(driver);
        at.performingAlerts(driver);
    }

    @Test(priority = 2)
    public void browserWindow() throws IOException, InterruptedException {
        BrowserWindows bw=new BrowserWindows(driver);
        bw.performingWindowBrowser(driver);
    }

    @Test(priority = 3)
    public void frames() throws IOException, InterruptedException {
        FramesPage fp=new FramesPage(driver);
        fp.performingFrames(driver);
    }

    @Test(priority = 3)
    public void nestedFrames() throws IOException, InterruptedException {
        NestedFramesPage nfp=new NestedFramesPage(driver);
        nfp.performingNestedFrames(driver);
    }





}
