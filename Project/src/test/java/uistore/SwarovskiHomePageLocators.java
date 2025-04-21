package uistore;

import org.openqa.selenium.By;

public class SwarovskiHomePageLocators {

// public static By hoverOverJwelleries= By.cssSelector("a[href*=KCQjw2ZfABhDBARI]");
public static By hoverOverJwelleries= By.xpath("(//span[text()='Jewelry'])[1]");
// public static By clickOnPendants= By.cssSelector("a[id='navJewelryPendantsLink'][href*=mDzSHCSg714Vf1RnaOYgaArisEAL]");
public static By clickOnPendants= By.xpath("(//span[text()='Pendants'])[1]");
public static By clickOnMeterial= By.xpath("//span[contains(text(),'Material')]");
public static By clickOnCrystal= By.xpath("(//span[text()='Crystals'])[2]");
public static By clickOnShowProduct= By.cssSelector("button[data-url*='product_material/material-crystals']");
public static By clickOnColor= By.cssSelector("div[data-filter-id='consumer_color']>span[class='swa-filter-category-desktop__filter-name swa-label-sans--small']");
public static By clickOnWhite= By.xpath("//div[@id='dropdown-facet-value-list-consumer_color']/descendant::span[text()='White']");
public static By clickOnShowProduct49= By.xpath("(//span[contains(text(),'49 products')])[4]");
// public static By clickOnFirstProduct= By.xpath("div[class='swa-product-tile-plp']>a[href*=Ariana-Grande-x-Swarovski-pendant]");
public static By clickOnFirstProduct= By.xpath("//span[text()='Ariana Grande x Swarovski pendant']");
public static By verifyFindInStore= By.xpath("//span[text()=' Find in store']");
public static By clickOnAddToBag = By.cssSelector("button[id='addToCartButton']");
public static By clickOnCrossButton = By.xpath("//div[@class='swa-sc-nl-popup__close-icon__image']");

}
