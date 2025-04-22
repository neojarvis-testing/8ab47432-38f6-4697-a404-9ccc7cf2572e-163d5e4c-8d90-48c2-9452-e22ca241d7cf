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
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnTermsOfUse);
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
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnTermsOfUse);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnTermsOfUse, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnTermsOfUse);
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
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnTermsAndConditions);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnTermsAndConditions, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnTermsAndConditions);
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
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnPrivacyPolicy);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnPrivacyPolicy, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnPrivacyPolicy);
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
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnImprint);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnImprint, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnImprint);
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
    public void clickOnAccessibility()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnAccesbilityStatement);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnAccesbilityStatement, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnAccesbilityStatement);
            test.log(Status.PASS,"Clicked on Accessibility ");
            LoggerHandler.logInfo("Clicked on Accessibility");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on Accessibility ");
            LoggerHandler.logError("Unable to Click on Accessibility ");
        }  
    }
    public void verifyAccessibilityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyCondition(test, str, "Accessibility");
    }
    public void verifyAccessibilityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-accessibility/Accessibility/");
        helper.navigateBack();
    }
    public void clickOnCaliforniaSupplyChainAct()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnCaliforniasupplyclainact);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnCaliforniasupplyclainact, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnCaliforniasupplyclainact);
            test.log(Status.PASS,"Clicked on CaliforniaSupplyChainAct ");
            LoggerHandler.logInfo("Clicked on CaliforniaSupplyChainAct");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on CaliforniaSupplyChainAct ");
            LoggerHandler.logError("Unable to Click on CaliforniaSupplyChainAct ");
        }  
    }
    public void verifyCaliforniaSupplyChainActTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski Crystal California Supply Chains Act | Swarovski US");
    }
    public void verifyCaliforniaSupplyChainActUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-supplychainsact/Swarovski-Crystal-California-Supply-Chains-Act/");
        helper.navigateBack();
    }
    public void clickOnCaliforniaPrivacyRights()
    {
        try {
            helper.scrolltoElement(SwarovskiAboutUsPageLocators.clickOnCaliforniaPrivacyRights);
            helper.waitForElementToBeVisible(SwarovskiAboutUsPageLocators.clickOnCaliforniaPrivacyRights, 10);
            helper.clickOnElement(SwarovskiAboutUsPageLocators.clickOnCaliforniaPrivacyRights);
            test.log(Status.PASS,"Clicked on CaliforniaPrivacyRights");
            LoggerHandler.logInfo("Clicked on CaliforniaPrivacyRights");
        } catch (Exception e) {
            test.log(Status.FAIL,"Unable to Click on CaliforniaPrivacyRights");
            LoggerHandler.logError("Unable to Click on CaliforniaPrivacyRights");
        }  
    }
    public void verifyCaliforniaPrivacyRightsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "California Privacy Rights | Swarovski US");
    }
    public void verifyCaliforniaPrivacyRightsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-californiaprivacy/");
        helper.navigateBack();
    }
    public void verifyLegal()
    {
        String str=helper.getText(SwarovskiAboutUsPageLocators.Label);
        Assert.assertEquals(str, "LEGAL");
        test.log(Status.PASS,"Legal verified");
        LoggerHandler.logInfo("Legal verified");
        Screenshot.captureScreenShot("Swarovski");
        Reporter.logScreenshottoReport("Swarovski", test, "Legal is verified");


    }
    public void testing()
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
        clickOnAccessibility();
        verifyAccessibilityTitle();
        verifyAccessibilityUrl();
        clickOnCaliforniaSupplyChainAct();
        verifyCaliforniaSupplyChainActTitle();
        verifyCaliforniaSupplyChainActUrl();
        clickOnCaliforniaPrivacyRights();
        verifyCaliforniaPrivacyRightsTitle();
        verifyCaliforniaPrivacyRightsUrl();
        verifyLegal();












    }

}
