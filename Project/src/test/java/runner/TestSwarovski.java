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

public class TestSwarovski {

public static ExtentTest test;
public static ExtentReports reports;

@BeforeClass
public void openReport(){
    reports=Reporter.createExtentReport("Swarovski_Report");
}

@AfterClass
public void closeReport(){
    reports.flush();
}

@BeforeMethod
public void launchBrowser(){
    Base.openBrowser();
}
@AfterMethod
public void closeBrowser(){
    Base.driver.quit();
}

@Test
public void test1(){
    test=reports.createTest("Swarovski_testcase1");
    SwarovskiHomePage swarovskiHomePage= new SwarovskiHomePage(test);
    swarovskiHomePage.testPendants();
}

}
