Feature: Logout the application

  Background:
    Given the user login into the application

  Scenario: The user wants to log out the app
    When the user clicks the logout button on the account page
    Then the user is sign out from the application