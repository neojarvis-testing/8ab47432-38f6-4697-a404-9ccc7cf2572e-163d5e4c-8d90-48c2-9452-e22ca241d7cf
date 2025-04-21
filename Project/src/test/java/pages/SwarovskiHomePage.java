package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiHomePage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void scrollToAboutswarovski()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnAboutSwarovski);
            test.log(Status.PASS,"scroll to About Swarovski");
            LoggerHandler.logInfo("scroll to About Swarovski");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to scroll to About Swarovski");
            LoggerHandler.logError("Unable to scroll to About Swarovski");
        }

    }
    public void clickOnAboutSwarovski()
    {
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAboutSwarovski, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnAboutSwarovski);
            test.log(Status.PASS,"Clicked on About Swarovski");
            LoggerHandler.logInfo("Clicked on About Swarovski");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on About Swarovski");
            LoggerHandler.logError("Unable to Click on About Swarovski");
        }  
    }
    public void verifyAboutSwarovskiTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "About Swarovski | Swarovski US");
    }
    public void verifyAboutSwarovskiUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-brand/");
        helper.navigateBack();
    }
    public void clickOnSustainability()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnSustainability);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnSustainability, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnSustainability);
            test.log(Status.PASS,"Clicked on Sustainability");
            LoggerHandler.logInfo("Clicked on Sustainability");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Sustainability");
            LoggerHandler.logError("Unable to Click on Sustainability");
        }
    }
    public void verifySustainabilityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Sustainability and Corporate Responsibility  | Swarovski US");
    }
    public void verifySustainabilityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-sustainability/");
        helper.navigateBack();
    }
    public void clickOnJobsAndCareer()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnJobsAndCareer);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnJobsAndCareer, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnJobsAndCareer);
            test.log(Status.PASS,"Clicked on JobsAndCareer");
            LoggerHandler.logInfo("Clicked on JobsAndCareer");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on JobsAndCareer");
            LoggerHandler.logError("Unable to Click on JobsAndCareer");
        }
    }
    public void verifyJobsAndCareerTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Career at Swarovski | Job opportunies | Swarovski US");
    }
    public void verifyJobsAndCareerUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-careers/");
        helper.navigateBack();
    }
    public void clickOnAlumniCommunityAndSwitch()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnAlumniCommunity);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAlumniCommunity, 10);
            helper.switchWindow(SwarovskiHomePageLocators.clickOnAlumniCommunity);
            test.log(Status.PASS,"Clicked on AlumniCommunity");
            LoggerHandler.logInfo("Clicked on AlumniCommunity");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on AlumniCommunity");
            LoggerHandler.logError("Unable to Click on AlumniCommunity");
        }
    }
    public void verifyAlumniCommunityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Landing Page - Swarovski");
    }
    public void verifyAlumniCommunityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://alumni.swarovski.com/alumni/");
        helper.switchToHome();
    }
    public void clickOnCorporategifts()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnCorporategifts);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnCorporategifts, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnCorporategifts);
            test.log(Status.PASS,"Clicked on Corporategifts");
            LoggerHandler.logInfo("Clicked on Corporategifts");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Corporategifts");
            LoggerHandler.logError("Unable to Click on Corporategifts");
        }
    }
    public void verifyCorporategiftsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski Corporate Gifts & Business Gifts | Swarovski US");
    }
    public void verifyCorporategiftsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-corporate-gifts/");
        helper.navigateBack();
    }
    public void clickForProfessional()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnForProfessional);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnForProfessional, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnForProfessional);
            test.log(Status.PASS,"Clicked on ForProfessional");
            LoggerHandler.logInfo("Clicked on ForProfessional");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on ForProfessional");
            LoggerHandler.logError("Unable to Click on ForProfessional");
        }
    }
    public void verifyForProfessionalTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski for Professionals | Swarovski US");
    }
    public void verifyForProfessionalUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-professionals/");
        helper.navigateBack();
    }
    public void clickOnSitemap()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnSitemap);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnSitemap, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnSitemap);
            test.log(Status.PASS,"Clicked on Sitemap");
            LoggerHandler.logInfo("Clicked on Sitemap");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Sitemap");
            LoggerHandler.logError("Unable to Click on Sitemap");
        }
    }
    public void verifySitemapTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Sitemap | Swarovski US");
    }
    public void verifySitemapUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-html-sitemap/");
        helper.navigateBack();
    }
    public void verifyAboutUs()
    {
        String str=helper.getText(SwarovskiHomePageLocators.clickOnAboutUs);
        Assert.assertEquals(str, "ABOUT US");
        test.log(Status.PASS,"About verified");
        LoggerHandler.logInfo("About verified");
        Screenshot.captureScreenShot("About verified");

    }

    


    public void testcase1()
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
