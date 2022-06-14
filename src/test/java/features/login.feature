Feature: Login into Application
  Scenario: Happy Path
    Given Initialize the browser with Chrome
    And Navigate to "http://qaclickacademy.com/" Site
    And Click on Login in home page to land on Secure Sign Page
    When User enters "carlos@gmail.com" and "1234" and logs in
    Then Verify that user is successfully  logged in
