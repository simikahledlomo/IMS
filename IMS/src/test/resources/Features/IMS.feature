Feature: Login page automation of demo app
	Scenario: Check loginis successful with valid creds
	Given IMS baseURL "https://incidentmanagement.ekurhuleni.gov.za/" browser "chrome"
	When User clicks IMS login Link
	And User enters valid username "mbuyiseni.msomi" and passwod "CRM101#" and click login button
	Then User clicks incidents
	And User clicks pending closure
	Then User clicks help 
	And User clicks manuals
	Then User clicks manage alerts
	And User clicks update my townships
	Then User clicks log off
	And Good Bye browser 