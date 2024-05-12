package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageObjects {
    @FindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
    public WebElement profilePageTitle;

    @FindBy(id = "com.hdw.james.rider:id/firstNameInput")
    public WebElement firstNameInput;

    @FindBy(id = "com.hdw.james.rider:id/lastNameInput")
    public WebElement lastNameInput;

    @FindBy(id = "com.hdw.james.rider:id/DEFAULT_TEXT_ACTION_MENU_ID")
    public WebElement doneButton;

    @FindBy(id = "com.hdw.james.rider:id/text_input_error_icon")
    public WebElement inputErrorIcon;

    @FindBy(id = "com.hdw.james.rider:id/textinput_error")
    public WebElement invalidFirstName;
}
