@smoke
Feature: Login Feature | User could log in with valid email and password

  Scenario: user could log in with valid email and password
    Given user click on login icon
    When user login with "Hager@mail.com" and "SecretPassword"
    And user click on login button
    Then user login to the system successfully and see my account tab

  Scenario: user couldn't log in with invalid email and password
    Given user click on login icon
    When user login with "notregistered@mail.com" and "invalidpassword"
    And user click on login button
    Then user should see error message that Login was unsuccessful