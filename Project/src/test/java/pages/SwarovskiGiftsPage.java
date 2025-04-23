package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiGiftsPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiGiftsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
     /*
     * Method Name: hoverOverGifts
     * Author name: Kartik Bameta
     * Description: Performs hover action on Gifts present in the navigation bar.
     * Parameters: none
     * Return type: void
     */
    public void hoverOverGifts(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnGifts,10);
            helper.hoverElement(SwarovskiHomePageLocators.hoverOnGifts);
            test.log(Status.PASS,"Hover on Gifts");
            LoggerHandler.logInfo("Hover on Gifts");
        } catch (Exception e) {
            test.log(Status.FAIL,"Cannot Hover on Gifts");
            LoggerHandler.logError("Cannot Hover on Gifts");
        }
    }
    /*
     * Method Name: clickOnWeddingGifts
     * Author name: Kartik Bameta
     * Description: Clicks on Wedding Gifts option under Gifts.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWeddingGifts(){

       try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWeddingGifts,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnWeddingGifts);
            AssertionUtility.verifyText(test, Base.driver.getTitle(), "Wedding Gifts, Bridal Party Gifts & Gifts For The Bride | Swarovski");
            test.log(Status.PASS, "Click on Wedding Gifts");
            LoggerHandler.logInfo("Click on Wedding Gifts");
       } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Wedding Gifts");
            LoggerHandler.logError("could not Click on Wedding Gifts");

       }
    }
    /*
     * Method Name: verifyTitleText
     * Author name: Kartik Bameta
     * Description: Verifies the page title contains the keyword "Categories".
     * Parameters: none
     * Return type: void
     */
    public void verifyTitleText(){
        try {
            String str = Base.driver.getCurrentUrl();
            AssertionUtility.verifyCondition(test, str, "Categories");
            test.log(Status.PASS, "Title text Verified");
            LoggerHandler.logInfo("Title text Verified");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "Title text cannot be Verified");
            LoggerHandler.logError("Title text cannot be Verified");
        }
    }
    /*
     * Method Name: clickOnCtaegories
     * Author name: Kartik Bameta
     * Description: Clicks on Categories drop down option
     * Parameters: none
     * Return type: void
     */
    public void clickOnCtaegories(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnCategories,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnCategories);
            test.log(Status.PASS, "Click on Categories");
            LoggerHandler.logInfo("Click on Categories");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Categories");
            LoggerHandler.logInfo("could not Click on Categories");
        }
    }
    /*
     * Method Name: clickOnWatches
     * Author name: Kartik Bameta
     * Description: Clicks on watches option under Categories.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWatches(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWatches,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnWatches);
            test.log(Status.PASS, "Click on Watches");
            LoggerHandler.logInfo("Click on Watches");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Watches");
            LoggerHandler.logError("could not Click on Watches");
        }
    }
    /*
     * Method Name: clickOnAllWatches
     * Author name: Kartik Bameta
     * Description: Clicks on All Watches option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnAllWatches(){
       try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAllWatches,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnAllWatches);
        test.log(Status.PASS,"Click on all watches");
        LoggerHandler.logInfo("Click on all watches");
       } catch (Exception e) {
        test.log(Status.FAIL,"could not Click on all watches");
        LoggerHandler.logInfo("could not Click on all watches");
       }
    }
    /*
     * Method Name: clickOnShowProducts
     * Author name: Kartik Bameta
     * Description: Clicks on the Show product button and shows a list of all products after applying certain filters.
     * Parameters: none
     * Return type: void
     */
    public void clickOnShowProducts(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowAll,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowAll);
            AssertionUtility.verifyText(test,Base.driver.getTitle(),"Featured products | Swarovski");
            test.log(Status.INFO,"Click on Show Products");
            LoggerHandler.logInfo("Click on Show Products");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnMaterial
     * Author name: Kartik Bameta
     * Description: Clicks on Material Dropdown.
     * Parameters: none
     * Return type: void
     */
    public void clickOnMaterial(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnMaterial,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnMaterial);
            test.log(Status.PASS,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnStainlessSteel
     * Author name: Kartik Bameta
     * Description: Clicks on Stainless Steel option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnStainlessSteel(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnStainlessSteel,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnStainlessSteel);
            test.log(Status.PASS,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnShowAll
     * Author name: Kartik Bameta
     * Description: Clicks on the Show product button and shows a list of all products after applying certain filters.
     * Parameters: none
     * Return type: void
     */
    public void clickOnShowAll(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowAllButton,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowAllButton);
            AssertionUtility.verifyText(test,Base.driver.getTitle(),"Featured products | Swarovski");
            test.log(Status.INFO,"Click on Show All Products");
            LoggerHandler.logInfo("Click on Show All Products");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Show All Products");
            LoggerHandler.logError("could not Click on Show All Products");
        }
    }
    /*
     * Method Name: clickOnFirstProduct
     * Author name: Kartik Bameta
     * Description: Clicks on the first product that'll appear after clicking on the Show Products button.
     * Parameters: none
     * Return type: void
     */
    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnFirstProduct,10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnFirstProduct);
            test.log(Status.INFO,"Click on First Product");
            LoggerHandler.logInfo("Click on First Product");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on First Product");
            LoggerHandler.logError("could not Click on First Product");
        }
    }
    /*
     * Method Name: verify
     * Author name: Kartik Bameta
     * Description: Verifies the key word "Add to bag" and record the logs.
     * Parameters: none
     * Return type: void
     */
    public void verify(){
        try {
            String str = helper.getText(SwarovskiHomePageLocators.addToCartText);
            AssertionUtility.verifyText(test, str, "Add to bag");
            test.log(Status.PASS,"Add To Bag Text Verified");
            LoggerHandler.logInfo("Add To Bag Text Verified");
        } catch (AssertionError e) {
            test.log(Status.FAIL,"Add To Bag Text cannot be Verified");
            LoggerHandler.logError("Add To Bag Text cannot be Verified");
        }
    }
    

     /*
     * Method Name: testSwarovskiGiftsPage
     * Author name: Kartik Bameta
     * Description: Calls all the methods defined above and this method will be called inside runner page for execution.
     * Parameters: none
     * Return type: void
     */
    public void testSwarovskiGiftsPage(){
        hoverOverGifts();
        clickOnWeddingGifts();
        verifyTitleText();
        clickOnCtaegories();
        clickOnWatches();
        clickOnAllWatches();
        clickOnShowProducts();
        clickOnMaterial();
        clickOnStainlessSteel();
        clickOnShowAll();
        clickOnFirstProduct();
        verify();
        Screenshot.captureScreenShot("Gifts");
        Reporter.logScreenshottoReport("Gifts", test, "attached to report");
    }


    

}
