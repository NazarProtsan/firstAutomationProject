@Nazar
Feature: As a POS & sales manager, I want to access the Repairs page
  Background: the user is on the login page
    Given the user is on the login page

Scenario: As a POS, I want to access the Repairs page
  Given the user logged in as "POS_manager"
  And user sees logged in as "POSManager"
 When user clicks on Repairs module
  Then user sees six columns: Repair Reference, Product to Repair, Customer, Delivery Address, Warranty Expiration, Status


  Scenario: As a POS, I want to access the Repairs page
    Given the user logged in as "Sales_Manager"
    And user sees logged in as "SalesManager"
    When user clicks on Repairs module
    Then user sees six columns: Repair Reference, Product to Repair, Customer, Delivery Address, Warranty Expiration, Status

