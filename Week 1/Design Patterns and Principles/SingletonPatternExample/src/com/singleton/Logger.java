package com.singleton;

public class Logger {
    // Private static instance of Logger (eager initialization)
    private static Logger instance = new Logger();

    // Private constructor to prevent external instantiation
    private Logger() 
    {
        System.out.println("Logger instance created");
    }

    // Public method to provide access to the single instance
    public static Logger getInstance() 
    {
        return instance;
    }

    // A sample method to simulate logging
    public void log(String message) 
    {
        System.out.println("[LOG]: " + message);
    }
}
