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

import pages.SwarovskiDiamondsPage;
import pages.SwarovskiGiftsPage;
import pages.SwarovskiHomePage;
import pages.SwarovskiWatchesPage;
import pages.EarringsHomePage;
import pages.HomePageFooter;
import pages.SwarovskiBirdPage;
import pages.SwarovskiSunglassesPage;

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
     
    
@Test(enabled = true)
public void testswarovskiGiftsPage(){
    test=report.createTest("Test Case 5");
    SwarovskiGiftsPage giftsPage = new SwarovskiGiftsPage(test);
    giftsPage.testSwarovskiGiftsPage();
}
@Test(enabled = true)
public void testswarovskiDiamondPage(){
        test=report.createTest("Test Case 6");
    SwarovskiDiamondsPage diamondPage = new SwarovskiDiamondsPage(test);
    diamondPage.testSwarovskiDiamondPage();
}




@Test(enabled = true)
public void AboutUs() {
    test = report.createTest("Footer");
    SwarovskiAboutUsPage sp = new SwarovskiAboutUsPage(test);
    sp.execute();
}

@Test(enabled = true)
public void Legal() {
    test = report.createTest("Footer");
    FooterPage fp = new FooterPage(test);
    fp.testing();
}


@Test(enabled = true)
public void testsunglass() {
    test = report.createTest("Sunglasses");
    SwarovskiSunglassesPage s = new SwarovskiSunglassesPage(test);
    s.testSunglass();
}
    
@Test(enabled = true)
public void testBirds() {
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
@Test(enabled = true)
public void testearings() {
    test=report.createTest("testEarings");
    EarringsHomePage ehp = new EarringsHomePage(test);
    ehp.testEarings();
}

@Test(enabled = true)
public void testFooter() {
    test=report.createTest("testFooter");
    HomePageFooter home = new HomePageFooter(test);
    home.testFooter();
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
