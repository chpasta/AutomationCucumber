Feature: Login into Application
  Scenario: Happy Path
    Given Initialize the browser with Chrome
    And Navigate to "QAClickAcademy" Site
    And Click on Login in home page to land on Secure Sign Page
    When User enters "username" and "password" and logs in
    Then Verify that user is succesfully  logged in
