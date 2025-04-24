package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.EarringsHomePageLocator;
import uistore.SwarovskiHomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class EarringsHomePage {
    WebDriverHelper helper;
    ExtentTest test;

    public EarringsHomePage(ExtentTest test) {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
     * A. Method name : verifyLogo
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify the logo
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyLogo() {
    try {
        Screenshot.captureScreenShot("Logo Screenshot");
    } catch (Exception e) {
        LoggerHandler.logError(e.getMessage()); 
    }
    }
    /*
     * A. Method name : clickOnsearchIcon
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on search Icon
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnsearchIcon() {
        try {
            helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnsearchIcon, 5);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnsearchIcon);
            
            test.log(Status.INFO, "Click on Search Icon");
            LoggerHandler.logInfo("Clicked on Search Icon");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "couldnot click on Search Icon");
            LoggerHandler.logError("couldnot click on Search Icon");
        }
    }

    /*
     * A. Method name : clickOnsearchBar
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on search Bar
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnsearchBar() {
        try {
            helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnsearchBar);
            test.log(Status.INFO, "click on Search Bar");
            LoggerHandler.logInfo("click on Search Bar");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "couldnot click on Search Bar");
            LoggerHandler.logError("couldnot click on Search Bar");
        }
    }

    /*
     * A. Method name : sendData
     * B. Author name : Logisetty Nischith
     * C. Description : Method to send data to search bar
     * D. Return type : void
     * E. Parameter : Null
     */
    public void sendData() {
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.sendData(SwarovskiHomePageLocators.clickOnsearchBar, "Earrings");
            test.log(Status.INFO, "Senddata to searchBar as Earrings");
            LoggerHandler.logInfo("Sentdata to searchBar as Earrings");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "couldnot Senddata to searchBar as Earrings");
            LoggerHandler.logError("couldnot Senddata to searchBar as Earrings");
        }
    }

    /*
     * A. Method name : enterAction
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click enter on search bar
     * D. Return type : void
     * E. Parameter : Null
     */
    public void enterAction() {
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.enterAction(SwarovskiHomePageLocators.clickOnsearchBar);
            test.log(Status.INFO, "click enter for resultant page");
            LoggerHandler.logInfo("clicked enter for resultant page");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "couldnot click enter");
            LoggerHandler.logError("couldnot click enter");
        }
    }

    /*
     * A. Method name : clickOnMaterial
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on Material
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnMaterial() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnMaterial, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnMaterial);
            test.log(Status.INFO, "Click on Material");
            LoggerHandler.logInfo("Clicked on Material");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "couldnot click on Material");
            LoggerHandler.logError("couldnot click on Material");
        }
    }

    /*
     * A. Method name : clickOnGemstone
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on gemstone
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnGemstone() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnGemstone, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnGemstone);
            test.log(Status.INFO, "Click on Gemstore");
            LoggerHandler.logInfo("Clicked on Gemstore");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Couldnot Click on Gemstore");
            LoggerHandler.logError("Couldnot Click on Gemstore");
        }
    }

    /*
     * A. Method name : clickOnZircoina
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on Zircoina
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnZircoina() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnZircoina, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnZircoina);
            test.log(Status.INFO, "Click on Zircoina");
            LoggerHandler.logInfo("Clicked on Zircoina");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Couldnot Click on Zircoina");
            LoggerHandler.logError("Couldnot Click on Zircoina");
        }
    }

    /*
     * A. Method name : clickOnShowProduct
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on ShowProduct
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnShowProduct() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnShowProduct, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnShowProduct);
            test.log(Status.INFO, "Click on Showproduct");
            LoggerHandler.logInfo("Clicked on Showproduct");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Couldnot Click on Showproduct");
            LoggerHandler.logError("Couldnot Click on Showproduct");
        }
    }

    /*
     * A. Method name : clickOnFirstProduct
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on FirstProduct
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnFirstProduct() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnFirstProduct, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnFirstProduct);
            test.log(Status.INFO, "Click on Firstproduct");
            LoggerHandler.logInfo("Clicked on Firstproduct");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Couldnot click on Firstproduct");
            LoggerHandler.logError("Couldnot click on Firstproduct");
        }
    }

    /*
     * A. Method name : clickOnBookAppointment
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on BookAppointment
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnBookAppointment() {
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnBookAppointment, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnBookAppointment);
            test.log(Status.INFO, "Click on BookAppointment");
            LoggerHandler.logInfo("Clicked on BookAppointment");
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Couldnot click on BookAppointment");
            LoggerHandler.logError("Couldnot click on BookAppointment");
        }
    }

    /*
     * A. Method name : verifyDescription
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Description
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyDescription() {
        try {
            String data = helper.getText(EarringsHomePageLocator.verifyDescription);
            Assert.assertTrue(data.contains("Description"));
            test.log(Status.PASS, "Verified text Description");
            LoggerHandler.logInfo("Verified text Description");
            Screenshot.captureScreenShot("Description ScreenShot");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Description");
            LoggerHandler.logError("Not verified text Description");
        }
    }

    public void testEarings() {
        try {
            helper.scrollByPixel(0, 100);
            clickOnsearchIcon();
            Thread.sleep(1000);
            clickOnsearchBar();

            sendData();
            enterAction();
            clickOnMaterial();
            clickOnGemstone();
            Thread.sleep(1000);
            helper.scrollByPixel(0, 200);
            Thread.sleep(1000);
            clickOnZircoina();
            clickOnShowProduct();
            clickOnFirstProduct();
            helper.scrollByPixel(0, 700);
            clickOnBookAppointment();
            verifyDescription();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
