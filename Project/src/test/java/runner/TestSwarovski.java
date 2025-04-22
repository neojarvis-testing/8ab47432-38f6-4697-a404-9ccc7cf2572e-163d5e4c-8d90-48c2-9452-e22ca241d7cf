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
     
 /*
* A. Test 
* B. Author name : Kartik Bameta
* C. Description : This test is to test the Gifts in the nav bar.
*/ 
@Test(enabled = true)
public void testswarovskiGiftsPage(){
    test=report.createTest("testswarovskiGiftsPage");
    SwarovskiGiftsPage giftsPage = new SwarovskiGiftsPage(test);
    giftsPage.testSwarovskiGiftsPage();
}
/*
* A. Test 
* B. Author name : Kartik Bameta
* C. Description : This test is to test the Swarovski cerated Diamond in the nav bar.
*/ 
@Test(enabled = true)
public void testswarovskiDiamondPage(){
    test=report.createTest("testswarovskiDiamondPage");
    SwarovskiDiamondsPage diamondPage = new SwarovskiDiamondsPage(test);
    diamondPage.testSwarovskiDiamondPage();
}



/*
* A. Test 
* B. Author name : Sarika
* C. Description : This test is to test the About Us section in footer.
*/ 
@Test(enabled = true)
public void AboutUs() {
    test = report.createTest("AboutUs");
    SwarovskiAboutUsPage swarovskiAboutUsPage = new SwarovskiAboutUsPage(test);
    swarovskiAboutUsPage.execute();
}

/*
* A. Test 
* B. Author name : Sarika
* C. Description : This test is to test the About Us section in footer.
*/ 
@Test(enabled = true)
public void Legal() {
    test = report.createTest("Footer");
    FooterPage footerPage = new FooterPage(test);
    footerPage.testing();
}

/*
* A. Test 
* B. Author name : Sarika
* C. Description : This test is to test the LEGAL section in footer.
*/
@Test(enabled = true)
public void testsunglass() {
    test = report.createTest("Sunglasses");
    SwarovskiSunglassesPage swarovskiSunglassesPage = new SwarovskiSunglassesPage(test);
    swarovskiSunglassesPage.testSunglass();
}
/*
* A. Test 
* B. Author name : Poojita
* C. Description : This test is to test the Birds section under the decoration in nav bar.
*/  
@Test(enabled = true)
public void testBirds() {
    test = report.createTest("Birds");
    SwarovskiBirdPage swarovskiBirdPage = new SwarovskiBirdPage(test);
    swarovskiBirdPage.Birds();
}
/*
* A. Test 
* B. Author name : Md Safiur Rahaman
* C. Description : This test is to test the Pendants section under the jwelleries in nav bar.
*/    
@Test(enabled = true)
public void testpendants(){
    test=report.createTest("Swarovski_testpendants");
    SwarovskiHomePage swarovskiHomePage= new SwarovskiHomePage(test);
    swarovskiHomePage.testPendants();
}

/*
* A. Test 
* B. Author name : Md Safiur Rahaman
* C. Description : This test is to test the Watches in nav bar.
*/
@Test(enabled = true)
public void testwatches(){
    test=report.createTest("Swarovski_testwatches");
    SwarovskiWatchesPage swarovskiWatchesPage= new SwarovskiWatchesPage(test);
    swarovskiWatchesPage.testWatches();
}

/*
* A. Test 
* B. Author name : Nischit
* C. Description : This test is to search earrings in the search bar.
*/
@Test(enabled = true)
public void testearings() {
    test=report.createTest("testEarings");
    EarringsHomePage earringsHomePage = new EarringsHomePage(test);
    earringsHomePage.testEarings();
}

/*
* A. Test 
* B. Author name : Nischit
* C. Description : This test is to test the Customer service section.
*/
@Test(enabled = true)
public void testFooter() {
    test=report.createTest("testFooter");
    HomePageFooter homePageFooter = new HomePageFooter(test);
    homePageFooter.testFooter();
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
