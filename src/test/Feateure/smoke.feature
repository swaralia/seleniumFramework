Feature: This is smoke feature

Scenario: Verify invalid uname and password
	Given Chrome browser is opened
	When User enters invalid uname and password
	Then user will get an error message
Scenario: Veryify valid uname and password
		Given Chrome browser is opened
		When User enters valid uname and password
		Then user  will directed  to dashboard 