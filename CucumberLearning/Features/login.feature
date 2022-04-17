#BDD - Behaviourial Driven Development - Cucumber Framework
#ODD - Object Driven Development - separating web elements fro script - Page object model
#DDD - Data Driven Development - separting data from script - e.g. testng.xml
#Gherkin Language

#Author - Zakir
#Date - 04/17/2022


Feature: login feature

Scenario: login with standard user

Given user is in login page
When user insert username
When user insert password
And user click on login button
Then user should be able to login


