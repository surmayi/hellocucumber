Feature: Portal Login



@PortalTest
Scenario Outline: Home Page default login5
Given user is on landing page
When User login into application with <username> and <password>
Then Home Page is displayed
And Links are displayed

Examples:
|username|password|
|user1|password1|
|user2|password2|
|user3|password3|
|user4|password4|