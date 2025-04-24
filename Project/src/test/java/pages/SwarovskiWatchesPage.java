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
ExtentTest test;
WebDriverHelper helper= new WebDriverHelper(Base.driver);
public SwarovskiWatchesPage(ExtentTest test){
    this.test=test;
}
/*
* a.Method Name: hoverOverWatches.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to hover on watches.
* d.Parameters: None
* e.Return Type: void
*/
private void hoverOverWatches(){
    try {
        helper.scrollByPixel(0, 100);
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.hoverOverWatches, 10);
        helper.hoverElement(SwarovskiWatchesLocators.hoverOverWatches);
        test.log(Status.PASS, "Hover on on Watches");
        LoggerHandler.logInfo("Hover on Watches");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Hover on Watches");
        LoggerHandler.logError("Can not Hover on Watches");
    }
}
/*
* a.Method Name: clickOnImber.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Imber.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnImber(){
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnImber, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnImber, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnImber);
        test.log(Status.PASS, "Click on Imber");
        LoggerHandler.logInfo("Click on Imber");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Imber");
        LoggerHandler.logError("Can not Click on Imber");
    }
}
private void verifyURLforImber(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "imber");
}
/*
* a.Method Name: clickOnCategories.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Categories.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnCategories(){
    try {
        Thread.sleep(1000);
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnCategories, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnCategories, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnCategories);
        test.log(Status.PASS, "Click on Categories");
        LoggerHandler.logInfo("Click on Categories");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Categories");
        LoggerHandler.logError("Can not Click on Categories");
    }
}
/*
* a.Method Name: clickOnClose.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on close button.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnClose(){
    try {
        Thread.sleep(1000);
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnClose, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnClose, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnClose);
        test.log(Status.PASS, "Click on Close");
        LoggerHandler.logInfo("Click on Close");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Close");
        LoggerHandler.logError("Can not Click on Close");
    }
}
/*
* a.Method Name: clickOnWishList.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on WishList.
* d.Parameters: None
* e.Return Type: void
*/
public void clickOnWishList(){
    try {
        helper.scrollByPixel(0, 100);
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnWishList, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnWishList, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnWishList);
        test.log(Status.PASS, "Click on WishList");
        LoggerHandler.logInfo("Click on WishList");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on WishList");
        LoggerHandler.logError("Can not Click on WishList");
    }
}
private void verifyResult(){
    String text=Base.driver.findElement(SwarovskiWatchesLocators.verifyResult).getText();
    AssertionUtility.verifyCondition(test, text, "Results");
}

/*
* a.Method Name: clickOnFirstWatchProduct.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on first watch product.
* d.Parameters: None
* e.Return Type: void
*/
public void clickOnFirstWatchProduct(){
    try {
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnFirstWatchProduct, 10);
        helper.hoverElement(SwarovskiWatchesLocators.clickOnFirstWatchProduct);
        helper.mouseClick(SwarovskiWatchesLocators.clickOnFirstWatchProduct);
        test.log(Status.PASS, "Click on FirstWatchProduct");
        LoggerHandler.logInfo("Click on FirstWatchProduct");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on FirstWatchProduct");
        LoggerHandler.logError("Can not Click on FirstWatchProduct");
    }
}
public void verifyURLforImberWatch(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "imber");
}
/*
* a.Method Name: clickOnAddToBag.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Add to bag.
* d.Parameters: None
* e.Return Type: void
*/
public void clickOnAddToBag(){
    helper.scrollByPixel(0, 150);
    try {
        helper.waitForElementToBeVisible(SwarovskiWatchesLocators.clickOnAddToBag, 10);
        helper.waitForElementToBeClickable(SwarovskiWatchesLocators.clickOnAddToBag, 10);
        helper.clickOnElement(SwarovskiWatchesLocators.clickOnAddToBag);
        test.log(Status.PASS, "Click on Add to bag");
        LoggerHandler.logInfo("Click on Add to bag");
        Screenshot.captureScreenShot("Add to bag");
    } catch (Exception e) {
        test.log(Status.FAIL, "Can not Click on Add to bag");
        LoggerHandler.logError("Can not Click on Add to bag");
    }
}
/*
* a.Method Name: testWatches.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to cluster all the method
* d.Parameters: None
* e.Return Type: void
*/
public void testWatches(){
    hoverOverWatches();
    clickOnImber();
    verifyURLforImber();
    verifyResult();
    clickOnCategories();
    clickOnClose();
}







}
