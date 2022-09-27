@smoke
Feature: F05 | user could select different Categories

  Scenario: User select subcategory
    Given User go to Home page
    When User hover to a category and click on one of its subcategories
    Then User should be navigated to a page contains products about that subcategory
