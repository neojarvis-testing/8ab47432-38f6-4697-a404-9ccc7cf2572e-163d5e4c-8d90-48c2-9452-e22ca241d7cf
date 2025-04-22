package uistore;

import org.openqa.selenium.By;

public class SwarovskiDiamondPageLocator {

    //Kartik Bameta
    public static By hoverOnSwarovskiCreatedDiamonds = By.xpath("(//span[text()='Swarovski Created Diamonds'])[1]");
    public static By clickOnEternity = By.xpath("(//span[text()='Eternity'])[1]");
    public static By clickOnCategories = By.xpath("//span[contains(text(),'Categories')]");
    public static By clickOnRings = By.xpath("(//label[contains(text(),'Rings')])[2]");
    public static By clickOnShowProducts = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
    public static By clickOnMaterialDropDown = By.cssSelector("div[class='swa-filter-category-desktop__item js-swa-filter-dropdown-trigger']>span[class='swa-filter-category-desktop__filter-name swa-label-sans--small swa-label-sans--small-strong']");
    public static By clickOnSterlingSilver = By.cssSelector("li[class='swa-filter-list-item swa-filter-list-item--size'][style='-ms-grid-row: 4; -ms-grid-column: 1; grid-row: 4; grid-column: 1;']>label[class='swa-size-label swa-filter-list-item__label swa-label-sans--small'][for='filter-product_material-material-sterling-silver'][data-code='material-sterling-silver']>span[class='swa-size-caption']");
    public static By clickOnShowButton = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']");
    public static By clickOnFirstRing = By.cssSelector("a[data-gtm-product-id='M5697430']>div[class='swa-product-tile-plp__information']>p>span[class='swa-product-tile-plp__information__title swa-product-sans--name']");
    public static By checkSizeText = By.xpath("//h6[contains(text(),'Select size')]");

}
