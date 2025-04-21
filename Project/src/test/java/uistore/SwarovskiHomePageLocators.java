package uistore;

import org.openqa.selenium.By;

public class SwarovskiHomePageLocators {
    public static By hoverOnAccessories  = By.cssSelector("#navAccessoriesLink");
    //public static By hoverOnAccessories=By.xpath("(//span[text()='Accessories'])[1]");
    //public static By clickOnSunglasses=By.cssSelector("#navAccessoriesSunglassesLink");
    public static By clickOnSunglasses=By.xpath("(//a[@id='navAccessoriesSunglassesLink'])[1]");
    //public static By clickOnMaterial=By.cssSelector("span[id='filter-dropdown-count-product_material']") ;
    public static By clickOnMaterial=By.xpath("//span[contains(text(),'Material')]");
    //public static By clickOnAcetate=By.cssSelector("#dropdown-facet-value-list-product_material > li:nth-child(0)");
    public static By clickOnAcetate=By.xpath("(//span[text()='Acetate'])[2]");
    public static  By clickOnShowProducts=By.cssSelector("span.swa-button__text swa-label-sans--medium-strong");
    public static By clickOnFirstProduct=By.xpath("//span[text()='Pillow shape, Purple']");
    public static By clickonCareandMaintainence=By.cssSelector("#tabby-toggle_swa-accessible-ALWAYSON_PDP_ACC-ENTRY_CARE_ROW");
    public static By bookAnAppointmnet=By.cssSelector("#tabby-toggle_swa-accessible-ALWAYSON_PDP_ACC-ENTRY_Book-an-appointment");
    public static By verifyLogin=By.xpath("(//a[@class='swa-link js-swa-header-login js-header-links'])[1]");



    





}
