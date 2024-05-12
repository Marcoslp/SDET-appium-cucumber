Feature: Login attempts into James app

  Scenario Outline: User login into the app
    Given the user clicks on the get started button
    Then the login page is displayed
    When the user enters a prefix number: <prefix_number> and a phone number: <phone_number>
    And the user continue to the next page
    Then the user is redirected to the get code page
    When the user enters the received code: <verification_code>
    And attempts to continue to the next page
    Then the user is prompted to accept permissions
    When the user accepts the permissions
    Then the user should be successfully logged in

    Examples:
      | prefix_number        | phone_number | verification_code |
      | " Afghanistan (+93)" | "701111112"  | "123456"          |

  Scenario Outline: User enters a wrong verification code
    Given the user clicks on the get started button
    Then the login page is displayed
    When the user enters a prefix number: <prefix_number> and a phone number: <phone_number>
    And the user continue to the next page
    Then the user is redirected to the get code page
    When the user enters an invalid code: <invalid_verification_code>
    And attempts to continue to the next page
    Then the user gets an error message

    Examples:
      | prefix_number        | phone_number | invalid_verification_code |
      | " Afghanistan (+93)" | "701111112"  | "458194"                  |