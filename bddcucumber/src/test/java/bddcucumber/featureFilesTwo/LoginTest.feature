@smoketest
Feature: Login into account

Scenario Outline: Login to account with cridentials
	Given User navigates to "<url>" 
	When User click on login portal button 
	And User enters valid "<username>" username
	And User enters correct "<password>" password
	When User click on login button   
	Then User is successfully logged in with pop up "<message>"  
	
	Examples: 
		|   url   															|  username      			 |   password  			 	| 			 message      |
		|   http://www.webdriveruniversity.com/ |  webdriver			     |	 wendriver		    |   validation failed |
