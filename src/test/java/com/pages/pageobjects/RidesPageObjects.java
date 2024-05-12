package com.pages.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RidesPageObjects {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Rides\"]")
    public WebElement ridesTitle;

    @FindBy(id = "com.hdw.james.rider:id/MAIN_MENU_ID")
    public WebElement openAccountMenuButton;
}
