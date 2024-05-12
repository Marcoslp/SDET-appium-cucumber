package com.pages;

import com.pages.pageobjects.UserAccountPageObjects;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends BasePage {

    public UserAccountPageObjects userAccountPageObjects;

    public UserAccountPage() {
        userAccountPageObjects = new UserAccountPageObjects();
        PageFactory.initElements(driver, userAccountPageObjects);
    }

    public boolean verifyAccountPageIsVisible() {
        waitForElementToBeVisible(userAccountPageObjects.accountTitle);
        return userAccountPageObjects.accountTitle.isDisplayed();
    }

    public void clickGoToProfileButton() {
        userAccountPageObjects.profileName.click();
    }

    public boolean verifyUserFirstAndLastNames(String firstName, String lastName) {
        return userAccountPageObjects.profileName.getText().equals(firstName + " " + lastName);
    }

    public boolean verifySuccessSnackbarMessageIsPresent() {
        waitForElementToBeVisible(userAccountPageObjects.profileUpdatedMessage);
        return userAccountPageObjects.profileUpdatedMessage.isDisplayed() && userAccountPageObjects.profileUpdatedMessage.getText().equals("Profile updated successfully");
    }

    public void clickSignOutButton() {
        userAccountPageObjects.signOutButton.click();
    }
}
