Feature:Function of Buzz

  Scenario:End to End buzz functions
    Given I am on OrangeHRM Login Page
    When you enter username "Admin" and Password "admin123"
    And User login successfully with valid credentials
    And i click on buzz button
    And we click configuration dropdown and select event value
    And click on add button
    And enter details of eventname,description
    Then Click on Save button
