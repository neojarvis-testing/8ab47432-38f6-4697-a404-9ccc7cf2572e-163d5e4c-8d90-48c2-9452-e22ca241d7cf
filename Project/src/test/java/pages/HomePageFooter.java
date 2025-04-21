package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageFooterLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageFooter {
     public static WebDriverHelper helper;
    ExtentTest test;
    public HomePageFooter(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void clickOnCustomerServiceOverview(){
        try {
            helper.scrolltoElement(HomePageFooterLocator.clickOnCustomerServiceOverview);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnCustomerServiceOverview, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnCustomerServiceOverview);
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void verifyURLOfCustomerServiceOverview(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-customer-service-overview/Swarovski-Customer-Service-FAQs/");
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void verifyTitleOfCustomerServiceOverview(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Customer Service FAQs | Swarovski US");
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void backward(){
        try {
            helper.navigateBack();
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logInfo("");
            // TODO: handle exception
        }
    }
    public void clickOnOrderStatus(){
        try {
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnOrderStatus, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnOrderStatus);
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void verifyURLOfOrderStatus(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-faq-orderstatus/Swarovski-Order-Status-FAQs/");
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void verifyTitleOfOrderStatus(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Order Status FAQs | Swarovski US");
            test.log(Status.PASS, "");
            LoggerHandler.logInfo("");
        } catch (Exception e) {
            test.log(Status.FAIL, "");
            LoggerHandler.logError("");
        }
    }
    public void testCase8(){
        clickOnCustomerServiceOverview();
        verifyURLOfCustomerServiceOverview();
        verifyTitleOfCustomerServiceOverview();
        backward();
        clickOnOrderStatus();
        verifyURLOfOrderStatus();
        verifyTitleOfOrderStatus();
    }
}
