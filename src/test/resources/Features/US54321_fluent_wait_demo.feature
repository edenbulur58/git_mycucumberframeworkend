@wip1
Feature: fluent wait demo
  Scenario: fluent wait scenerio
    Given user is on the demo page
    And user cliks on the Start button
    And user waits fluently until the page loads and verify the text message