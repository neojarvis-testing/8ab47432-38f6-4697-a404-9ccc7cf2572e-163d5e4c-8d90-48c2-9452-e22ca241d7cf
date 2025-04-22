package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SwarovskiDiamondsPage;
import pages.SwarovskiGiftsPage;
import utils.Base;
import utils.ExcelReader;
import utils.Reporter;

public class TestSwarovski extends Base {
    public static ExtentTest test;
    public static ExtentReports report;
    @BeforeClass
    public void generate(){
        report = Reporter.createExtentReport("Swarovski Test");
    }
    @BeforeMethod
    public void open(){
        openBrowser();
    }
     @Test
    public void testCase5(){
        test=report.createTest("Test Case 5");
        SwarovskiGiftsPage giftsPage = new SwarovskiGiftsPage(test);
        giftsPage.testSwarovskiGiftsPage();
    }
    @Test
    public void testCase6(){
         test=report.createTest("Test Case 6");
        SwarovskiDiamondsPage diamondPage = new SwarovskiDiamondsPage(test);
        diamondPage.testSwarovskiDiamondPage();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass
    public void flush(){
        report.flush();
    }

}
