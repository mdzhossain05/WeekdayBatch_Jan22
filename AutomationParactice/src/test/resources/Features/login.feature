#BDD - Behaviourial Driven Development - Cucumber Framework
#ODD - Object Driven Development - separating web elements fro script - Page object model
#DDD - Data Driven Development - separting data from script - e.g. testng.xml
#Gherkin Language

#Author - Zakir
#Date - 04/17/2022


Feature: login feature

@smoke
Scenario: login with performance glitch user

Given user is in login page
When user insert username performance glitch user
When user insert password
And user click on login button
Then user should be able to login


Scenario: login with loced out user user

Given user is in login page
When user insert username locked out user
When user insert password
And user click on login button
Then user should be able to login
