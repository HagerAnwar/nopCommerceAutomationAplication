@smoke
Feature: Follow Us Feature | User could open Follow us links
  Scenario: user click on Facebook icon and should be redirected to Facebook
    When user click on Facebook icon
    Then user should be redirected Facebook


  Scenario: user click on Twitter icon and should be redirected to Twitter
    When user click on Twitter icon
    Then user should be redirected Twitter


  Scenario: user click on News icon and should be redirected to News
    When user click on News icon
    Then user should be redirected News


  Scenario: user click on YouTube icon and should be redirected to YouTube
    When user click on YouTube icon
    Then user should be redirected YouTube