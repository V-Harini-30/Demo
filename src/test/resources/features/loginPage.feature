Feature: Validating fb page

Background:
Given Launches fb login page

#Scenario Outline: Fb page Title Validation

#When  User enter "<username>" and "<password>"
#And   User click on login button
#Then  User verifies the Error message

#Examples:
#|username|password|
#|Hello|123456|


Scenario: Fb page Title Validation
When User print page title

Scenario: Fb page URL validation
When User print URL of the page
