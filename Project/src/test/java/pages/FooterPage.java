package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public FooterPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void scrollToFooter()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnTermsOfUse);
            test.log(Status.INFO,"scroll down to footer");
            LoggerHandler.logInfo("scroll down to footer");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to scroll down to footer");
            LoggerHandler.logError("Unable to scroll down to footer");
        }

    }
    public void clickOnTermsOfUse()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnTermsOfUse);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnTermsOfUse, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnTermsOfUse);
            test.log(Status.PASS,"Clicked on TermsOfUse");
            LoggerHandler.logInfo("Clicked on TermsOfUse");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on TermsOfUse");
            LoggerHandler.logError("Unable to Click on TermsOfUse");
        }  
    }
    public void verifyTermsOfUseTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Copyright | Swarovski US");
    }
    public void verifyTermsOfUseUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-copyright/");
        helper.navigateBack();
    }
    public void clickOnTermsAndConditions()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnTermsAndConditions);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnTermsAndConditions, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnTermsAndConditions);
            test.log(Status.PASS,"navigate back to home page");
            LoggerHandler.logInfo("navigate back to home page");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to navigate back to home page");
            LoggerHandler.logError("Unable to navigate back to home page");
        }  
    }
    public void verifyTermsAndConditionsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Terms & Conditions | Swarovski US");
    }
    public void verifyTermsAndConditionsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-termsconditions/");
        helper.navigateBack();
    }
    public void clickOnPrivacyPolicy()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnPrivacyPolicy);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnPrivacyPolicy, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnPrivacyPolicy);
            test.log(Status.PASS,"Clicked on PrivacyPolicy ");
            LoggerHandler.logInfo("Clicked on PrivacyPolicy");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on PrivacyPolicy ");
            LoggerHandler.logError("Unable to Click on PrivacyPolicy ");
        }  
    }
    public void verifyPrivacyPolicyTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Privacy Policy | Swarovski US");
    }
    public void verifyPrivacyPolicyUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-dataprotection/");
        helper.navigateBack();
    }
    public void clickOnImprint()
    {
        try {
            helper.scrolltoElement(SwarovskiHomePageLocators.clickOnImprint);
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnImprint, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnImprint);
            test.log(Status.PASS,"Clicked on Imprint ");
            LoggerHandler.logInfo("Clicked on Imprint");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Imprint ");
            LoggerHandler.logError("Unable to Click on Imprint ");
        }  
    }
    public void verifyimprintTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyCondition(test, str, "Imprint");
    }
    public void verifyimprintUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-imprint/Imprint/");
        helper.navigateBack();
    }



    public void testcase2()
    {
        scrollToFooter();
        clickOnTermsOfUse();
        verifyTermsOfUseTitle();
        verifyTermsOfUseUrl();
        clickOnTermsAndConditions();
        verifyTermsAndConditionsTitle();
        verifyTermsAndConditionsUrl();
        clickOnPrivacyPolicy();
        verifyPrivacyPolicyTitle();
        verifyPrivacyPolicyUrl();
        clickOnImprint();
        verifyimprintTitle();
        verifyimprintUrl();








    }

}
