@tag
Feature: Validating Login Screen
Scenario: Validate successful login with valid data
Given user should have lanched site to test
When valid details are entered
And clicked on login button
Then home screen should be displayed