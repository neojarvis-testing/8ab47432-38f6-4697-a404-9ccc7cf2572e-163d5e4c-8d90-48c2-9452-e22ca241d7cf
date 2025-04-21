package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.SwarovskiHomePage;
import utils.Base;
import utils.Reporter;

public class TestSwarovski extends Base {
    public static ExtentTest test;
    public  static ExtentReports report;
    @BeforeClass
    public void generateReport(){
        report=Reporter.createExtentReport("Report");
    }
    @BeforeMethod
    public void openb(){
        openBrowser();
    }
    @Test
    public void test1(){
    test=report.createTest("test1");
    SwarovskiHomePage s=new SwarovskiHomePage(test);
    s.testcase3();
    }    
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass 
    public  void flushi(){
        report.flush();
    }
    



}
