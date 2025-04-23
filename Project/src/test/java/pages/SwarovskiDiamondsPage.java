package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiDiamondPageLocator;
import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiDiamondsPage {
     public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiDiamondsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
     /*
     * Method Name: hoverOnSwarovskiCreatedDiamonds
     * Author name: Kartik Bameta
     * Description: Performs hover action on Swarovski Created Diamonds.
     * Parameters: none
     * Return type: void
     */
    public void hoverOnSwarovskiCreatedDiamonds(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.hoverOnSwarovskiCreatedDiamonds,10);
            helper.hoverElement(SwarovskiDiamondPageLocator.hoverOnSwarovskiCreatedDiamonds);
            test.log(Status.PASS, "Hover over Swarovski Created Diamonds");
            LoggerHandler.logInfo("Hover over Swarovski Created Diamonds");
        } catch (Exception e) {
            test.log(Status.FAIL, "Could not Hover over Swarovski Created Diamonds");
            LoggerHandler.logError("Could not Hover over Swarovski Created Diamonds");
        }
    }
    /*
     * Method Name: clickOnCategories
     * Author name: Kartik Bameta
     * Description: Performs click action on Categories.
     * Parameters: none
     * Return type: void
     */
    public void clickOnCategories(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnCategories,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnCategories);
            test.log(Status.PASS,"Click on Categories");
            LoggerHandler.logInfo("Click On Categories");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Categories");
            LoggerHandler.logError("could not Click on Categories");
        }
    }
    /*
     * Method Name: clickOnEternity
     * Author name: Kartik Bameta
     * Description: Performs click action on Eternity.
     * Parameters: none
     * Return type: void
     */
    public void clickOnEternity(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnEternity,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnEternity);
            String str = Base.driver.getTitle();
            AssertionUtility.verifyCondition(test,str,"Eternity rings, bands, and necklaces | Swarovski Created Diamonds");
            test.log(Status.PASS,"Click on Eternity");
            LoggerHandler.logInfo("Click On Eternity");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Eternity");
            LoggerHandler.logError("could not Click On Eternity");
        }
    }
     /*
     * Method Name: clickOnRings
     * Author name: Kartik Bameta
     * Description: Performs click action on Rings.
     * Parameters: none
     * Return type: void
     */
    public void clickOnRings(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnRings,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnRings);
            test.log(Status.PASS, "Click on Rings");
            LoggerHandler.logInfo("Click on Rings");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Rings");
            LoggerHandler.logError("could not Click on Rings");
        }
    }
    /*
     * Method Name: verifyURLText
     * Author name: Kartik Bameta
     * Description: Verifies that the url contains the keyword "collection-eternity".
     * Parameters: none
     * Return type: void
     */
    public void verifyURLText(){
        try {
            String str = Base.driver.getCurrentUrl();
            AssertionUtility.verifyCondition(test, str, "collection-eternity");
            test.log(Status.PASS,"URL Text verified");
            LoggerHandler.logInfo("URL Text verified");
        } catch (Exception e) {
            test.log(Status.FAIL,"Could not verify URL text");
            LoggerHandler.logError("Could not verify URL text");
        }
    }
    /*
     * Method Name: clickOnMaterial
     * Author name: Kartik Bameta
     * Description: Clicks on the Material in the navigation bar.
     * Parameters: none
     * Return type: void
     */
    public void clickOnMaterial(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnMaterialDropDown,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnMaterialDropDown);
            test.log(Status.PASS,"Click on Material");
            LoggerHandler.logInfo("Click On Material");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click On Material");
        }
    }
    /*
     * Method Name: clickOnSterlingSilver
     * Author name: Kartik Bameta
     * Description: Clicks on the Sterling Silver option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnSterlingSilver(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnSterlingSilver,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnSterlingSilver);
            test.log(Status.PASS,"Click on Sterling Silver");
            LoggerHandler.logInfo("Click On Sterling Silver");
        } catch (Exception e) {
            test.log(Status.FAIL,"Could not click on Sterling Silver");
            LoggerHandler.logError("Could not click on Sterling Silver");
        }
    }
    /*
     * Method Name: clickOnShowProductsButton
     * Author name: Kartik Bameta
     * Description: Clicks on the Show product button and shows a list of all products after applying certain filters.
     * Parameters: none
     * Return type: void
     */
    public void clickOnShowProductsButton(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnShowButton,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnShowButton);
            String str = Base.driver.getTitle();
            AssertionUtility.verifyText(test,str,"Jewelry: Earrings, Bracelets, Necklaces, Rings | Swarovski");
            test.log(Status.PASS,"Click on Show Products Button");
            LoggerHandler.logInfo("Click On Show Products Button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Could not Click On Show Products Button ");
            LoggerHandler.logError("Could not Click On Show Products Button ");
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
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnShowButton,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnShowButton);
            String str = Base.driver.getTitle();
            AssertionUtility.verifyText(test,str,"Jewelry: Earrings, Bracelets, Necklaces, Rings | Swarovski");
            test.log(Status.PASS,"Click on Show Products");
            LoggerHandler.logInfo("Click on Show Products");
        } catch (Exception e) {
            test.log(Status.FAIL,"cannot Click on Show Products");
            LoggerHandler.logError("cannot Click on Show Products");
        }
    }
    /*
     * Method Name: clickOnFirstProductRing
     * Author name: Kartik Bameta
     * Description: Clicks on the first product that'll appear after clicking on the Show Products button.
     * Parameters: none
     * Return type: void
     */


    public void clickOnFirstProductRing(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnFirstRing,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnFirstRing);
            AssertionUtility.verifyText(test,Base.driver.getTitle(),"Eternity halo solitaire ring, Lab-grown diamonds 0.45 ct tw, Round shape, Sterling silver");
            test.log(Status.PASS,"Click on First Ring");
            LoggerHandler.logInfo("Click On First Ring");
        } catch (Exception e) {
            test.log(Status.FAIL,"cannot Click on First Ring");
            LoggerHandler.logError("cannot Click On First Ring");
        }
    }
    /*
     * Method Name: verifySizeKeyword
     * Author name: Kartik Bameta
     * Description: Verifies the key word "Select size" and record the logs.
     * Parameters: none
     * Return type: void
     */
    public void verifySizeKeyword(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnEternity,10);
            String str=helper.getText(SwarovskiDiamondPageLocator.checkSizeText);
            AssertionUtility.verifyText(test, str, "Select size");
            test.log(Status.PASS,"Click on First Ring");
            LoggerHandler.logInfo("Click On First Ring");
        } catch (Exception e) {
            test.log(Status.FAIL,"Click on First Ring");
            LoggerHandler.logError("Click On First Ring");
        }
    }

    /*
     * Method Name: testSwarovskiDiamondPage
     * Author name: Kartik Bameta
     * Description: Calls all the methods defined above and this method will be called inside runner page for execution.
     * Parameters: none
     * Return type: void
     */
    public void testSwarovskiDiamondPage(){
        hoverOnSwarovskiCreatedDiamonds();
        clickOnEternity();
        verifyURLText();
        clickOnCategories();
        clickOnRings();
        clickOnShowProducts();
        clickOnMaterial();
        clickOnSterlingSilver();
        clickOnShowProductsButton();
        clickOnFirstProductRing();
        verifySizeKeyword();
        Screenshot.captureScreenShot("Eternity Rings");
         Reporter.logScreenshottoReport("Eternity Rings", test, "attached to report");
    }

}
