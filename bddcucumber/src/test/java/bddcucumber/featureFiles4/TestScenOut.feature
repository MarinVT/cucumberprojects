Feature: Login test

  @live
  Scenario Outline: Login with valid info
    Given User navigates to "<url>" website
    When User clicks on login button
    And User enters  "<username>" username
    And User enters "<password>" password
    When User click on loggin button
    Then User is getting login "<message>" message
    
    Examples: 
      | url                                 | username  | password     | message              |
      | http://www.webdriveruniversity.com/ | webdriver | test1        | validation failed    |
      | http://www.webdriveruniversity.com/ | webdriver | webdriver123 | validation succeeded |
      
	@staging
  Scenario Outline: Login with valid info testing Firefox
    Given User navigates to "<url>" website
    When User clicks on login button
    And User enters  "<username>" username
    And User enters "<password>" password
    When User click on loggin button
    Then User is getting login "<message>" message

    Examples: 
      | url                                 | username  | password     | message              |
      | http://www.webdriveruniversity.com/ | webdriver | test1        | validation failed    |
      | http://www.webdriveruniversity.com/ | webdriver | webdriver123 | validation succeeded |
