Feature: Submit data to webdriveruniversity using contact us form

  Scenario: Submit data via contact us form
    Given I access webdriver uni web site 
    Then I click on contact us button 
    And Enter valid first name
    And Enter valid last name
    |marin|VT1| 
    And Enter valid email address
    And Enter comments
		| example one | example two |
		When I click on the submit button
		Then The info is successfully submitted

