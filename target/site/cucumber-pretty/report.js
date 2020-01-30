$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_SignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Module",
  "description": "This sign in feature deals with the sign in functionality of the application",
  "id": "sign-in-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4285629654,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that the user can Sign In through valid Email and Password",
  "description": "",
  "id": "sign-in-module;verify-that-the-user-can-sign-in-through-valid-email-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@A_ValidSignIn"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the Sign In Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter valid email address \"stayseated05@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter valid password \"1111111A\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSD.userIsOnTheSignInScreen()"
});
formatter.result({
  "duration": 4069256454,
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
  "duration": 1237965115,
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
  "duration": 1158007335,
  "status": "passed"
});
formatter.match({
  "location": "SignInSD.userClickOnTheSignInButton()"
});
formatter.result({
  "duration": 1077240367,
  "status": "passed"
});
formatter.after({
  "duration": 144923,
  "status": "passed"
});
});