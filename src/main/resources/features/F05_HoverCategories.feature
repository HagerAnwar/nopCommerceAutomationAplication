@smoke
Feature: Hovering Categories Feature | User could hover on main categories and select related sub categories

  Scenario: User could hover on Apparel category and select clothing sub category

    When user hover on Apparel category
    And user select clothing sub category
    Then user navigate to clothing page successfully