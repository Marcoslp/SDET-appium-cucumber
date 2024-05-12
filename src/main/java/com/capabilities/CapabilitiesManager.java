package com.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    public DesiredCapabilities getCaps() throws IOException {
        Properties props = new PropertyManager().getProps();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", props.getProperty("platformName"));
        caps.setCapability("automationName", props.getProperty("androidAutomationName"));
        caps.setCapability("platformVersion", props.getProperty("platformVersion"));
        caps.setCapability("deviceName", props.getProperty("deviceName"));
        caps.setCapability("appPackage", props.getProperty("appPackage"));
        caps.setCapability("appActivity", props.getProperty("appActivity"));
        String androidAppUrl = new File(props.getProperty("androidAppLocation")).getAbsolutePath();
        caps.setCapability("app", androidAppUrl);

        return caps;
    }
}
