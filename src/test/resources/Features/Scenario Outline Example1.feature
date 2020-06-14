@datatable4 @regression
Feature: scenario outline example
  Scenario:testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new
    And User enters first name "Fatih"
    And User enters lastname "Kılıc"
    And User enters position "QA"
    And User enters office "Sivas"
    And User enters extension "346"
    And User enters startdate "2020-07-15"
    And User enters salary "3500"
    And clicks create button
    And user enters firstname "Fatih" to the searchbox
    Then verify that user see the first name "Fatih" in the searchbox


