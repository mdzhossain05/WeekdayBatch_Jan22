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
  "line": 12,
  "name": "login with standard user",
  "description": "",
  "id": "login-feature;login-with-standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user insert username",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_sauce_demo()"
});
formatter.result({
  "duration": 9748160000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_username()"
});
formatter.result({
  "duration": 797057800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 469974500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 812167600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 44500,
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
  "duration": 5256604100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "login with standard user",
  "description": "",
  "id": "login-feature;login-with-standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Given user is in login page"
    }
  ],
  "line": 12,
  "name": "user insert username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_insert_username()"
});
formatter.result({
  "duration": 923647400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 570812600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 662954500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 37900,
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
  "duration": 5190358800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "login with problem user",
  "description": "",
  "id": "login-feature;login-with-problem-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Given user is in login page"
    }
  ],
  "line": 21,
  "name": "user insert username problem user",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user insert password",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_insert_username_problem_user()"
});
formatter.result({
  "duration": 503919100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_password()"
});
formatter.result({
  "duration": 669068600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 662437200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 43200,
  "status": "passed"
});
});