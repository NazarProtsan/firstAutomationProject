@Evgenia
Feature: As a manager, I should be able to get correct information on the Sales page.

  Background:
    Given the user is on the login page

  Scenario Outline: Verify a manager is able to get correct information on the Sales page.
    When the user logged in as "<users>"
    Then user clicks on sales module
    Then user sees six columns
    Examples:
      | users |
      | POS_manager |
      | Sales_Manager |
