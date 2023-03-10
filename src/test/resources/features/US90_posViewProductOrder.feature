@Teodora @regression
Feature: POS view product order feature

  User story: As a Point of Sale manager (POS), I should be able to view product order.


  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in as "POS_manager"


  Scenario:Order reference checked verification

    When POS clicks on the Point of sale module
    Then POS clicks on Orders
    And POS clicks on Order Ref checkbox
    Then POS sees that all orders are checked
    And POS sees that Action button is displayed

  Scenario: Action drop down options verification

    When POS clicks on the Point of sale module
    Then POS clicks on Orders
    And POS clicks on Order Ref checkbox
    Then POS clicks on Action drop down button
    And POS sees three options: Import, Export, Delete