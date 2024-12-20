package utility.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import utility.constants.FilePaths;

public class LoggUtil{
    public static LoggUtil instance;

    private Logger LOGGER;
    private FileHandler fileHandler;
    private static boolean isFirstCall = true;

    private LoggUtil(final String className) {
        
        LOGGER = Logger.getLogger(className);
        
        try {
            this.fileHandler = new FileHandler(FilePaths.MAC_LOG_FILE.getPath(),!isFirstCall);
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        fileHandler.setFormatter(new SimpleFormatter());

        LogManager.getLogManager().reset();
        LOGGER.addHandler(fileHandler);

        LoggUtil.isFirstCall = false;
    }

    public static LoggUtil getInstance(final String className) {
        if(null == instance)
            LoggUtil.instance = new LoggUtil(className);

        return LoggUtil.instance;
    }
    
    //Log info
    public void info(final String msg){
        this.LOGGER.info(msg);
    }

    //Log warnings
    public void warning(final String string) {
        this.LOGGER.warning(string);
    }

    //Log exceptions
    public void severe(final String msg, final Exception exception){
        this.LOGGER.log(Level.SEVERE,msg,exception);
    }
}
