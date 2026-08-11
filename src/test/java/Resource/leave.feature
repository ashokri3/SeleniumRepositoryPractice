Feature: Leave Management

  Scenario: To Check for Leave History
    Given I am on OrangeHRM Login Page
    When you enter username "Admin" and Password "admin123"
    And User login successfully with valid credentials
    And click on leaves
   // And click on myleave
    And selecting fromdate and todate
    And selecting leavestatusdropdown and itsvalue
    And selecting leavetypedropdown and itsvalue
    Then click on search button

