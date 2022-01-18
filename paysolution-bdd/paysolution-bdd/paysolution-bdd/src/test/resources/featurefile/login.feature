Feature: Login Form

  @regression
  Scenario: Verify User able to fill Sign up form successfully
    Given User is on Login Page
    When User click on Its ok message
    And User click on Sign up tab
    And User enter FirstName "Minal"
    And User enter LastName "Patel"
    And User enter UserName "07444445557"
    And User enter Password "123@Abc999"
    And User click on Create an account tab
    Then User successfully entered Sign up page

