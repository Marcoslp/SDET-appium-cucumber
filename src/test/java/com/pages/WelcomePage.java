package com.pages;

import com.pages.pageobjects.WelcomePageObjects;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {

    public final WelcomePageObjects welcomePageObjects;

    public WelcomePage() {
        super();
        welcomePageObjects = new WelcomePageObjects();
        PageFactory.initElements(driver, welcomePageObjects);
    }

    public void clickGetStartedButton() {
        waitForElementToBeVisible(welcomePageObjects.getStartedButton);
        welcomePageObjects.getStartedButton.click();
    }

    public boolean verifyWelcomePageIsDisplayed() {
        waitForElementToBeVisible(welcomePageObjects.getStartedButton);
        return welcomePageObjects.getStartedButton.isDisplayed();
    }
}
