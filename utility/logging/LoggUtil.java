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
    
    public FileHandler getFileHandler() {
        return fileHandler;
    }

    private LoggUtil(String className) {
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

    public static LoggUtil getInstance(String className) {
        if(null == instance)
            LoggUtil.instance = new LoggUtil(className);

        return LoggUtil.instance;
    }

    // public Logger getLOGGER() {
    //     return LOGGER;
    // }
    
    public void info(String msg){
        this.LOGGER.info(msg);
        this.fileHandler.close();
    }

    public void severe(String msg, Exception exception){
        this.LOGGER.log(Level.SEVERE,msg,exception);
        this.fileHandler.close();
    }
}
