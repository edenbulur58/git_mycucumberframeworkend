@FHCLogin @smoketest
Feature:login feature
  Scenario:TC_03 FHCtrip Login
    Given user is on the fhctriplogin page
    When enter correct username
    And enter correct password
    And click Login button
    Then verify the login is successful
