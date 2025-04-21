package pages;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
public class SwarovskiSunglassesPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public SwarovskiSunglassesPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void hoverOnAccessories(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnAccessories, 10);
            helper.hoverElement(SwarovskiHomePageLocators.hoverOnAccessories);
            LoggerHandler.logInfo("Hover on Accessories");
            test.log(Status.PASS, "Hover on Accessories");
        }
      
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not hover on Accessories");
            test.log(Status.FAIL,"not hover on Accessories");
        }
        
    }
    public void clickOnSunglasses(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnSunglasses, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnSunglasses);
            LoggerHandler.logInfo("clickOnSunglasses");
            test.log(Status.PASS, "clickOnSunglasses");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not clickOnSunglasses");
            test.log(Status.FAIL,"not clickOnSunglasses");
        }
    }
    public void verifyUrlSunglasses(){
        String url=Base.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Sunglasses"));
        LoggerHandler.logInfo("Sssertoin done");
        test.log(Status.PASS, "clickOnMaterial");
    }
    public void clickOnMaterial(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnMaterial, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnMaterial);
            LoggerHandler.logInfo("clickOnMaterial");
            test.log(Status.PASS, "clickOnMaterial");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Material");
            test.log(Status.FAIL,"not click On Material");
        }
    }
    public void clickOnAcetate(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnAcetate, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnAcetate);
            LoggerHandler.logInfo("click On Acetate");
            test.log(Status.PASS, "click On Acetate");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Acetate");
            test.log(Status.FAIL,"not click On Acetate");
        }
    }
    public void clickOnShowProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowProducts, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowProducts);
            LoggerHandler.logInfo("click On ShowProducts");
            test.log(Status.PASS, "click OnShowProducts");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On ShowProducts");
            test.log(Status.FAIL,"not click On ShowProducts");
        }
    }
    public void clickOnFirstProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnFirstProduct, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnFirstProduct);
            LoggerHandler.logInfo("click On FirstProduct");
            test.log(Status.PASS, "click On FirstProduct");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
    public void clickOnCareandMaintanece(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickonCareandMaintainence, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickonCareandMaintainence);
            LoggerHandler.logInfo("click On CareandMaintainence");
            test.log(Status.PASS, "click On CareandMaintainence");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
    public void verifyBookanAppointment(){
        String data=helper.getText(SwarovskiHomePageLocators.bookAnAppointmnet);
        AssertionUtility.verifyText(test, data,"Book an appointment");
    }
    public void verifyLogin(){
        String data=helper.getText(SwarovskiHomePageLocators.verifyLogin);
        AssertionUtility.verifyText(test, data, "Login");
    }
    public void testcase3(){
        hoverOnAccessories();
        clickOnSunglasses();
        verifyUrlSunglasses();
        clickOnMaterial();
        clickOnAcetate();
        clickOnFirstProduct();
        clickOnCareandMaintanece();
        verifyBookanAppointment();
        //verifyLogin();
    }
  



}
