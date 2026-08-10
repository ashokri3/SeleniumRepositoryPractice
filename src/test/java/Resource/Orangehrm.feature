Feature: Login Page

  Scenario: Successful login
    Given I am on OrangeHRM Login Page
    When you enter username "Admin" and Password "admin123"
    Then User login successfully with valid credentials
