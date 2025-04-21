package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.EarringsHomePageLocator;
import uistore.SwarovskiHomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class EarringsHomePage {
    public static WebDriverHelper helper;
    ExtentTest test;
    public EarringsHomePage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void verifyLogo(){
        
    }
    public void clickOnsearchIcon(){
        try {
            // helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnsearchIcon, 5);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnsearchIcon);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnsearchBar(){
        try {
            helper.waitForElementToBeClickable(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnsearchBar);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");    
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void sendData(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.sendData(SwarovskiHomePageLocators.clickOnsearchBar,ExcelReader.readExcelData("/home/coder/project/workspace/Project/testdata/SwarovskiExcelSheet.xlsx", "Sheet1", 0, 0));
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");    
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void enterAction(){
        try {
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnsearchBar, 5);
            helper.enterAction(SwarovskiHomePageLocators.clickOnsearchBar);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnMaterial(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnMaterial, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnMaterial);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnGemstone(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnGemstone, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnGemstone);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnZircoina(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnZircoina, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnZircoina);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnShowProduct(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnShowProduct, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnShowProduct);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnFirstProduct, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnFirstProduct);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void clickOnBookAppointment(){
        try {
            helper.waitForElementToBeClickable(EarringsHomePageLocator.clickOnBookAppointment, 5);
            helper.clickOnElement(EarringsHomePageLocator.clickOnBookAppointment);
            test.log(Status.INFO, "");
            LoggerHandler.logInfo("");  
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void verifyDescription(){
        try {
            String data=helper.getText(EarringsHomePageLocator.verifyDescription);
            Assert.assertTrue(data.contains("Description"));
            test.log(Status.PASS, "Verified text Description");
            LoggerHandler.logInfo("Verified text Description");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Description");
            LoggerHandler.logError("Not verified text Description");
        }
    }
    public void testcase7(){
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
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
