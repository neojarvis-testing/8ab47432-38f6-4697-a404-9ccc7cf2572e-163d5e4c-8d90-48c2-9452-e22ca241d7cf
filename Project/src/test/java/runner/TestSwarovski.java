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
import pages.SwarovskiHomePage;
import pages.SwarovskiWatchesPage;
import pages.EarringsHomePage;
import pages.HomePageFooter;
import pages.SwarovskiBirdPage;
import pages.SwarovskiSunglassesPage;
import utils.Base;
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
    public void test1() {
        test = report.createTest("Sunglasses");
        SwarovskiSunglassesPage s = new SwarovskiSunglassesPage(test);
        s.testcase3();
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

    @Test
    public void test2() {
        test = report.createTest("Birds");
        SwarovskiBirdPage sd = new SwarovskiBirdPage(test);
        sd.Birds();
    }

@Test(enabled = true)
public void testpendants(){
    test=report.createTest("Swarovski_testpendants");
    SwarovskiHomePage swarovskiHomePage= new SwarovskiHomePage(test);
    swarovskiHomePage.testPendants();
}
@Test(enabled = true)
public void testwatches(){
    test=report.createTest("Swarovski_testwatches");
    SwarovskiWatchesPage swarovskiWatchesPage= new SwarovskiWatchesPage(test);
    swarovskiWatchesPage.testWatches();
}
    @Test
    public void test7() {
        EarringsHomePage ehp = new EarringsHomePage(test);
        ehp.testcase7();
    }

    @Test
    public void test8() {
        HomePageFooter home = new HomePageFooter(test);
        home.testCase8();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

    @AfterClass
    public void flushi() {
        report.flush();
    }

}
