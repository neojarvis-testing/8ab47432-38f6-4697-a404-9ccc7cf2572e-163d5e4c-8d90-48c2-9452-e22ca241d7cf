package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import uistore.SwarovskiAboutUsPageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiAboutUsPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiAboutUsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
     * a.Method Name: scrollToAboutswarovski
     * b.Author Name: Sarika
     * c.Description: This method  is used to scroll down to Aboutswarovski .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void scrollToAboutswarovski()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnAboutSwarovski);
            test.log(Status.PASS,"scroll to About Swarovski");
            LoggerHandler.logInfo("scroll to About Swarovski");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to scroll to About Swarovski");
            LoggerHandler.logError("Unable to scroll to About Swarovski");
        }

    }
    /*
     * a.Method Name: clickOnAboutSwarovski
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On About Swarovski .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnAboutSwarovski()
    {
        try {
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnAboutSwarovski, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnAboutSwarovski);
            test.log(Status.PASS,"Clicked on About Swarovski");
            LoggerHandler.logInfo("Clicked on About Swarovski");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on About Swarovski");
            LoggerHandler.logError("Unable to Click on About Swarovski");
        }  
    }
    /*
     * a.Method Name: verifyAboutSwarovskiTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify AboutSwarovski Title .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAboutSwarovskiTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "About Swarovski | Swarovski US");
    }
    /*
     * a.Method Name: verifyAboutSwarovskiUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify AboutSwarovski Url .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAboutSwarovskiUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-brand/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnSustainability
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On Sustainability .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnSustainability()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnSustainability);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnSustainability, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnSustainability);
            test.log(Status.PASS,"Clicked on Sustainability");
            LoggerHandler.logInfo("Clicked on Sustainability");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Sustainability");
            LoggerHandler.logError("Unable to Click on Sustainability");
        }
    }
    /*
     * a.Method Name: verifySustainabilityTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Sustainability Title .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifySustainabilityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Sustainability and Corporate Responsibility  | Swarovski US");
    }
    /*
     * a.Method Name: verifySustainabilityUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Sustainability Url .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifySustainabilityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-sustainability/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnJobsAndCareer
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On JobsAndCareer .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnJobsAndCareer()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnJobsAndCareer);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnJobsAndCareer, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnJobsAndCareer);
            test.log(Status.PASS,"Clicked on JobsAndCareer");
            LoggerHandler.logInfo("Clicked on JobsAndCareer");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on JobsAndCareer");
            LoggerHandler.logError("Unable to Click on JobsAndCareer");
        }
    }
    /*
     * a.Method Name: verifyJobsAndCareerTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify JobsAndCareer Title .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyJobsAndCareerTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Career at Swarovski | Job opportunies | Swarovski US");
    }
    /*
     * a.Method Name: verifyJobsAndCareerUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify JobsAndCareer Url .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyJobsAndCareerUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-careers/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnAlumniCommunityAndSwitch
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On AlumniCommunity And Switch the tab .
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnAlumniCommunityAndSwitch()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnAlumniCommunity);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnAlumniCommunity, 10);
            helper.switchWindow(SwarovskiAboutUsPageLocators.clickOnAlumniCommunity);
            test.log(Status.PASS,"Clicked on AlumniCommunity");
            LoggerHandler.logInfo("Clicked on AlumniCommunity");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on AlumniCommunity");
            LoggerHandler.logError("Unable to Click on AlumniCommunity");
        }
    }
    /*
     * a.Method Name: verifyAlumniCommunityTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify AlumniCommunity Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAlumniCommunityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Landing Page - Swarovski");
    }
    /*
     * a.Method Name: verifyAlumniCommunityUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to  verify AlumniCommunity Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAlumniCommunityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://alumni.swarovski.com/alumni/");
        helper.switchToHome();
    }
    /*
     * a.Method Name: clickOnCorporategifts
     * b.Author Name: Sarika
     * c.Description: This method  is used to  click On Corporategifts.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnCorporategifts()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnCorporategifts);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnCorporategifts, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnCorporategifts);
            test.log(Status.PASS,"Clicked on Corporategifts");
            LoggerHandler.logInfo("Clicked on Corporategifts");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Corporategifts");
            LoggerHandler.logError("Unable to Click on Corporategifts");
        }
    }
    /*
     * a.Method Name: verifyCorporategiftsTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to  verify Corporategifts Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCorporategiftsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski Corporate Gifts & Business Gifts | Swarovski US");
    }
    /*
     * a.Method Name: verifyCorporategiftsUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Corporategifts Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCorporategiftsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-corporate-gifts/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickForProfessional
     * b.Author Name: Sarika
     * c.Description: This method  is used to click For Professional.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickForProfessional()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnForProfessional);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnForProfessional, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnForProfessional);
            test.log(Status.PASS,"Clicked on ForProfessional");
            LoggerHandler.logInfo("Clicked on ForProfessional");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on ForProfessional");
            LoggerHandler.logError("Unable to Click on ForProfessional");
        }
    }
    /*
     * a.Method Name: verifyForProfessionalTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify ForProfessional Page Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyForProfessionalTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski for Professionals | Swarovski US");
    }
    /*
     * a.Method Name: verifyForProfessionalUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify ForProfessional Page Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyForProfessionalUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-professionals/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnSitemap
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On Sitemap.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void clickOnSitemap()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnSitemap);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnSitemap, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnSitemap);
            test.log(Status.PASS,"Clicked on Sitemap");
            LoggerHandler.logInfo("Clicked on Sitemap");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Sitemap");
            LoggerHandler.logError("Unable to Click on Sitemap");
        }
    }
    /*
     * a.Method Name: verifySitemapTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Sitemap Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifySitemapTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Sitemap | Swarovski US");
    }
    /*
     * a.Method Name: verifySitemapUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Sitemap Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifySitemapUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-html-sitemap/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: verifyAboutUs
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify AboutUs.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAboutUs()
    {
        String str=helper.getText(SwarovskiAboutUsPageLocators.clickOnAboutUs);
        Assert.assertEquals(str, "ABOUT US");
        test.log(Status.PASS,"About verified");
        LoggerHandler.logInfo("About verified");
        Screenshot.captureScreenShot("About verified");
        Reporter.logScreenshottoReport(str, test, "About");
    }
    /*
     * Method Name: execute
     * Author name: Sarika
     * Description: Calls all the methods defined above and this method will be called inside runner page for execution.
     * Parameters: none
     * Return type: void
     */
    public void execute()
    {
        scrollToAboutswarovski();
        clickOnAboutSwarovski();
        verifyAboutSwarovskiTitle();
        verifyAboutSwarovskiUrl();
        clickOnSustainability();
        verifySustainabilityTitle();
        verifySustainabilityUrl();
        clickOnJobsAndCareer();
        verifyJobsAndCareerTitle();
        verifyJobsAndCareerUrl();
        clickOnAlumniCommunityAndSwitch();
        verifyAlumniCommunityTitle();
        verifyAlumniCommunityUrl();
        clickOnCorporategifts();
        verifyCorporategiftsTitle();
        verifyCorporategiftsUrl();
        clickForProfessional();
        verifyForProfessionalTitle();
        verifyForProfessionalUrl();
        clickOnSitemap();
        verifySitemapTitle();
        verifySitemapUrl();
        verifyAboutUs();




















    }

}
