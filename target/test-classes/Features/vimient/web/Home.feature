Feature: Home Page

    @vim-001 @Web
    Scenario: home page redirection
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
