$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#BDD - Behaviourial Driven Development - Cucumber Framework"
    },
    {
      "line": 2,
      "value": "#ODD - Object Driven Development - separating web elements fro script - Page object model"
    },
    {
      "line": 3,
      "value": "#DDD - Data Driven Development - separting data from script - e.g. testng.xml"
    },
    {
      "line": 4,
      "value": "#Gherkin Language"
    },
    {
      "line": 6,
      "value": "#Author - Zakir"
    },
    {
      "line": 7,
      "value": "#Date - 04/17/2022"
    }
  ],
  "line": 10,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "login with performance glitch user",
  "description": "",
  "id": "login-feature;login-with-performance-glitch-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user insert username performance glitch user",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_sauce_demo()"
});
formatter.result({
  "duration": 9473804600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_username_performance_glitch_user()"
});
formatter.result({
  "duration": 967371500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 550199000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 5809754900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 37500,
  "status": "passed"
});
formatter.uri("standardLogin.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "\r\nDescription: sldjfsdg",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_sauce_demo()"
});
formatter.result({
  "duration": 5416489200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "login with standard user",
  "description": "",
  "id": "login-feature;login-with-standard-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Given user is in login page"
    }
  ],
  "line": 13,
  "name": "user insert username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_insert_username()"
});
formatter.result({
  "duration": 1144955900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 533664100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 906488800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 45500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_sauce_demo()"
});
formatter.result({
  "duration": 7434653100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "login with problem user",
  "description": "",
  "id": "login-feature;login-with-problem-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#Given user is in login page"
    }
  ],
  "line": 22,
  "name": "user insert username problem user",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_insert_username_problem_user()"
});
formatter.result({
  "duration": 1337193700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 652207700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 728023900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 50600,
  "status": "passed"
});
});