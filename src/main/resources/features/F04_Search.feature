@smoke
Feature: F04 | user can search for any product

  Scenario Outline: user search using product name
    Given User go to Home page
    When User search with product name "<name>" in search field
    And User click search button
    Then Search results appear with products related to the product name "<name>"

    Examples:
      | name   |
      | book   |
      | laptop |
      | nike   |

  Scenario Outline: Logged user search using product sku
    Given User go to Home page
    When User search with product sku "<sku>" in search field
    And User click search button
    Then Search results appear with products related to the product sku "<sku>"

    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |