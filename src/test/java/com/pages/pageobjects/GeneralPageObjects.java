package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralPageObjects {

    @FindBy(id = "com.hdw.james.rider:id/title")
    public WebElement pageTitle;

    @FindBy(id = "com.hdw.james.rider:id/description")
    public WebElement description;

    @FindBy(id = "com.hdw.james.rider:id/continueButton")
    public WebElement continueButton;

    @FindBy(id = "com.hdw.james.rider:id/snackbar_text")
    public WebElement errorSnackbarMessage;
}
