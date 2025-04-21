package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.SwarovskiHomePageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
public class SwarovskiHomePage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public SwarovskiHomePage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void hoverOnAccessories(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.hoverOnAccessories, 10);
            helper.hoverElement(SwarovskiHomePageLocators.hoverOnAccessories);
            LoggerHandler.logInfo("hover on Accessories");
            test.log(Status.PASS, "hover on Accessories");
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
            helper.hoverElement(SwarovskiHomePageLocators.clickOnSunglasses);
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
        AssertionUtility.verifyCondition(test, url,"Sunglasses");

    }
    public void clickOnMaterial(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnSunglasses, 10);
            helper.hoverElement(SwarovskiHomePageLocators.clickOnSunglasses);
            LoggerHandler.logInfo("clickOnSunglasses");
            test.log(Status.PASS, "clickOnSunglasses");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not clickOnSunglasses");
            test.log(Status.FAIL,"not clickOnSunglasses");
        }
    }

}
