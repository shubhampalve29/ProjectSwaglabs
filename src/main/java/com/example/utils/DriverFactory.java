package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            // Set the path to your ChromeDriver
            //System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver-mac-arm64/chromedriver");
            driver = new ChromeDriver();
            
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}