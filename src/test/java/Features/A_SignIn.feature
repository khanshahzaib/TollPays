Feature: Sign In Module
  This sign in feature deals with the sign in functionality of the application

  @A_LoginUrl
  Scenario: Verify that the user can enter Valid URL
    Given user enter the correct URL

  @B_ValidSignIn
  Scenario: Verify that the user can Sign In through valid Email Address and Password
    Given user is on the Sign In Screen
    When user enter valid email address "stayseated05@gmail.com"
    And user enter valid password "1111111A"
    Then user click on the Sign In button

