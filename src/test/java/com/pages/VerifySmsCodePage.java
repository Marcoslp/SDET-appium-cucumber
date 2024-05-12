package com.pages;

import com.pages.pageobjects.GeneralPageObjects;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class VerifySmsCodePage extends BasePage {

    private final GeneralPageObjects verifySmsPageObjects;
    private final By codeInput = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.hdw.james.rider:id/input\"])[1]");

    public VerifySmsCodePage() {
        verifySmsPageObjects = new GeneralPageObjects();
        PageFactory.initElements(driver, verifySmsPageObjects);
    }

    public boolean verifySmsCodePageIsDisplayed() {
        waitForElementToBeVisible(codeInput);
        waitForElementToBeVisible(verifySmsPageObjects.description);
        waitForElementToBeVisible(verifySmsPageObjects.pageTitle);
        return verifySmsPageObjects.pageTitle.isDisplayed() && verifySmsPageObjects.pageTitle.isDisplayed();
    }

    public boolean verifyErrorSnackbarIsPresent() {
        waitForElementToBeVisible(verifySmsPageObjects.errorSnackbarMessage);
        return verifySmsPageObjects.errorSnackbarMessage.isDisplayed() && verifySmsPageObjects.errorSnackbarMessage.getText().equals("Too many attempts. Please try again later.");
    }

    public void clickContinueButton() {
        verifySmsPageObjects.continueButton.click();
    }

    public void enterSixDigitCode(String code) {
        for (int digitIndex = 0; digitIndex < 6; digitIndex++) {
            String selector = String.format("new UiSelector().resourceId(\"com.hdw.james.rider:id/input\").instance(%d)", digitIndex);
            WebElement input = driver.findElement(AppiumBy.androidUIAutomator(selector));
            String currentDigit = String.valueOf(code.charAt(digitIndex));

            Map<String, Object> params = new HashMap<>();
            params.put("element", input);
            params.put("text", currentDigit);
            driver.executeScript("mobile: type", params);
        }
    }
}
