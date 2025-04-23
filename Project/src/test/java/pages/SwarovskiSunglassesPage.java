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
     /*
     * a.Method Name:hoverOnAccessories
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to hover On Accessories.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
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
     /*
     * a.Method Name:clickOnSunglasses()
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnSunglasses.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
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
      /*
     * a.Method Name:verifyUrlSunglasses
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verify the sunglasses.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyUrlSunglasses(){
        String url=Base.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Sunglasses"));
        LoggerHandler.logInfo("Sssertoin done");
        test.log(Status.PASS, "clickOnMaterial");
    }
      /*
     * a.Method Name:clickOn Material
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click on material.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
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
      /*
     * a.Method Name:clickOnAcetate
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnAcetate
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
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
      /*
     * a.Method Name:clickOnShowProduct
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click on showProduct.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnShowProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnShowProducts, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnShowProducts);
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains("material-acetate"));
            LoggerHandler.logInfo("click On ShowProducts");
            test.log(Status.PASS, "click OnShowProducts");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On ShowProducts");
            test.log(Status.FAIL,"not click On ShowProducts");
        }
    }
      /*
     * a.Method Name:clickOn First Product
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOn First product.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnFirstProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiHomePageLocators.clickOnFirstProduct, 10);
            helper.clickOnElement(SwarovskiHomePageLocators.clickOnFirstProduct);
            String title=Base.driver.getTitle();
            Assert.assertTrue(title.contains("Sunglasses"));
            LoggerHandler.logInfo("click On FirstProduct");
            test.log(Status.PASS, "click On FirstProduct");
        }
        catch(Exception e){
            e.printStackTrace();
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
      /*
     * a.Method Name:clickOnCareAndMaintainece
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnCareand Maintainence
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
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
      /*
     * a.Method Name:verifying book an appointment
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verifying book an appointment.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyBookanAppointment(){
        String data=helper.getText(SwarovskiHomePageLocators.bookAnAppointmnet);
        AssertionUtility.verifyText(test, data,"Book an appointment");
    }
     /*
     * a.Method Name:verifying  the login
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verifying  login text.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyLogin(){
        String data=helper.getText(SwarovskiHomePageLocators.verifyLogin);
        AssertionUtility.verifyText(test, data, "Login");
    }
    public void testSunglass(){
        hoverOnAccessories();
        clickOnSunglasses();
        verifyUrlSunglasses();
        clickOnMaterial();
        clickOnAcetate();
        clickOnFirstProduct();
        clickOnCareandMaintanece();
        verifyBookanAppointment();
    }
}
