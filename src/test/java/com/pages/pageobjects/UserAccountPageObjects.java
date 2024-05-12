package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPageObjects {
    @FindBy(xpath = "//android.widget.TextView[@text=\"Account\"]")
    public WebElement accountTitle;

    @FindBy(id = "com.hdw.james.rider:id/profileName")
    public WebElement profileName;

    @FindBy(id = "com.hdw.james.rider:id/snackbar_text")
    public WebElement profileUpdatedMessage;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hdw.james.rider:id/title\" and @text=\"SIGN OUT\"]")
    public WebElement signOutButton;
}
