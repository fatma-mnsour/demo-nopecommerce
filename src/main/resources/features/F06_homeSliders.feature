@smoke
Feature: F06 | User can select between options in home slider

  Scenario: First slider is clickable on home page
    Given User go to Home page
    When User click on first slider
    Then User should be navigated to first slider details page

  Scenario: Second slider is clickable on home page
    Given User go to Home page
    When User click on second slider
    Then User should be navigated to second slider details page