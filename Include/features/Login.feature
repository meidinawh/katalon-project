@loginFeature
Feature: Login

  Background: 
    Given I open login page

  @test
  Scenario Outline: Login with invalid username and valid password
    When I input invalid username <username> and valid password <password>
    And I click login button
    Then I see an error message 'Invalid credentials'

    Examples: 
      | username | password |
      | Admin123 | admin123 |

  Scenario Outline: Login with invalid username and invalid password
    When I input invalid username <username> and invalid password <password>
    And I click login button
    Then I see an error message 'Invalid credentials'

    Examples: 
      | username | password |
      | Admin123 | abc456   |

  Scenario Outline: Login with valid username and invalid password
    When I input valid username <username> and invalid password <password>
    And I click login button
    Then I see an error message 'Invalid credentials'

    Examples: 
      | username | password |
      | Admin    | admin    |

  Scenario Outline: Login with valid username and valid password
    When I input valid username <username> and valid password <password>
    And I click login button
    Then I see a homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: Login with valid username and blank password
    When I only input valid username <username>
    And I click login button
    Then I see error message 'Required'

    Examples: 
      | username | password |
      | Admin    |          |

  Scenario Outline: Login with blank username and valid password
    When I only input valid password <password>
    And I click login button
    Then I see error message 'Required'

    Examples: 
      | username | password |
      |          | admin123 |
      
  Scenario: Login without enter any data
    When I click login button
    Then I see error message 'Required'  
