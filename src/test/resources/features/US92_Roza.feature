@Roza
Feature: Verify event manager access to 15 modules
  User Story: As an Event manager, I want to access to the 15 different modules.

  Background:the user is on the login page
    Given the user is on the login page

  Scenario: Event manager can access 15 different modules
    Given the user logged in as "Event_manager"
    And user sees logged_name is "EventsCRMManager"
    And user sees fifteen modules