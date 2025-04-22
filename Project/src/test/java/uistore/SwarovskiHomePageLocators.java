package uistore;

import org.openqa.selenium.By;

public class SwarovskiHomePageLocators {
    public static By clickOnsearchIcon = By.xpath("(//a[@data-url='/en-US/search/autocomplete/SEARCH-BOX/'])[2]");
    public static By clickOnsearchBar = By.cssSelector("input[placeholder='Search']");
    // Poojitha
    public static By hoverOnAccessories = By.xpath("(//span[text()='Accessories'])[1]");
    public static By clickOnSunglasses = By.cssSelector("#navAccessoriesSunglassesLink");
    public static By clickOnMaterial = By.xpath("//span[contains(text(),'Material')]");
    public static By clickOnAcetate = By.xpath("(//span[text()='Acetate'])[2]");
    public static By clickOnShowProducts = By.cssSelector("span.swa-button__text swa-label-sans--medium-strong");
    public static By clickOnFirstProduct = By.xpath("(//span[text()='Sunglasses'])[8]");
    public static By clickonCareandMaintainence = By.cssSelector("#tabby-toggle_swa-accessible-ALWAYSON_PDP_ACC-ENTRY_CARE_ROW");
    public static By bookAnAppointmnet = By.xpath("//a[contains(text(),'Book an appointment')]");
    public static By verifyLogin = By.xpath("(//span[contains(text(),'Login')])[1]");
    public static By hoverOnDecorations = By.xpath("(//span[text()='Decorations'])[1]");
    public static By clickOnBirds = By.cssSelector("#navDecorationsNatureBirdsLink");
}
