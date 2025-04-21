package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiHomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SwarovskiHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiHomePage(){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void hoverOverGifts(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnGifts,10);
        helper.hoverElement(SwarovskiHomePageLocators.hoverOnGifts);
        test.log(Status.INFO,"Hover on Gifts");
        LoggerHandler.logInfo("Hover on Gifts");
    }
    public void clickOnWeddingGifts(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWeddingGifts,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnWeddingGifts);
        test.log(Status.INFO, "Click on Wedding Gifts");
        LoggerHandler.logInfo("Click on Wedding Gifts");
    }
    public void clickOnCtaegories(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnCategories,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnCategories);
        test.log(Status.INFO, "Click on Categories");
        LoggerHandler.logInfo("Click on Categories");
    }
    public void clickOnWatches(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWatches,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnWatches);
        test.log(Status.INFO, "Click on Watches");
        LoggerHandler.logInfo("Click on Watches");
    }
    public void clickOnAllWatches(){
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAllWatches,10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnAllWatches);
        test.log(Status.INFO,"Click on all watches");
        LoggerHandler.logInfo("Click on all watches");
    }
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
    public void verify(){
        try {
            String str = helper.getText(SwarovskiHomePageLocators.addToCartText);
            Assert.assertEquals(str, "Add to bag");
            test.log(Status.PASS, "Add To Bag Text Verified");
            LoggerHandler.logInfo("Add to bag text verified");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Add To Bag Text Cannot be Verified");
            LoggerHandler.logError("Add to bag text Cannot be verified");
        }
    }
    
    public void testSwarovskiGiftsPage(){
        hoverOverGifts();
        clickOnWeddingGifts();
        clickOnCtaegories();
        clickOnWatches();
        clickOnAllWatches();
        clickOnShowProducts();
        clickOnMaterial();
        clickOnStainlessSteel();
        clickOnShowAll();
        clickOnFirstProduct();
        verify();
    }


    

}
