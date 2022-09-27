@smoke
Feature: F07 | User could open followUs links

  Scenario: User opens facebook link
    Given User go to Home page
    When User click on Facebook icon
    Then New tab with this URL "https://www.facebook.com/nopCommerce" is opened

  Scenario: User opens twitter link
    Given User go to Home page
    When User click on Twitter icon
    Then New tab with this URL "https://twitter.com/nopCommerce" is opened

  Scenario: User opens RSS link
    Given User go to Home page
    When User click on RSS icon
    Then New tab with this URL "https://demo.nopcommerce.com/new-online-store-is-open" is opened

  Scenario: User opens youtube link
    Given User go to Home page
    When User click on Youtube icon
    Then New tab with this URL "https://www.youtube.com/user/nopCommerce" is opened