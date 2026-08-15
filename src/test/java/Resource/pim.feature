Feature: PIM

  Scenario: Login and Function of PIM
    Given I am on OrangeHRM Login Page
    When you enter username "Admin" and Password "admin123"
    And User login successfully with valid credentials
    And click on pim
    And click on emplist
    And click on add button and enter firstname and lastname
    And click on save button
    And click on report and record report
    Then view list of report details
    //
