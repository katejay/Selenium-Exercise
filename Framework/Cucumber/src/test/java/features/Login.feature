Feature: Login Application

Scenario: Home page default login
Given User is on landing page
When User login into site with username "jay" and password "pass@jay123"
Then Successfully Login
And Activity displayed are "false"

Scenario: Home page default login
Given User is on landing page
When User login into site with username "admin" and password "admin@123"
Then Successfully Login
And Activity displayed are "true"

