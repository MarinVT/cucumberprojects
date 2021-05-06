Feature: Fill submit form

  Scenario: Submit valid data via contact us form
    Given I access webdriveruniversity website 
    When I click on contact us form   
    And I enter user first name
    | marin | igrata | nomer1 |
    And I enter user last name 
    And I enter valid email address
    And I enter comments
    | Example2 | Example2  |
    | Example2 | Example2  |
		When I click on submit button
		Then The information should be successfully submitted
