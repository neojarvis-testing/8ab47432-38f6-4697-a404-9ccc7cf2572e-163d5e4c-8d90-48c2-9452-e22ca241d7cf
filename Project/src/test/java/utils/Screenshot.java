package utils;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
 
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.google.common.io.Files;
public class Screenshot extends Base {
    public static TakesScreenshot ts;
    /*
     * a.Method Name: captureScreenShot.
     * b.Author Name: Sarika
     * c.Description: This method  is used to capture screenshot.
     * d.Parameters: It will take filename.
     * e.Return Type: void will be the return type.
     */
    public static void captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename +"_" +timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.logError(e.getMessage());
        }
    }
    /*
     * a.Method Name: captureHighlightScreenShot.
     * b.Author Name: Sarika
     * c.Description: This method  is used to capture High light ScreenShot.
     * d.Parameters: It will take filename and locator.
     * e.Return Type: void will be the return type.
     */
    public static void captureHighlightScreenShot(String filename, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
 
            // Apply yellow background highlight to the element before capturing full screenshot
            js.executeScript("arguments[0].style.backgroundColor='red';", element);
            Thread.sleep(500); // Small delay to let the highlight reflect
 
            // Capture full-page screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage img = ImageIO.read(screenshot);
 
 
            // Save highlighted screenshot
            File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }
            File target = new File(screenshotsDir, filename + ".png");

            ImageIO.write(img, "png", target);
         // Reset element background color to default after screenshot capture
            js.executeScript("arguments[0].style.backgroundColor='';", element);
 
        } catch (Exception e) {
            LoggerHandler.logError(e.getMessage());
        }
    }
    /*
     * a.Method Name: captureSpecificScreenShot.
     * b.Author Name: Sarika
     * c.Description: This method  is used to capture Specific ScreenShot.
     * d.Parameters: It will take filename and locator.
     * e.Return Type: void will be the return type.
     */
    public static void captureSpecificScreenShot(String filename,By locator) {
    	WebElement element=driver.findElement(locator);
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        File file = element.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file,target);
        } catch (IOException e) {
            LoggerHandler.logError(e.getMessage());
        }
    }
}
