package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.SwarovskiBirdPageLocators;
import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
public class SwarovskiBirdPage {
     public static ExtentTest test;
    public static WebDriverHelper helper;
    public SwarovskiBirdPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void hoverOnDecorations(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnDecorations, 10);
            helper.hoverElement(SwarovskiHomePageLocators.hoverOnDecorations);
            LoggerHandler.logInfo("hover on Decorations");
            test.log(Status.PASS, "hover on Decorations");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not hover on  Decorations");
            test.log(Status.FAIL,"not hover on Decorations");
        }
        
    }
    public void clickOnBirds(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnBirds, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnBirds);
            LoggerHandler.logInfo("click On clickOnBirds");
            test.log(Status.PASS, "click On clickOnBirds");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Birds");
            test.log(Status.FAIL,"not click On Birds");
        }
    }
    public void clickOnMaterial(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnMaterial, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnMaterial);
            LoggerHandler.logInfo("click On Material");
            test.log(Status.PASS, "click On Material");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Material");
            test.log(Status.FAIL,"not click On Material");
        }
    }
    public void clickOnMetal(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnMetal, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnMetal);
            LoggerHandler.logInfo("click On Metal");
            test.log(Status.PASS, "click On Metal");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Metal");
            test.log(Status.FAIL,"not click On Metal");
        }
    }
    public void clickOnResults(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnResults, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnResults);
            LoggerHandler.logInfo("click On Resuuts");
            test.log(Status.PASS, "click On Results");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On Results");
            test.log(Status.FAIL,"not click OnclickOnBirds");
        }
    }
    public void clickOnFirstProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnFirstProduct, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnFirstProduct);
            LoggerHandler.logInfo("click On FirstProduct");
            test.log(Status.PASS, "click On First Product");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
    public void clickOnFindInStore(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnFindinstore, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnFindinstore);
            LoggerHandler.logInfo("click On FindInstore");
            test.log(Status.PASS, "click On  FindInstore");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On  FindInstores");
            test.log(Status.FAIL,"not click  FindInstores");
        }
    }
    public void clickOnClickAvailbility(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnAvailability, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnAvailability);
            LoggerHandler.logInfo("click On Resuuts");
            test.log(Status.PASS, "click On Results");
            Screenshot.captureScreenShot("clickeResult");

        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On clickOnBirds");
            test.log(Status.FAIL,"not click OnclickOnBirds");
        }
    }
     public void verifyDelivery(){
        String data=helper.getText(SwarovskiBirdPageLocators.verifyDeliveryoptions);
        //AssertionUtility.verifyText(test, data, "Delivery Options");
        Assert.assertTrue(data.contains("Delivery"));
        LoggerHandler.logInfo("verified the delivery");
        test.log(Status.PASS,"verified the delivery");
    }
    public void Birds(){
        hoverOnDecorations();
        clickOnBirds();
        clickOnMaterial();
        clickOnMetal();
        clickOnResults();
        clickOnFirstProduct();
        clickOnFindInStore();
        clickOnClickAvailbility();
        verifyDelivery();
        

    }
    


}
