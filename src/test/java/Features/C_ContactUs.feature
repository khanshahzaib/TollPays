Feature: Contact Us Module
  This Contact Us feature deals with the Contact Us functionality of the application

  @D_ContactUs
  Scenario: Verify that the user can Contact TollPays Admin
    Given user click on the Contact Us button
    When user is on the Contact Us Screen
    And user select the reason of contact
    And user select the account type
    And user enter valid email address for contact "stayseated01@gmail.com"
    And user enter message "Hello World"
    Then user click on the Submit button

