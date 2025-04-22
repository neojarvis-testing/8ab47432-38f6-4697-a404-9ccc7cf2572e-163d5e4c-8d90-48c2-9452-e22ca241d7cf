package uistore;

import org.openqa.selenium.By;

public class SwarovskiHomePageLocators {

//NISCHITH
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

//Kartik Bameta
public static By hoverOnGifts = By.xpath("(//span[text()='Gifts'])[1]");
public static By clickOnWeddingGifts = By.cssSelector("div[data-text-track='Gifts > Occasions > Wedding gifts']>a[rel='Wedding gifts']");
public static By clickOnCategories = By.xpath("//span[@class='swa-filter-category-desktop__filter-name swa-label-sans--small' and contains(text(),'Categories')]");
public static By clickOnWatches = By.xpath("(//li[@class='swa-filter-list-item']/child::label[contains(text(),'Watches')])[2]");
public static By clickOnAllWatches = By.cssSelector("label[for='filter-category-0202']");
public static By clickOnShowAll = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
// public static By clickOnFilter = By.id("filter-dropdown-count-product_material");
public static By clickOnMaterialDropDown = By.id("filter-dropdown-count-product_material");
public static By clickOnStainlessSteel = By.xpath("(//span[@class='swa-size-caption' and text()='Stainless steel'])[2]");
public static By clickOnShowAllButton = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
public static By clickOnFirstProductWatch = By.cssSelector("a[data-gtm-product-id='M5724515']>div[class='swa-product-tile-plp__information']>p>span[class='swa-product-tile-plp__information__title swa-product-sans--name']");
public static By addToCartText = By.xpath("//span[text()='Add to bag']");


//SAFIUR
public static By hoverOverJwelleries= By.xpath("(//span[text()='Jewelry'])[1]");
public static By clickOnPendants= By.xpath("(//span[text()='Pendants'])[1]");
public static By clickOnMeterial= By.xpath("//span[contains(text(),'Material')]");
public static By clickOnCrystal= By.xpath("(//span[text()='Crystals'])[2]");
public static By clickOnShowProduct= By.cssSelector("button[data-url*='product_material/material-crystals']");
public static By clickOnColor= By.cssSelector("div[data-filter-id='consumer_color']>span[class='swa-filter-category-desktop__filter-name swa-label-sans--small']");
public static By clickOnWhite= By.xpath("//div[@id='dropdown-facet-value-list-consumer_color']/descendant::span[text()='White']");
public static By clickOnShowProduct49= By.xpath("(//span[contains(text(),'49 products')])[4]");
public static By clickOnPendentFirstProduct= By.xpath("//span[text()='Ariana Grande x Swarovski pendant']");
public static By verifyFindInStore= By.xpath("//span[text()=' Find in store']");
public static By clickOnAddToBag = By.xpath("//span[text()='Add to bag']");
public static By clickOnCrossButton = By.xpath("//div[@class='swa-sc-nl-popup__close-icon__image']");
}