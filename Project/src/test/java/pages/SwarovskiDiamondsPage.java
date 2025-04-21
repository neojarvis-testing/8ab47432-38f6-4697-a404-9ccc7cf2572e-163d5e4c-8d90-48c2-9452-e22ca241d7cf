package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiDiamondPageLocator;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiDiamondsPage {
     public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiDiamondsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
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
    public void verifyURLText(){
        try {
            String str = Base.driver.getCurrentUrl();
            AssertionUtility.verifyCondition(test, str, "collection-eternity");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
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
    public void verifySizeKeyword(){
        try {
            helper.waitForElementToBeVisible(SwarovskiDiamondPageLocator.clickOnEternity,10);
            String str=helper.getText(SwarovskiDiamondPageLocator.checkSizeText);
            AssertionUtility.verifyText(test, str, "Select size");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

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
    }

}
