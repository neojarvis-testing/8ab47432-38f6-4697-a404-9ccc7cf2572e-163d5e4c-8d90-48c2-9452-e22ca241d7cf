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
    public ExtentTest test;
    public FooterPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
     * a.Method Name: scrollToFooter
     * b.Author Name: Sarika
     * c.Description: This method  is used to scroll To Terms of use.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: clickOnTermsOfUse
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On Terms Of Use.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyTermsOfUseTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify TermsOfUse Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyTermsOfUseTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Copyright | Swarovski US");
    }
    /*
     * a.Method Name: verifyTermsOfUseUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify TermsOfUse Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyTermsOfUseUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-copyright/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnTermsAndConditions
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On TermsAndConditions.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyTermsAndConditionsTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify TermsAndConditions Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyTermsAndConditionsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Terms & Conditions | Swarovski US");
    }
    /*
     * a.Method Name: verifyTermsAndConditionsUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify TermsAndConditions Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyTermsAndConditionsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-termsconditions/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnPrivacyPolicy
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On PrivacyPolicy.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyPrivacyPolicyTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify PrivacyPolicy Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyPrivacyPolicyTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Privacy Policy | Swarovski US");
    }
    /*
     * a.Method Name: verifyPrivacyPolicyUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify PrivacyPolicy Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyPrivacyPolicyUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-dataprotection/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnImprint
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On Imprint.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyimprintTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify imprint Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyimprintTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyCondition(test, str, "Imprint");
    }
    /*
     * a.Method Name: verifyimprintUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify imprint Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyimprintUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-imprint/Imprint/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnAccessibility
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On Accessibility.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyAccessibilityTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Accessibility Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAccessibilityTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyCondition(test, str, "Accessibility");
    }
    /*
     * a.Method Name: verifyAccessibilityUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Accessibility Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyAccessibilityUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-accessibility/Accessibility/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnCaliforniaSupplyChainAct
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On California Supply Chain Act.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyCaliforniaSupplyChainActTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify CaliforniaSupplyChainAct Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCaliforniaSupplyChainActTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "Swarovski Crystal California Supply Chains Act | Swarovski US");
    }
    /*
     * a.Method Name: verifyCaliforniaSupplyChainActUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify CaliforniaSupplyChainAct Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCaliforniaSupplyChainActUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-supplychainsact/Swarovski-Crystal-California-Supply-Chains-Act/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: clickOnCaliforniaPrivacyRights
     * b.Author Name: Sarika
     * c.Description: This method  is used to click On CaliforniaPrivacy Rights.
     * d.Parameters: none.
     * e.Return Type: void.
     */
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
    /*
     * a.Method Name: verifyCaliforniaPrivacyRightsTitle
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify CaliforniaPrivacyRights Title.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCaliforniaPrivacyRightsTitle()
    {
        String str=Base.driver.getTitle();
        AssertionUtility.verifyText(test, str, "California Privacy Rights | Swarovski US");
    }
    /*
     * a.Method Name: verifyCaliforniaPrivacyRightsUrl
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify CaliforniaPrivacyRights Url.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyCaliforniaPrivacyRightsUrl()
    {
        String str = Base.driver.getCurrentUrl();
        AssertionUtility.verifyText(test, str, "https://www.swarovski.com/en-US/s-californiaprivacy/");
        helper.navigateBack();
    }
    /*
     * a.Method Name: verifyLegal
     * b.Author Name: Sarika
     * c.Description: This method  is used to verify Legal.
     * d.Parameters: none.
     * e.Return Type: void.
     */
    public void verifyLegal()
    {
        String str=helper.getText(SwarovskiAboutUsPageLocators.Label);
        Assert.assertEquals(str, "LEGAL");
        test.log(Status.PASS,"Legal verified");
        LoggerHandler.logInfo("Legal verified");
        Screenshot.captureScreenShot("Swarovski");
        Reporter.logScreenshottoReport("Swarovski", test, "Legal is verified");


    }
    /*
     * Method Name: testing
     * Author name: Sarika
     * Description: Calls all the methods defined above and this method will be called inside runner page for execution.
     * Parameters: none
     * Return type: void
     */
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
