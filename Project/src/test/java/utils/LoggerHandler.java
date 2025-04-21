package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {

    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        try {
            //creating the file with time stamp
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
            
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d{ISO8601} %-5p - %m%n"), logFileName, true);
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error("Fail to genreate logs", e);
        }
    }

    /*
     * a.Method Name: logTrace.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Trace.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logTrace(String message) {
        logger.trace(message);
    }
    /*
     * a.Method Name: logDebug.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Debug.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logDebug(String message) {
        logger.debug(message);
    }
    /*
     * a.Method Name: logInfo.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Info.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logInfo(String message) {
        logger.info(message);
    }
    /*
     * a.Method Name: logWarn.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Warn.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logWarn(String message) {
        logger.warn(message);
    }
    /*
     * a.Method Name: logError.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Error.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logError(String message) {
        logger.error(message);
    }
    /*
     * a.Method Name: logFatal.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to log Fatal.
     * d.Parameters: String message
     * e.Return Type: void
     */
    public static void logFatal(String message) {
        logger.fatal(message);
    }

    
}
