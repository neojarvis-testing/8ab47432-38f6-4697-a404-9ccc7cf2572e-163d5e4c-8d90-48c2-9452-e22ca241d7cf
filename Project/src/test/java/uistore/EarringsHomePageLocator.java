package uistore;

import org.openqa.selenium.By;

public class EarringsHomePageLocator {
public static By clickOnMaterial = By.cssSelector("div[data-filter-id='product_material']");
public static By clickOnGemstone = By.cssSelector("label[for='filter-product_material-material-gemstone58']");
public static By clickOnZircoina = By.cssSelector("label[for='filter-product_material-material-zirconia70']");
public static By clickOnShowProduct = By.cssSelector("button[data-url='/en-US/search/f/product_material/material-gemstone/product_material/material-zirconia/?text=Earrings&sort=relevance']"); 
public static By clickOnFirstProduct= By.cssSelector("a[data-gtm-product-position='1']");
public static By clickOnBookAppointment= By.id("#tabby-toggle_swa-accessible-ALWAYSON_PDP_ACC-ENTRY_Book-an-appointment");
public static By verifyDescription = By.id("#tabby-toggle_swa-accessible-description");
}
