package org.jetBrains.javacore.practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.XMLFormatter;


public class LoggerPractice {

    private static Logger logger = LogManager.getLogger(LoggerPractice.class);

    @Test
    public void testLogger1(){
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(org.jetBrains.javacore.practice.LoggerPractice.class.getName());
        logger.log(Level.INFO, "Logging Started... " + logger.getName());

    }

    @Test
    public void testLogger() throws IOException {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoggerPractice.class.getName());
        logger.log(Level.INFO, "Logging Started... " + logger.getName());

        Handler fileHandler = new FileHandler("src/main/resources/default.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());
        logger.info("Info log message");
    }

    @Test
    public void testLoggerPropertiesFile(){
        System.out.println("Hello World!");
            logger.debug("This is a debug message");
            logger.info("This is an info message");
            logger.warn("This is a warn message");
            logger.error("This is an error message");
            logger.fatal("This is a fatal message");
        }


}
