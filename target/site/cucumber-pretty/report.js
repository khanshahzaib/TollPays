$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_SignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Module",
  "description": "This sign in feature deals with the sign in functionality of the application",
  "id": "sign-in-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4569229973,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that the user can enter Valid URL",
  "description": "",
  "id": "sign-in-module;verify-that-the-user-can-enter-valid-url",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@A_LoginUrl"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user enter the correct URL",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSD.userEnterTheCorrectURL()"
});
formatter.result({
  "duration": 3123190051,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify that the user can Sign In through valid Email Address and Password",
  "description": "",
  "id": "sign-in-module;verify-that-the-user-can-sign-in-through-valid-email-address-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@B_ValidSignIn"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is on the Sign In Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter valid email address \"stayseated05@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter valid password \"1111111A\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on the Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSD.userIsOnTheSignInScreen()"
});
formatter.result({
  "duration": 231138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stayseated05@gmail.com",
      "offset": 32
    }
  ],
  "location": "SignInSD.userEnterValidEmailAddress(String)"
});
formatter.result({
  "duration": 855571106,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111111A",
      "offset": 27
    }
  ],
  "location": "SignInSD.userEnterValidPassword(String)"
});
formatter.result({
  "duration": 658510460,
  "status": "passed"
});
formatter.match({
  "location": "SignInSD.userClickOnTheSignInButton()"
});
formatter.result({
  "duration": 595848628,
  "status": "passed"
});
formatter.after({
  "duration": 887052693,
  "status": "passed"
});
});