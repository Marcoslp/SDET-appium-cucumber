package com.pages;

import com.pages.pageobjects.LoginPageObjects;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class LoginPage extends BasePage {

    private final LoginPageObjects loginPageObjects;
    
    public LoginPage() {
        loginPageObjects = new LoginPageObjects();
        PageFactory.initElements(driver, loginPageObjects);
    }

    public boolean loginPageIsDisplayed() {
        waitForElementToBeVisible(loginPageObjects.description);
        waitForElementToBeVisible(loginPageObjects.pageTitle);
        return loginPageObjects.description.isDisplayed() && loginPageObjects.pageTitle.isDisplayed();
    }

    public void openPrefixList() {
        loginPageObjects.phonePrefixSelectorButton.click();
    }

    public void scrollToTopAndClick(String prefix) {
        waitForElementToBeVisible(loginPageObjects.prefixListView);
        Map<String, Object> params = new HashMap<>();
        params.put("element", loginPageObjects.prefixListView);
        params.put("direction", "down");
        params.put("percent", 1);
        params.put("speed", 30000);

        driver.executeScript("mobile: swipeGesture", params);
        driver.executeScript("mobile: swipeGesture", params);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + prefix + "\")")).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        loginPageObjects.phoneNumberInput.click();
        loginPageObjects.phoneNumberInput.sendKeys(phoneNumber);
    }

    public void clickContinueButton() {
        loginPageObjects.continueButton.click();
    }
}
