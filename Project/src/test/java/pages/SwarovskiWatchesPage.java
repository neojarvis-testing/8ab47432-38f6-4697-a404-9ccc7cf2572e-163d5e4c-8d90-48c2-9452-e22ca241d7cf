package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiWatchesLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiWatchesPage {
public ExtentTest test;
public static WebDriverHelper helper= new WebDriverHelper(Base.driver);
public SwarovskiWatchesPage(ExtentTest test){
    this.test=test;
}

private void hoverOverWatches(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.hoverOverWatches, 10);
        helper.hoverElement(SwarovskiWatchesLocators.hoverOverWatches);
        test.log(Status.INFO, "Hover on on Watches");
        LoggerHandler.logInfo("Hover on Watches");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Hover on Watches");
        LoggerHandler.logError("Can not Hover on Watches");
    }
}
private void clickOnImber(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnImber, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnImber, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnImber);
        test.log(Status.INFO, "Click on Imber");
        LoggerHandler.logInfo("Click on Imber");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Imber");
        LoggerHandler.logError("Can not Click on Imber");
    }
}
private void clickOnCategories(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnCategories, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnCategories, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnCategories);
        test.log(Status.INFO, "Click on Categories");
        LoggerHandler.logInfo("Click on Categories");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Categories");
        LoggerHandler.logError("Can not Click on Categories");
    }
}
private void clickOnClose(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnClose, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnClose, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnClose);
        test.log(Status.INFO, "Click on Close");
        LoggerHandler.logInfo("Click on Close");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Close");
        LoggerHandler.logError("Can not Click on Close");
    }
}
private void clickOnWishList(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnWishList, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnWishList, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnWishList);
        test.log(Status.INFO, "Click on Close");
        LoggerHandler.logInfo("Click on Close");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Close");
        LoggerHandler.logError("Can not Click on Close");
    }
}
private void verifyResult(){
    String text=Base.driver.findElement(SwarovskiWatchesLocators.verifyResult).getText();
    AssertionUtility.verifyCondition(test, text, "Results");
}

private void clickOnFirstProduct(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnFirstProduct, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnFirstProduct, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnFirstProduct);
        test.log(Status.INFO, "Click on Close");
        LoggerHandler.logInfo("Click on Close");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Close");
        LoggerHandler.logError("Can not Click on Close");
    }
}
private void clickOnAddToBag(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnAddToBag, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnAddToBag, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnAddToBag);
        test.log(Status.INFO, "Click on Close");
        LoggerHandler.logInfo("Click on Close");
        Screenshot.captureScreenShot("Add to bag");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Close");
        LoggerHandler.logError("Can not Click on Close");
    }
}

public void testWatches(){
    hoverOverWatches();
    clickOnImber();
    clickOnCategories();
    clickOnClose();
    clickOnWishList();
    verifyResult();
    clickOnFirstProduct();
    clickOnAddToBag();
}







}
