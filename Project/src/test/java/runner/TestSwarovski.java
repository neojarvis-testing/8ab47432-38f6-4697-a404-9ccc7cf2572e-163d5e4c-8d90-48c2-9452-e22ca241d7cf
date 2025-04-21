package runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SwarovskiGiftsPage;
import utils.Base;

public class TestSwarovski extends Base{
    public static ExtentTest test;
    public static ExtentReports report;
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @Test
    public void testCase1(){
        SwarovskiGiftsPage giftsPage = new SwarovskiGiftsPage(test);
        giftsPage.testSwarovskiGiftsPage();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }

}
