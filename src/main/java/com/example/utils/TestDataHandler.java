package com.example.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataHandler {

    private static final String FILE_PATH = "src/test/resources/testData.properties";
    private static Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream(FILE_PATH)) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String readProperty(String key) {
        return properties.getProperty(key);
    }

    public static void writeToFile(String key, String value) {
        try (FileOutputStream output = new FileOutputStream(FILE_PATH)) {
            properties.setProperty(key, value);
            properties.store(output, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}