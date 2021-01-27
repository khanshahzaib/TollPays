Feature: Sign In Module
  This sign in feature deals with the sign in functionality of the application

  @A_LoginUrl
  Scenario: Verify that the user can enter Valid URL
    Given user enter the correct URL

  @B_ValidSignIn
  Scenario: Verify that the user can Sign In through valid Email Address and Password
    Given user is on the Sign In Screen
    When user click on the Sign In Button
    When user enter valid email address
    And user enter valid password
    Then user click on the Sign In Submit button

