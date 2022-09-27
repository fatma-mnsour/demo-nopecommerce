@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user choose the Gender
    And user enters valid first name
    And user enters valid last name
    And user select valid birth date
    And user insert valid email address
    And user insert valid password
    And user insert again the same valid password
    And user clicks on register button
    Then success message is displayed