package com.pages;

import com.pages.pageobjects.ProfilePageObjects;
import com.pages.pageobjects.UserAccountPageObjects;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {
    public ProfilePageObjects profilePageObjects;

    public ProfilePage() {
        profilePageObjects = new ProfilePageObjects();
        PageFactory.initElements(driver, profilePageObjects);
    }

    public void editFirstName(String firstName) {
        profilePageObjects.firstNameInput.sendKeys(firstName);
    }

    public void editLastName(String lastName) {
        profilePageObjects.lastNameInput.sendKeys(lastName);
    }

    public void clickDoneButton(){
        profilePageObjects.doneButton.click();
    }

    public boolean verifyProfilePageIsVisible() {
        waitForElementToBeVisible(profilePageObjects.profilePageTitle);
        return profilePageObjects.profilePageTitle.isDisplayed();
    }

    public boolean verifyInvalidFirstNameIconIsVisible(){
        waitForElementToBeVisible(profilePageObjects.inputErrorIcon);
        return profilePageObjects.inputErrorIcon.isDisplayed();
    }

    public boolean verifyInvalidFirstNameErrorMessageIsVisible(){
        waitForElementToBeVisible(profilePageObjects.invalidFirstName);
        return profilePageObjects.invalidFirstName.isDisplayed();
    }

}
