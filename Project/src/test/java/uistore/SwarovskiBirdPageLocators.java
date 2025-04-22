package uistore;

import org.openqa.selenium.By;

public class SwarovskiBirdPageLocators {
    //Poojitha
    public static By clickOnMetal=By.xpath("(//span[text()='Metal'])[2]");
    public static By clickOnResults=By.xpath("//span[contains(text(),'Show 15 products')]");
    public static By clickOnFirstProduct=By.xpath("//span[text()='Idyllia Sugarbird and Cactus Flower']");
    public static By clickOnFindinstore=By.cssSelector("div[class='swa-product-delivery-options__option js-check-instore-availability-popup-button js-trackingdata-checkInstoreAvailabilityPdpButton'] div[class='swa-product-delivery-options__option-content']");
    public static By clickOnAvailability=By.cssSelector("#checkInstoreAvailabilityBtn_5675166");
    public static By verifyDeliveryoptions=By.cssSelector("h6[class='swa-product-delivery-options__title swa-label-sans--medium-strong']");


}
