@datatable3
Feature: scenario outline example
  Scenario:testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new
    And User enters first name
    And User enters lastname
    And User enters position
    And User enters first office
    And User enters first extension
    And User enters startdate
    And User enters salary
    And clicks create button
    And user enters firstname to the searchbox
    Then verify that user see the first name in the searchbox


