package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FooterPage;
import pages.SwarovskiAboutUsPage;
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
    public void AboutUs(){
    test=report.createTest("Footer");
    SwarovskiAboutUsPage sp=new SwarovskiAboutUsPage(test);
    sp.execute();
    }   
    @Test
    public void Legal(){
    test=report.createTest("Footer");
    FooterPage fp=new FooterPage(test);
    fp.testing();
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
