package com.pages;

import com.pages.pageobjects.RidesPageObjects;

import org.openqa.selenium.support.PageFactory;

public class RidesPage extends BasePage {

    public final RidesPageObjects ridesPageObjects;

    public RidesPage() {
        ridesPageObjects = new RidesPageObjects();
        PageFactory.initElements(driver, ridesPageObjects);
    }

    public boolean verifyRidesPageIsDisplayed() {
        waitForElementToBeVisible(ridesPageObjects.ridesTitle);
        return ridesPageObjects.ridesTitle.isDisplayed();
    }

    public void clickOpenAccountMenuButton(){
        ridesPageObjects.openAccountMenuButton.click();
    }
}
