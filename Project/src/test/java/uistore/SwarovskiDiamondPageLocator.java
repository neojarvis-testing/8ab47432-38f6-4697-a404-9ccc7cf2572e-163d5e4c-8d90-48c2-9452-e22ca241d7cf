package uistore;

import org.openqa.selenium.By;

public class SwarovskiDiamondPageLocator {
    public static By hoverOnSwarovskiCreatedDiamonds = By.xpath("(//span[text()='Swarovski Created Diamonds'])[1]");
    public static By clickOnEternity = By.cssSelector("a[id='navSCDEternityCollectionLinkUSCA'][rel='Eternity']>span[class='swa-cms-link-component__content']");
    public static By clickOnCategories = By.id("filter-dropdown-count-category");
    public static By clickOnRings = By.xpath("(//li[@class='swa-filter-list-item']/child::input[@class='swa-filter-list-item__input js-filter-reload' and @id='filter-category-0106']/following-sibling::label[contains(text(),'Rings')])[2]");
    public static By clickOnShowProducts = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
    public static By clickOnMaterial = By.id("filter-dropdown-count-product_material");
    public static By clickOnSterlingSilver = By.xpath("(//label[@for='filter-product_material-material-sterling-silver']/child::span[text()='Sterling silver'])[2]");
    public static By clickOnShowButton = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']");
    public static By clickOnFirstRing = By.cssSelector("a[data-gtm-product-id='M5697430']>div[class='swa-product-tile-plp__information']>p>span[class='swa-product-tile-plp__information__title swa-product-sans--name']");
    public static By checkSizeText = By.xpath("//h6[contains(text(),'Select size')]");

}
