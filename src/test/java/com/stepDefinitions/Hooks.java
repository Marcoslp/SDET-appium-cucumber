package com.stepDefinitions;

import com.capabilities.DriverFactoryManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {
    @Before
    public void initializeDriver() throws IOException {
        DriverFactoryManager.startDriver();
    }

    @After
    public void tearDownDriver() {
        DriverFactoryManager.quitDriver();
    }
}
