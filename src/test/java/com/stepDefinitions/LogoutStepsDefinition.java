package com.stepDefinitions;

import com.pages.LoginPage;
import com.pages.RidesPage;
import com.pages.UserAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepsDefinition {

    @When("the user clicks the logout button on the account page")
    public void theUserClicksTheLogoutButtonOnTheAccountPage() {
        new RidesPage().clickOpenAccountMenuButton();
        UserAccountPage userAccountPage = new UserAccountPage();
        Assert.assertTrue(userAccountPage.verifyAccountPageIsVisible());
        userAccountPage.clickSignOutButton();
    }

    @Then("the user is sign out from the application")
    public void theUserIsSignOutFromTheApplication() {
        Assert.assertTrue(new LoginPage().loginPageIsDisplayed());
    }
}
