@smoke
Feature: Search Feature | User will be able to search for products by product Name or using SKU

  Scenario: User could search for product using product name
    When user click on search box
    And user type name of product
    Then user should find relative results


  Scenario: User could search for product using SKU
    When user click on search box
    And user type what he or she want to search using sku of product
    Then user could find the correct product