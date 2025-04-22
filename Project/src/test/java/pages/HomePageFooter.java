package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageFooterLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageFooter {
     public static WebDriverHelper helper;
    ExtentTest test;
    public HomePageFooter(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
     /*
     * A. Method name : clickOnCustomerServiceOverview
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on CustomerServiceOverview
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnCustomerServiceOverview(){
        try {
            helper.scrolltoElement(HomePageFooterLocator.clickOnCustomerServiceOverview);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnCustomerServiceOverview, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnCustomerServiceOverview);
            test.log(Status.PASS, "Scroll down and click on CustomerServiceOverview");
            LoggerHandler.logInfo("Scrolled down and clicked on CustomerServiceOverview");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot scroll down and click on CustomerServiceOverview");
            LoggerHandler.logError("Couldnot scroll down and click on CustomerServiceOverview");
        }
    }
     /*
     * A. Method name : verifyURLOfCustomerServiceOverview
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL of CustomerServiceOverview
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfCustomerServiceOverview(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-customer-service-overview/Swarovski-Customer-Service-FAQs/");
            test.log(Status.PASS, "Verify CustomerServiceOverview URL");
            LoggerHandler.logInfo("Verified CustomerServiceOverview URl");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot Verify CustomerServiceOverview URL");
            LoggerHandler.logError("Couldnot Verify CustomerServiceOverview URL");
        }
    }
     /*
     * A. Method name : verifyTitleOfCustomerServiceOverview
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title Of CustomerServiceOverview
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfCustomerServiceOverview(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Customer Service FAQs | Swarovski US");
            test.log(Status.PASS, "Verify CustomerServiceOverview title");
            LoggerHandler.logInfo("Verify CustomerServiceOverview title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot Verify CustomerServiceOverview title");
            LoggerHandler.logError("Couldnot Verify CustomerServiceOverview title");
        }
    }
     /*
     * A. Method name : backward
     * B. Author name : Logisetty Nischith
     * C. Description : Method to backward the page
     * D. Return type : void
     * E. Parameter : Null
     */
    public void backward(){
        try {
            helper.navigateBack();
            test.log(Status.PASS, "navigate back to home page");
            LoggerHandler.logInfo("navigated back to home page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot Navigate to back page");
            LoggerHandler.logInfo("Couldnot Navigate to back page");
        }
    }
    /*
     * A. Method name : clickOnOrderStatus
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click On OrderStatus
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnOrderStatus(){
        try {
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnOrderStatus, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnOrderStatus);
            test.log(Status.PASS, "Click on OrderStatus");
            LoggerHandler.logInfo("Clicked on OrderStatus");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot Click on OrderStatus");
            LoggerHandler.logError("Couldnot Click on OrderStatus");
        }
    }
    /*
     * A. Method name : verifyURLOfOrderStatus
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL Of OrderStatus
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfOrderStatus(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-faq-orderstatus/Swarovski-Order-Status-FAQs/");
            test.log(Status.PASS, "verify OrderStatus URL");
            LoggerHandler.logInfo("verified OrderStatus URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify OrderStatus URL");
            LoggerHandler.logError("Couldnot verify OrderStatus URL");
        }
    }
    /*
     * A. Method name : verifyTitleOfOrderStatus
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title Of OrderStatus
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfOrderStatus(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Order Status FAQs | Swarovski US");
            test.log(Status.PASS, "verify OrderStatus Title");
            LoggerHandler.logInfo("verifed OrderStatus Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify OrderStatus Title");
            LoggerHandler.logError("Couldnot verify OrderStatus Title");
        }
    }
    /*
     * A. Method name : clickOnGiftCardBalance
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click On GiftCardBalance
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnGiftCardBalance(){
        try {
            //helper.scrolltoElement(HomePageFooterLocator.clickOnOrderStatus);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnGiftCardBalance, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnGiftCardBalance);
            test.log(Status.PASS, " Click on GiftCardBalance");
            LoggerHandler.logInfo("Clicked on GiftCardBalance");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on GiftCardBalance");
            LoggerHandler.logError("Couldnot click on GiftCardBalance");
        }
    }
    /*
     * A. Method name : verifyURLOfGiftCardBalance
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL of GiftCardBalance
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfGiftCardBalance(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/giftcard/check/");
            test.log(Status.PASS, "verify GiftCardBalance URL");
            LoggerHandler.logInfo("verified GiftCardBalance URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify GiftCardBalance URL");
            LoggerHandler.logError("Couldnot verify GiftCardBalance URL");
        }
    }
    /*
     * A. Method name : verifyTitleOfGiftCardBalance
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title Of GiftCardBalance
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfGiftCardBalance(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title,"Gift Cards | My Account | Swarovski US");
            test.log(Status.PASS, "verify GiftCardBalance Title");
            LoggerHandler.logInfo("verified GiftCardBalance Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify GiftCardBalance Title");
            LoggerHandler.logError("Couldnot verify GiftCardBalance Title");
        }
    }
    /*
     * A. Method name : clickOnShipping
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on Shipping
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnShipping(){
        try {
            //helper.scrolltoElement(HomePageFooterLocator.clickOnShipping);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnShipping, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnShipping);
            test.log(Status.PASS, "Click on Shipping");
            LoggerHandler.logInfo("Clicked on shipping");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on Shipping");
            LoggerHandler.logError("Couldnot click on Shipping");
        }
    }
    /*
     * A. Method name : verifyURLOfShipping
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL of Shipping
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfShipping(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-faq-shipping/Swarovski-Shipping-FAQs/");
            test.log(Status.PASS, "verify Shipping URL");
            LoggerHandler.logInfo("verified Shipping URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify Shipping URL");
            LoggerHandler.logError("Couldnot verify Shipping URL");
        }
    }
    /*
     * A. Method name : verifyTitleOfShipping
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title of Shipping
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfShipping(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Shipping FAQs | Swarovski US");
            test.log(Status.PASS, "verify Shipping Title");
            LoggerHandler.logInfo("verified Shipping Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify Shipping Title");
            LoggerHandler.logError("Couldnot verify Shipping Title");
        }
    }
    /*
     * A. Method name : clickOnReturnsAndExchange
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on ReturnsAndExchange
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnReturnsAndExchange(){
        try {
            // helper.scrolltoElement(HomePageFooterLocator.clickOnReturnsAndExchange);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnReturnsAndExchange, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnReturnsAndExchange);
            test.log(Status.PASS, "click On ReturnsAndExchange");
            LoggerHandler.logInfo("clicked On ReturnsAndExchange");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on ReturnsAndExchange");
            LoggerHandler.logError("Couldnot click on ReturnsAndExchange");
        }
    }
    /*
     * A. Method name : verifyURLOfReturnsAndExchange
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL Of ReturnsAndExchange
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfReturnsAndExchange(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-faq-return/");
            test.log(Status.PASS, "verify ReturnsAndExchange URL");
            LoggerHandler.logInfo("verified ReturnsAndExchange URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify ReturnsAndExchange URL");
            LoggerHandler.logError("Couldnot verify ReturnsAndExchange URL");
        }
    }
    /*
     * A. Method name : verifyTitleOfReturnsAndExchange
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title of ReturnsAndExchange
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfReturnsAndExchange(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Swarovski Returns & Exchange FAQ | Swarovski US");
            test.log(Status.PASS, "verify ReturnsAndExchange Title");
            LoggerHandler.logInfo("verify ReturnsAndExchange Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify ReturnsAndExchange Title");
            LoggerHandler.logError("Couldnot verify ReturnsAndExchange Title");
        }
    }
    /*
     * A. Method name : clickOnContactUs
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on ContactUs
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnContactUs(){
        try {
            helper.scrolltoElement(HomePageFooterLocator.clickOnContactUs);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnContactUs, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnContactUs);
            test.log(Status.PASS, "click on ContactUs");
            LoggerHandler.logInfo("clicked on ContactUs");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on ContactUs");
            LoggerHandler.logError("Couldnot click on ContactUs");
        }
    }
    /*
     * A. Method name : verifyURLOfContactUs
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL of ContactUs
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfContactUs(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/contact/");
            test.log(Status.PASS, "verify ContactUs URL");
            LoggerHandler.logInfo("verified ContactUs URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify ContactUs URL");
            LoggerHandler.logError("Couldnot verify ContactUs URL");
        }
    }
     /*
     * A. Method name : verifyTitleLOfContactUs
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title of ContactUs
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfContactUs(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title,"Contact Us - Customer Service | Swarovski US");
            test.log(Status.PASS, "verify ContactUs Title");
            LoggerHandler.logInfo("verified ContactUs Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify ContactUs Title");
            LoggerHandler.logError("Couldnot verify ContactUs Title");
        }
    }
     /*
     * A. Method name : clickOnSizeGuide
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on SizeGuide
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnSizeGuide(){
        try {
           // helper.scrolltoElement(HomePageFooterLocator.clickOnSizeGuide);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnSizeGuide, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnSizeGuide);
            test.log(Status.PASS, "click on SizeGuide");
            LoggerHandler.logInfo("clicked on SizeGuide");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on SizeGuide");
            LoggerHandler.logError("Couldnot click on SizeGuide");
        }
    }
     /*
     * A. Method name : verifyURLOfSizeGuide
     * B. Author name : Logisetty Nischith
     * C. Description : Method to  verify URL of SizeGuide
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfSizeGuide(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.swarovski.com/en-US/s-swarovski-ring-size/");
            test.log(Status.PASS, "verify SizeGuide URL");
            LoggerHandler.logInfo("verified SizeGuide URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify SizeGuide URL");
            LoggerHandler.logError("Couldnot verify SizeGuide URL");
        }
    } /*
    * A. Method name : verifyTitleOfSizeGuide
    * B. Author name : Logisetty Nischith
    * C. Description : Method to verify Title of SizeGuide
    * D. Return type : void
    * E. Parameter : Null
    */
    public void verifyTitleOfSizeGuide(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title, "Ring Size Guide: How to measure your ring size | Swarovski US");
            test.log(Status.PASS, "verify SizeGuide Title");
            LoggerHandler.logInfo("verified SizeGuide Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify SizeGuide Title");
            LoggerHandler.logError("Couldnot verify SizeGuide Title");
        }
    }
     /*
     * A. Method name : clickOnStoreFinder
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on StoreFinder
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnStoreFinder(){
        try {
           // helper.scrolltoElement(HomePageFooterLocator.clickOn);
            helper.waitForElementToBeVisible(HomePageFooterLocator.clickOnStoreFinder, 10);
            helper.clickOnElement(HomePageFooterLocator.clickOnStoreFinder);
            test.log(Status.PASS, "click on StoreFinder");
            LoggerHandler.logInfo("clicked on StoreFinder");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot click on StoreFinder");
            LoggerHandler.logError("Couldnot click on StoreFinder");
        }
    }
     /*
     * A. Method name : verifyURLOfStoreFinder
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify URL of StoreFinder
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyURLOfStoreFinder(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertEquals(url,"https://www.swarovski.com/en-US/store-finder/");
            test.log(Status.PASS, "verify StoreFinder URL");
            LoggerHandler.logInfo("verified StoreFinder URL");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify StoreFinder URL");
            LoggerHandler.logError("Couldnot verify StoreFinder URL");
        }
    }
     /*
     * A. Method name : verifyTitleOfStoreFinder
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Title of StoreFinder
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyTitleOfStoreFinder(){
        try {
            String title=Base.driver.getTitle();
            Assert.assertEquals(title,"Swarovski Store Finder - Find a Store Near You | Swarovski US");
            System.out.println(title);
            test.log(Status.PASS, "verify StoreFinder Title");
            LoggerHandler.logInfo("verified StoreFinder Title");
        } catch (Exception e) {
            test.log(Status.FAIL, "Couldnot verify StoreFinder Title");
            LoggerHandler.logError("Couldnot verify StoreFinder Title");
        }
    }
     /*
     * A. Method name : verifyMembership
     * B. Author name : Logisetty Nischith
     * C. Description : Method to verify Membership
     * D. Return type : void
     * E. Parameter : Null
     */
    public void verifyMembership(){
        try {
            String data=helper.getText(HomePageFooterLocator.clickOnMembership);
            Assert.assertTrue(data.contains("MEMBERSHIP"));
            test.log(Status.PASS, "Verified text Membership");
            LoggerHandler.logInfo("Verified text Membership");
            Screenshot.captureScreenShot("MemberShip ScreenShot");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Membership");
            LoggerHandler.logError("Not verified text Membership");
        }
    }
    public void testFooter(){
        clickOnCustomerServiceOverview();
        verifyURLOfCustomerServiceOverview();
        verifyTitleOfCustomerServiceOverview();
        backward();
        clickOnOrderStatus();
        verifyURLOfOrderStatus();
        verifyTitleOfOrderStatus();
        backward();
        clickOnGiftCardBalance();
        verifyURLOfGiftCardBalance();
        verifyTitleOfGiftCardBalance();
        backward();
        clickOnShipping();
        verifyURLOfShipping();
        verifyTitleOfShipping();
        backward();
        clickOnReturnsAndExchange();
        verifyURLOfReturnsAndExchange();
        verifyTitleOfReturnsAndExchange();
        backward();
        clickOnContactUs();
        verifyURLOfContactUs();
        verifyTitleOfContactUs();
        backward();
        clickOnSizeGuide();
        verifyURLOfSizeGuide();;
        verifyTitleOfSizeGuide();
        backward();
        clickOnStoreFinder();
        verifyURLOfStoreFinder();
        verifyTitleOfStoreFinder();
        backward();
        verifyMembership();
    }
}
