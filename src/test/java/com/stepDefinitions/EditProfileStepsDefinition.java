package com.stepDefinitions;

import com.helpers.StringsHelper;
import com.pages.ProfilePage;
import com.pages.RidesPage;
import com.pages.UserAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class EditProfileStepsDefinition {

    @When("the user goes to their profile")
    public void theUserGoesToProfile() {
        new RidesPage().clickOpenAccountMenuButton();
        UserAccountPage userAccountPage = new UserAccountPage();
        Assertions.assertTrue(userAccountPage.verifyAccountPageIsVisible());
        userAccountPage.clickGoToProfileButton();
        Assertions.assertTrue(new ProfilePage().verifyProfilePageIsVisible());
    }

    @And("edits their first and last name")
    public void userEditNames() {
        ProfilePage profilePage = new ProfilePage();
        profilePage.editFirstName(StringsHelper.newFirstName);
        profilePage.editLastName(StringsHelper.newLastName);
    }

    @And("save the changes")
    public void userSaveChanges() {
        new ProfilePage().clickDoneButton();
    }

    @Then("the profile is updated")
    public void userProfileIsUpdated() {
        Assertions.assertTrue(new UserAccountPage().verifyUserFirstAndLastNames(StringsHelper.newFirstName, StringsHelper.newLastName));
        Assertions.assertTrue(new UserAccountPage().verifySuccessSnackbarMessageIsPresent());
    }

    @And("leaves empty the first name field")
    public void leavesEmptyTheFirstNameField() {
        new ProfilePage().editFirstName(StringsHelper.EMPTY_STRING);
    }

    @And("leaves empty the last name field")
    public void leavesEmptyTheLastNameField() {
        StringsHelper.updateLastName(StringsHelper.EMPTY_STRING);
        new ProfilePage().editLastName(StringsHelper.EMPTY_STRING);
    }

    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
        ProfilePage profilePage = new ProfilePage();
        Assertions.assertTrue(profilePage.verifyInvalidFirstNameErrorMessageIsVisible());
        Assertions.assertTrue(profilePage.verifyInvalidFirstNameIconIsVisible());
    }
}
