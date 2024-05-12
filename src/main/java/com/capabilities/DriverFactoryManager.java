package com.capabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class DriverFactoryManager {

    private static AndroidDriver driver;

    public static void startDriver() {
        try {
            driver = new AndroidDriver(getUrl(), new CapabilitiesManager().getCaps());
        } catch (IllegalArgumentException e) {
            System.out.println("Please select any valid device");
            System.exit(1);
        } catch (UnreachableBrowserException e) {
            System.out.println("Appium server is not started, please start it ");
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static URL getUrl() {
        try {
            return new URI("http://127.0.0.1:4723").toURL();
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
