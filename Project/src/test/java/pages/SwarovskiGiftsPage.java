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
        
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnGifts,10);
        helper.hoverElement(SwarovskiHomePageLocators.hoverOnGifts);
        test.log(Status.PASS,"Hover on Gifts");
        LoggerHandler.logInfo("Hover on Gifts");
    }
    /*
     * Method Name: clickOnWeddingGifts
     * Author name: Kartik Bameta
     * Description: Clicks on Wedding Gifts option under Gifts.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWeddingGifts(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWeddingGifts,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnWeddingGifts);
        test.log(Status.INFO, "Click on Wedding Gifts");
        LoggerHandler.logInfo("Click on Wedding Gifts");
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

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
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
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnCategories,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnCategories);
        test.log(Status.INFO, "Click on Categories");
        LoggerHandler.logInfo("Click on Categories");
    }
    /*
     * Method Name: clickOnWatches
     * Author name: Kartik Bameta
     * Description: Clicks on watches option under Categories.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWatches(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWatches,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnWatches);
        test.log(Status.INFO, "Click on Watches");
        LoggerHandler.logInfo("Click on Watches");
    }
    /*
     * Method Name: clickOnAllWatches
     * Author name: Kartik Bameta
     * Description: Clicks on All Watches option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnAllWatches(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAllWatches,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnAllWatches);
        test.log(Status.INFO,"Click on all watches");
        LoggerHandler.logInfo("Click on all watches");
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
            test.log(Status.INFO,"Click on Show Products");
            LoggerHandler.logInfo("Click on Show Products");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
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
