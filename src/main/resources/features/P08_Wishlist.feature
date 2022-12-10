@smoke
Feature: Wishlist Feature | user could add products to wishlist
  Scenario: user click on product to add it to wishlist
    Given user click on HTC One M8 Android L 5.0 Lollipop product
    Then user click add to wishlist button


Scenario: user could view wishlist products and quantity of it
  Given user click on HTC One M8 Android L 5.0 Lollipop product
  And user click add to wishlist button
  And user click on wishlist products label
  Then user could view wishlist product and quantity of it