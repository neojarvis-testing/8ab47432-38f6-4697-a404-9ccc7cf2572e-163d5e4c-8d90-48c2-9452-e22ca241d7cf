package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    public WebDriver driver;
    String home;
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        home = driver.getWindowHandle();
    }

    /*
     * A. Method name : waitForElementToBeVisible
     * B. Author name : Logisetty Nischith
     * C. Description : Method to wait for an element until it is Visible
     * D. Return type : void
     * E. Parameter : Null
     */
    public void waitForElementToBeVisible(By path, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(path));
        } catch (Exception e) {
           LoggerHandler.logError(e.getMessage());
        }
    }
     /*
     * A. Method name : waitForElementToBeClickable
     * B. Author name : Logisetty Nischith
     * C. Description : Method to wait until the element is click
     * D. Return type : void
     * E. Parameter : Null
     */
    public void waitForElementToBeClickable(By path, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(path));
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : clickOnElement
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on element
     * D. Return type : void
     * E. Parameter : Null
     */
    public void clickOnElement(By path) {
        try {
            driver.findElement(path).click();
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : sendData
     * B. Author name : Logisetty Nischith
     * C. Description : Method to send data
     * D. Return type : void
     * E. Parameter : Null
     */
    public void sendData(By path, String value) {
        try {
            driver.findElement(path).sendKeys(value);
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : enterAction
     * B. Author name : Logisetty Nischith
     * C. Description : Method to click on enter button
     * D. Return type : void
     * E. Parameter : Null
     */
    public void enterAction(By path) {
        try {
            driver.findElement(path).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : hoverElement
     * B. Author name : Logisetty Nischith
     * C. Description : Method to hover on element
     * D. Return type : void
     * E. Parameter : Null
     */
    public void hoverElement(By path) {
        try {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(path);
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }
    public void mouseClick(By path) {
        try {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(path);
            action.click(element).build().perform();
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : hoverClick
     * B. Author name : Logisetty Nischith
     * C. Description : Method to hover and click
     * D. Return type : void
     * E. Parameter : Null
     */
    public void hoverClick(By path) {
        try {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(path);
            action.click(element).build().perform();
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    /*
     * A. Method name : swtichWindow
     * B. Author name : Logisetty Nischith
     * C. Description : Method to swtich the window
     * D. Return type : void
     * E. Parameter : Null
     */
    public void switchWindow(By path) {
        try {
            String parent = driver.getWindowHandle();
            clickOnElement(path);
            Set<String> set = driver.getWindowHandles();
            for (String child : set) {
                if (!child.equals(parent)) {
                    driver.switchTo().window(child);
                    break;
                }
            }
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }

    public void switchToHome(){
        driver.switchTo().window(home);
    }

    /*
     * A. Method name : getElements
     * B. Author name : Logisetty Nischith
     * C. Description : Method to itearte the elements based on path
     * D. Return type : void
     * E. Parameter : Null
     */
    public List<WebElement> getElements(By path) {
        return driver.findElements(path);
    }

    /*
     * A. Method name : selectFromDropDownByVisableText
     * B. Author name : Logisetty Nischith
     * C. Description : Method to selectFromDropDownByVisableText
     * D. Return type : void
     * E. Parameter : Null
     */
    public void selectFromDropDownByVisableText(By path, String value) {
        try {
            WebElement element = driver.findElement(path);
            Select select = new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * A. Method name : selectFromDropDownByValue
     * B. Author name : Logisetty Nischith
     * C. Description : Method to selectFromDropDownByValue
     * D. Return type : void
     * E. Parameter : Null
     */

    public void selectFromDropDownByValue(By path, String value) {
        try {
            WebElement element = driver.findElement(path);
            Select select = new Select(element);
            select.selectByValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * A. Method name : getText
     * B. Author name : Logisetty Nischith
     * C. Description : Method to getText to the given path
     * D. Return type : void
     * E. Parameter : Null
     */
    public String getText(By path) {
        return driver.findElement(path).getText();
    }

    /*
     * A. Method name : scrollByPixel
     * B. Author name : Logisetty Nischith
     * C. Description : Method to scroll down By Pixel
     * D. Return type : void
     * E. Parameter : Null
     */
    public void scrollByPixel(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x, y);
    }

    /*
     * A. Method name : scrollByPath
     * B. Author name : Logisetty Nischith
     * C. Description : Method to scroll to element
     * D. Return type : void
     * E. Parameter : Null
     */
    public void scrolltoElement(By path) {
        WebElement element = driver.findElement(path);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void navigateBack()
    {
        Base.driver.navigate().back();
    }
}