@datatable @smoketest
Feature: Single data table
  Scenario Outline: TC05_google search test
    Given user is on the google page
    And user searched for "<value>"
    Then verify the result has "<value>"

    Examples:Test Data
      | value |
    |iphone  |
    |istanbul|
    |apple   |
    |orange  |