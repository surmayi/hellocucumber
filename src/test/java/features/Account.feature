Feature: Application Login

Background:
Given Open Browser
When Browser is opened
Then Go to Landing Page


@RegTest
Scenario: Home Page default login1
Given user is on landing page
When user login into application with username and password
Then Home Page is displayed
And Links are displayed

@SmokeTest
Scenario: Home Page default login2
Given user is on landing page
When user login into application with username "abc" and password "1234"
Then Home Page is displayed
And Links are displayed "true"

@RegTest
Scenario: Home Page default login4
Given user is on landing page
When user login into application with following details
|"User1"|"pass1"|29|
|"User2"|"pass2"|28|
Then Home Page is displayed
And Links are displayed "false"

@SmokeTest
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