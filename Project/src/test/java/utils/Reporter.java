package utils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
public class Reporter extends Base {
    public static TakesScreenshot ts;
    public static ExtentTest test;
    public static ExtentReports report;
    public static ExtentSparkReporter sparkReporter;
    /*
     * a.Method Name: createExtentReport.
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to create the extentReport.
     * d.Parameters: It will take report name.
     * e.Return Type: ExtentReports will be the return type.
     */
    public static ExtentReports createExtentReport(String reportName) {
        report = new ExtentReports();
        sparkReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir") + "/reports/" + reportName + ".html"));
        sparkReporter.config().setDocumentTitle("Swarovski_Automation_Report");
        sparkReporter.config().setTheme(Theme.DARK);
        report.attachReporter(sparkReporter);
        return report;
    }
    /*
     * a.Method Name: takeScreenshot.
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to take the screenshot that needs to attach to the report.
     * d.Parameters: It will take name of the image .
     * e.Return Type: The return type will be String.
     */
    public static String takeScreenShot(String imagename) {
        try {
            String name = imagename + ".png";
            String destPath = "./" + name;
            ts = (TakesScreenshot) driver;
            File target = new File(System.getProperty("user.dir") + "/reports/screenshots", name);
            if (!target.getParentFile().exists()) target.getParentFile().mkdirs();
            Files.copy(ts.getScreenshotAs(OutputType.FILE), target);
            return destPath;

        } catch (IOException e) {
             LoggerHandler.logError(e.getMessage());
        }
        return "";
    }
     /*
     * a.Method Name: logScreenshottoReport.
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to attach take the screenshot  to the report.
     * d.Parameters: it will take 3 parameters:name of the report file,test and the description of that report.
     * e.Return Type: The return type will be String.
     */
    public static void logScreenshottoReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(filename)).build());
        } catch (Exception e) {
             LoggerHandler.logError(e.getMessage());
        }
    }
}