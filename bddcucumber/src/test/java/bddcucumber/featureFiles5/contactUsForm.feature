Feature: Submit data to webdriveruniversity.com via contact us form

  Scenario: Submit valid data via contact us form
    Given User accesses webdriveruni official web page 
    When User enters firstname
    When User enters last name
    | Marin | VT1 |   VT2   |
    And User enters valid email address
    And User adds comments 
    | Comment one12312 | Comment two1231 |
    When User clicks on submit button
    Then The info is successfully send via contact us form
