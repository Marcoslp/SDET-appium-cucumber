package com.stepDefinitions;

import io.cucumber.java.en.Given;

public class GeneralStepsDefinition {

    @Given("the user login into the application")
    public static void theUserLoginIntoTheApplication() {
        LoginStepsDefinition steps = new LoginStepsDefinition();
        steps.theUserClicksOnTheGetStartedButton();
        steps.theLoginPageIsDisplayed();
        steps.theUserEntersTheirPrefixNumberAndPhoneNumber(" Afghanistan (+93)", "701111112");
        steps.theUserPressesTheContinueButton();
        steps.theUserIsRedirectedToTheGetCodePage();
        steps.theUserEntersTheReceivedVerificationCode("123456");
        steps.theUserAttemptsToContinueToTheNextPage();
        steps.theUserIsPromptedToAcceptPermissions();
        steps.theUserAcceptsThePermissions();
        steps.theUserShouldBeSuccessfullyLoggedIn();
    }
}
