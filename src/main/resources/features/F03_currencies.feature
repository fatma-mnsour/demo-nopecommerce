@smoke
Feature: F03 | user could switch currencies from US to Euro

  Scenario: User change currency from US to Euro
    Given User go to Home page
    When User select euro currency from drop down menu
    Then All items prices change to euro