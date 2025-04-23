package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SwarovskiHomePage {

public ExtentTest test;
public static WebDriverHelper helper= new WebDriverHelper(Base.driver);
public SwarovskiHomePage(ExtentTest test){
    this.test=test;
}
/*
* a.Method Name: hoverOverJwelleries.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to hover over jwelleries.
* d.Parameters: None
* e.Return Type: void
*/
private void hoverOverJwelleries(){
    try {
        Thread.sleep(1000);
        helper.scrollByPixel(0, 100);
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOverJwelleries, 10);
        helper.hoverElement(SwarovskiHomePageLocators.hoverOverJwelleries);
        test.log(Status.INFO, "Hover Over Jwelleries");
        LoggerHandler.logInfo("Hover Over Jwelleries");
    } catch (Exception e) {
        test.log(Status.FAIL, "Hover Over Jwelleries");
        LoggerHandler.logError("Hover Over Jwelleries");
    }
}

/*
* a.Method Name: clickOnPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Pendants.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnPendants(){
    try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnPendants, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnPendants, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnPendants);
        test.log(Status.INFO, "Click on Pendants");
        LoggerHandler.logInfo("Click on Pendants");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Pendants");
        LoggerHandler.logError("Click on Pendants");
    }
}

/*
* a.Method Name: verifyURLforPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to verify the URL that ir contains Pendants or not.
* d.Parameters: None
* e.Return Type: void
*/
private void verifyURLforPendants(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Pendants");
}

/*
* a.Method Name: clickOnMeterial.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Meterial.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnMeterial(){
    try {
        Thread.sleep(1000);
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnMeterial, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnMeterial, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnMeterial);
        test.log(Status.INFO, "Click on Meterial");
        LoggerHandler.logInfo("Click on Meterial");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Meterial");
        LoggerHandler.logError("Click on Meterial");
    }
}

/*
* a.Method Name: clickOnCrystal.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Crystal.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnCrystal(){
    try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnCrystal, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnCrystal, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnCrystal);
        test.log(Status.INFO, "Click on Crystal");
        LoggerHandler.logInfo("Click on Crystal");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Crystal");
        LoggerHandler.logError("Click on Crystal");
    }
}

/*
* a.Method Name: clickOnShowProduct.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Show Product Button.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnShowProduct(){
    try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowProduct, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnShowProduct, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowProduct);
        test.log(Status.INFO, "Click on ShowProduct");
        LoggerHandler.logInfo("Click on ShowProduct");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on ShowProduct");
        LoggerHandler.logError("Click on ShowProduct");
    }
}
private void verifyURLforCrystal(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Crystal");
}

/*
* a.Method Name: clickOnColor.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Color.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnColor(){
    try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnColor, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnColor, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnColor);
        test.log(Status.INFO, "Click on Color");
        LoggerHandler.logInfo("Click on Color");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Color");
        LoggerHandler.logError("Click on Color");
    }
}

/*
* a.Method Name: clickOnWhite.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on White.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnWhite(){
    try {
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnWhite, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnWhite, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnWhite);
        test.log(Status.INFO, "Click on White");
        LoggerHandler.logInfo("Click on White");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on White");
        LoggerHandler.logError("Click on White");
    }
}

/*
* a.Method Name: clickOnShowProduct49.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Show Product button.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnShowProduct49(){
    try {
        Base.driver.navigate().refresh();
        try {
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowProduct49, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnShowProduct49, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowProduct49);
        test.log(Status.INFO, "Click on ShowProduct based on color");
        LoggerHandler.logInfo("Click on ShowProduct based on color");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on ShowProduct based on color");
        LoggerHandler.logError("Click on ShowProduct based on color");
    }
}

private void verifyURLforColor(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Color");
}

/*
* a.Method Name: clickOnFirstProduct.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on First Product.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnFirstProduct(){
    try {
        try {
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnPendentFirstProduct, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnPendentFirstProduct, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnPendentFirstProduct);
        test.log(Status.INFO, "Click on FirstProduct");
        LoggerHandler.logInfo("Click on FirstProduct");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on FirstProduct");
        LoggerHandler.logError("Click on FirstProduct");
    }
}

/*
* a.Method Name: clickOnAddToBag.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Add to bag.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnAddToBag(){
    try {
        helper.scrollByPixel(0, 100);
        try {
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAddToBag, 10);
        helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnAddToBag, 10);
        helper.clickOnElement(SwarovskiHomePageLocators.clickOnAddToBag);
        test.log(Status.INFO, "Click on AddToBag");
        LoggerHandler.logInfo("Click on AddToBag");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on AddToBag");
        LoggerHandler.logError("Click on AddToBag");
    }
}

/*
* a.Method Name: verifyFindInStore.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to verify FindInStore.
* d.Parameters: None
* e.Return Type: void
*/
private void verifyFindInStore(){
    helper.waitForElementToBeVisible(SwarovskiHomePageLocators.verifyFindInStore, 10);
    String textFindStore= helper.getText(SwarovskiHomePageLocators.verifyFindInStore);
    AssertionUtility.verifyText(test, textFindStore, "Find in store");
}


/*
* a.Method Name: testPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to cluster all the methods in this class.
* d.Parameters: None
* e.Return Type: void
*/
public void testPendants(){
    hoverOverJwelleries();
    clickOnPendants();
    verifyURLforPendants();
    clickOnMeterial();
    clickOnCrystal();
    clickOnShowProduct();
    verifyURLforCrystal();
    clickOnColor();
    clickOnWhite();
    clickOnShowProduct49();
    verifyURLforColor();
    clickOnFirstProduct();
    verifyFindInStore();
    clickOnAddToBag();

}


}