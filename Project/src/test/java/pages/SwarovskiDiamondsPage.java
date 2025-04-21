package pages;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.WebDriverHelper;

public class SwarovskiDiamondsPage {
     public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiDiamondsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void hoverOnSwarovskiCreatedDiamonds(){
        
    }
}
