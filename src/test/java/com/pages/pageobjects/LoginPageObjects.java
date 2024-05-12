package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects extends GeneralPageObjects {
    @FindBy(id = "com.hdw.james.rider:id/spinner")
    public WebElement phonePrefixSelectorButton;

    @FindBy(className = "android.widget.ListView")
    public WebElement prefixListView;

    @FindBy(id = "com.hdw.james.rider:id/input")
    public WebElement phoneNumberInput;

    @FindBy(id = "com.hdw.james.rider:id/continueButton")
    public WebElement continueButton;
}
