Feature: Modules count verification

  @ui
  Scenario: User verifies modules number
    Given the user is on the login page
    When the user logged in with username as "posmanager5@info.com" and password as "posmanager"
    Then user should see 22 modules