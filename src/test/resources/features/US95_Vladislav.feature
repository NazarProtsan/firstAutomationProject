@Vlad @regression
Feature: As POS & Sales manager, I want to manage quotations on the Sales page
Background:User is already in the log in page
  Given the user is on the login page



   # Given the user logged in with username as "POS_manager" and password as "POSM_password"



  Scenario: As POS manager, I want to manage quotations on the Sales page.
    #Given User on the base page
    Given the user logged in as "POS_manager"
    When the user click on sales module
    And user click on top checkbox
    Then Verify all checkboxes are selected

  Scenario: Sales manager, I want to manage quotations on the Sales page.
    #Given User on the base page
    Given the user logged in as "Sales_Manager"
    When the user click on sales module
    And user click on top checkbox
    Then Verify all checkboxes are selected