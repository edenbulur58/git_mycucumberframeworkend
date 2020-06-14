@datatable5
Feature: scenario outline example
  Scenario Outline:testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new
    And User enters first name "<first>"
    And User enters lastname "<last>"
    And User enters position "<position>"
    And User enters office "<office>"
    And User enters extension "<extension>"
    And User enters startdate "<startdate>"
    And User enters salary "<salary>"
    And clicks create button
    And user enters firstname "<first>" to the searchbox
    Then verify that user see the first name "<first>" in the searchbox

    Examples:Test Data for the DataTables
    |first|last|position|office|extension|startdate|salary|
    |ahmet|kilic|QA|Sivas|346|2020-07-15|3500|
    |fatma|kilic|QA|Sivas|346|2022-07-15|2500|
    |john|walker|Driver|NJ|555|2020-09-08|5500|
    |smith|hay|Developer|DC|222|2020-07-10|7500|


