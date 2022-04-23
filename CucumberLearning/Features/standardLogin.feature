Feature: login feature

Description: sldjfsdg

Background: 

Given user is in login page using "<browser>"


Scenario Outline: login with standard user

#Given user is in login page
When user insert username "<username>"
When user insert password "<password>"
And user click on login button
Then user should be able to login

Examples: 

|username|password|browser|
|problem_user|secret_sauce|chrome|
|statndard_user|secret_sauce|firefox|



#Scenario: login with problem user

#Given user is in login page
#When user insert username problem user
#When user insert password
#And user click on login button
#Then user should be able to login


