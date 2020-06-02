Feature: Login Application

Scenario Outline: User need to login by valid username and password
Given Initialize the browser with chrome
And Navigate to "https://github.com" site
And Click on Sign In button
When User login into site with <username> and <password>
Then Validate login
And Close browser

Examples:
| username		| password		|
| abc			| abc@123		|
| xyz			| xyz@567		|
