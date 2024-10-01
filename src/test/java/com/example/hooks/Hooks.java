package com.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.example.utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initializeDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}