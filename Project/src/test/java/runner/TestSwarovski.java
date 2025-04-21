package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.EarringsHomePage;
import pages.HomePageFooter;
import utils.Base;
import utils.Reporter;

public class TestSwarovski extends Base{
ExtentTest test;
ExtentReports report;
@BeforeClass
    public void createReport(){
        report = Reporter.createExtentReport("report");
    }
@BeforeMethod
    public void open(){
        test=report.createTest("testcase7");
        openBrowser();
    }
@Test
public void test7(){
    EarringsHomePage ehp = new EarringsHomePage(test);
    ehp.testcase7();
}    
@Test
public void test8(){
    HomePageFooter home=new HomePageFooter(test);
    home.testCase8();
}
@AfterMethod
public void quit(){
    driver.quit();
}
@AfterClass
public void flush(){
    report.flush();
}   
}
