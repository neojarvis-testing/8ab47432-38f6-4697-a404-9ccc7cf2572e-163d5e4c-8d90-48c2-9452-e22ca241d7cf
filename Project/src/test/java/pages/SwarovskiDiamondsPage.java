package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiDiamondPageLocator;
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
            test.log(Status.INFO, "Hover over Swarovski Created Diamonds");
            LoggerHandler.logInfo("Hover over Swarovski Created Diamonds");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Eternity");
            LoggerHandler.logInfo("Click On Eternity");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnMaterial,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnMaterial);
            test.log(Status.INFO,"Click on Material");
            LoggerHandler.logInfo("Click On Material");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Sterling Silver");
            LoggerHandler.logInfo("Click On Sterling Silver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            test.log(Status.INFO,"Click on Show Products Button");
            LoggerHandler.logInfo("Click On Show Products Button");
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
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnFirstRing,10);
            helper.clickOnElement(SwarovskiDiamondPageLocator.clickOnFirstRing);
            test.log(Status.INFO,"Click on First Ring");
            LoggerHandler.logInfo("Click On First Ring");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        clickOnMaterial();
        clickOnSterlingSilver();
        clickOnShowProductsButton();
        clickOnFirstProduct();
        verifySizeKeyword();
        Screenshot.captureScreenShot("Eternity Rings");
         Reporter.logScreenshottoReport("Eternity Rings", test, "attached to report");
    }

}
