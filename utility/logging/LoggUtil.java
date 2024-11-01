package utility.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import utility.constants.FilePaths;

public class LoggUtil{
    private final Logger LOGGER;
    private final FileHandler fileHandler;
    private static boolean isFirstCall = true;
    
    public FileHandler getFileHandler() {
        return fileHandler;
    }

    public LoggUtil(String classNameString) throws SecurityException, IOException{
        LOGGER = Logger.getLogger(classNameString);
        
        this.fileHandler = new FileHandler(FilePaths.MAC_LOG_FILE.getPath(),!isFirstCall);
        
        fileHandler.setFormatter(new SimpleFormatter());

        LogManager.getLogManager().reset();
        LOGGER.addHandler(fileHandler);

        LoggUtil.isFirstCall = false;
    }

    public Logger getLOGGER() {
        return LOGGER;
    }
    
    public void info(String msg){
        this.LOGGER.info(msg);
        this.fileHandler.close();
    }
}
