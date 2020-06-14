@FHCLoginParameters @second
Feature:login feature with parameters
  Scenario:TC04_user should login with manager creditioanal
    Given user is on the fhctriplogin page
    When enter correct username "manager2"
    And enter correct password "Man1ager2!"
    And click Login button
    Then verify the login is successful
