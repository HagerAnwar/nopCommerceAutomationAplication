@smoke
Feature: Currencies Feature | User could switch between currencies and products price will be appeared based on selected currency

  Scenario: User could switch between currencies and products price will be appeared based on selected currency
    Given user can change current currency to EURO
    Then user should found all products prices in EURO
    Given user can change current currency to US Dollar
    Then user should found all products prices in US Dollar