package com.pages;

import com.pages.pageobjects.PermissionsRequestPageObjects;
import org.openqa.selenium.support.PageFactory;

public class PermissionsRequestPage extends BasePage {

    public final PermissionsRequestPageObjects permissionsRequestPageObjects;

    public PermissionsRequestPage() {
        permissionsRequestPageObjects = new PermissionsRequestPageObjects();
        PageFactory.initElements(driver, permissionsRequestPageObjects);
    }

    public boolean verifyPermissionsPageIsDisplayed() {
        waitForElementToBeVisible(permissionsRequestPageObjects.permissionsTextBody);
        waitForElementToBeVisible(permissionsRequestPageObjects.permissionsPageTitle);
        return permissionsRequestPageObjects.permissionsPageTitle.isDisplayed() & permissionsRequestPageObjects.permissionsTextBody.isDisplayed();
    }

    public void clickContinueButton() {
        permissionsRequestPageObjects.permissionsContinueButton.click();
        new RidesPage();
    }

    public void clickAllowLocationPermissions() {
        permissionsRequestPageObjects.allowLocationPermissionsButton.click();
        waitForElementToBeVisible(permissionsRequestPageObjects.allowPermissionsWhileUsingTheAppButton);
        permissionsRequestPageObjects.allowPermissionsWhileUsingTheAppButton.click();
    }

    public void clickAllowNotificationsPermissions() {
        waitForElementToBeVisible(permissionsRequestPageObjects.allowNotificationPermissionsButton);
        permissionsRequestPageObjects.allowNotificationPermissionsButton.click();
        waitForElementToBeVisible(permissionsRequestPageObjects.allowNotificationsButton);
        permissionsRequestPageObjects.allowNotificationsButton.click();
    }
}
