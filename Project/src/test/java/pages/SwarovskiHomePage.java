package pages;

import com.aventstack.extentreports.ExtentTest;

import utils.Base;
import utils.WebDriverHelper;

public class SwarovskiHomePage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SwarovskiHomePage(){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

}
