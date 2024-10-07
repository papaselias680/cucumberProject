@Regression @login
Feature: Login

  Scenario Outline: As existing user I want to login successfully
    Given I am in the login page
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then The home page is displayed
    Examples:
      | username | password |
      | standard_user | secret_sauce |

