Feature: login feature

Description: sldjfsdg



#Given user is in login page using "<browser>"


Scenario Outline: login with standard user

#Given user is in login page
Given user is in login page using "<browser>"
When user insert username "<username>"
When user insert password "<password>"
And user click on login button
Then user should be able to login

Examples: 

|username|password|browser|
|standard_user|secret_sauce|chrome|
|standard_user|secret_sauce|edge|



#Scenario: login with problem user

#Given user is in login page
#When user insert username problem user
#When user insert password
#And user click on login button
#Then user should be able to login