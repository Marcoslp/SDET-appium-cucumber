package com.stepDefinitions;

import com.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginStepsDefinition {

    @Given("the user clicks on the get started button")
    public void theUserClicksOnTheGetStartedButton() {
        Assertions.assertTrue(new WelcomePage().verifyWelcomePageIsDisplayed());
        new WelcomePage().clickGetStartedButton();
    }

    @Then("the login page is displayed")
    public void theLoginPageIsDisplayed() {
        Assertions.assertTrue(new LoginPage().loginPageIsDisplayed());
    }

    @When("the user enters a prefix number: {string} and a phone number: {string}")
    public void theUserEntersTheirPrefixNumberAndPhoneNumber(String prefixNumber, String phoneNumber) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPrefixList();
        loginPage.scrollToTopAndClick(prefixNumber);
        loginPage.enterPhoneNumber(phoneNumber);
    }

    @And("the user continue to the next page")
    public void theUserPressesTheContinueButton() {
        new LoginPage().clickContinueButton();
    }

    @Then("the user is redirected to the get code page")
    public void theUserIsRedirectedToTheGetCodePage() {
        Assertions.assertTrue(new VerifySmsCodePage().verifySmsCodePageIsDisplayed());
    }

    @When("the user enters the received code: {string}")
    public void theUserEntersTheReceivedVerificationCode(String code) {
        new VerifySmsCodePage().enterSixDigitCode(code);
    }

    @And("attempts to continue to the next page")
    public void theUserAttemptsToContinueToTheNextPage() {
        new VerifySmsCodePage().clickContinueButton();
    }

    @Then("the user is prompted to accept permissions")
    public void theUserIsPromptedToAcceptPermissions() {
        Assertions.assertTrue(new PermissionsRequestPage().verifyPermissionsPageIsDisplayed());
    }

    @When("the user accepts the permissions")
    public void theUserAcceptsThePermissions() {
        PermissionsRequestPage permissionsRequestPage = new PermissionsRequestPage();
        permissionsRequestPage.clickAllowLocationPermissions();
        permissionsRequestPage.clickAllowNotificationsPermissions();
        permissionsRequestPage.clickContinueButton();
    }

    @Then("the user should be successfully logged in")
    public void theUserShouldBeSuccessfullyLoggedIn() {
        Assertions.assertTrue(new RidesPage().verifyRidesPageIsDisplayed());
    }

    @When("the user enters an invalid code: {string}")
    public void theUserEntersAnInvalidVerificationCodeInvalid_verification_code(String invalidCode) {
        new VerifySmsCodePage().enterSixDigitCode(invalidCode);
    }

    @Then("the user gets an error message")
    public void theUserGetsAnErrorMessage() {
        Assertions.assertTrue(new VerifySmsCodePage().verifyErrorSnackbarIsPresent());
    }
}
