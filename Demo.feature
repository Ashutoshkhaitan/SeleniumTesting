Feature: Testing Addition and 
Description: Addition of Two Numbers
@Execute @1
Scenario: Calculate the Sum of given two numbers

When Two Numbers 423 and 451 are added
Then Sum is calculated successfully.

@Execute @2
Scenario: Calculate Page Load Times

When Calculates the page load time in Chrome

And Calculates the page load time in firefox

And Calculates the page load time in phantomJS

@Execute @3
Scenario: Testing of given application
When Application is opened
Then Determine no of forms present on page
Then Traverse the form with appropriate data and complete the wizard
Then Run 3 times with random data 
Then verify message "You have finished all steps of this html form successfully"