@smoke
Feature: Registration Feature | New user could register with new account


  Scenario: user could register with valid successfully

    Given user click on registration page
    When user choose gender
    And user enter valid "Hager" "Anwar" "Hager@mail.com" "SecretPassword" and "SecretPassword"
    And user enter his or her date of birth "16/10/1992"
    And user click on register button
    Then user should see success message