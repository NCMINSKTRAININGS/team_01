package by.nc.teamone.utils;


import org.apache.log4j.Logger;

public enum LoggerError {
    INSTANCE;
    private Logger logger;
    public void logError(Class sender, String message){
        logger = Logger.getLogger(sender);
        logger.error(message);
    }
}

 //LoggerError.INSTANCE.logError(AddBrigadeCommand.class, e.getMessage()); так вызываем в каждом эксепшне