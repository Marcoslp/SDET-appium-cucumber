package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PermissionsRequestPageObjects {
    @FindBy(id = "com.hdw.james.rider:id/permissionsTextTitle")
    public WebElement permissionsPageTitle;

    @FindBy(id = "com.hdw.james.rider:id/permissionsText")
    public WebElement permissionsTextBody;

    @FindBy(id = "com.hdw.james.rider:id/permissionsLocationText")
    public WebElement locationPermissions;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Notifications\"]")
    public WebElement notificationsPermissions;

    @FindBy(id = "com.hdw.james.rider:id/permissionsLocationButton")
    public WebElement allowLocationPermissionsButton;

    @FindBy(id = "com.hdw.james.rider:id/permissionsNotificationButton")
    public WebElement allowNotificationPermissionsButton;

    @FindBy(id = "com.hdw.james.rider:id/permissionsContinueButton")
    public WebElement permissionsContinueButton;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement allowPermissionsWhileUsingTheAppButton;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowNotificationsButton;
}
