Feature: login feature

Description: sldjfsdg

Background: 

Given user is in login page

Scenario: login with standard user

#Given user is in login page
When user insert username
When user insert password
And user click on login button
Then user should be able to login


Scenario: login with problem user

#Given user is in login page
When user insert username problem user
When user insert password
And user click on login button
Then user should be able to login