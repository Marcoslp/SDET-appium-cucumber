Feature: Edit user profile

  Background:
    Given the user login into the application
    When the user goes to their profile

  Scenario: User edit first and last name
    And edits their first and last name
    And save the changes
    Then the profile is updated

  Scenario: User enters an invalid first name
    And leaves empty the first name field
    And save the changes
    Then an error message is displayed

  Scenario: User leaves their last name empty
    And leaves empty the last name field
    And save the changes
    Then the profile is updated
