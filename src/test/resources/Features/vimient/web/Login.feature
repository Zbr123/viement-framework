Feature: Login
  @vim-001 @Web
    Scenario: Verify that user can successfully signin/login with admin user
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Admin Page] User should see admin tab in header
    And     [Web Admin Page] User should see todo heading

  @vim-002 @Web
    Scenario: Verify that user can successfully signin/login with qa user
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-qa@srijan.net
    And     [Web Login Page] User enters password nk?8[.=+da2UKV%
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    And     [Web Home Page] User should see the welcome heading

  @vim-003 @Web
    Scenario: Verify that user can successfully logout with admin user
    Given [Main Page] User go the web portal and navigate to the login page
    When  [Web Login Page] User enters email address srijan-admin@srijan.net
    And   [Web Login Page] User enters password Srijan@12345
    And   [Web Login Page] User clicks on login button
    And   [Web Admin Page] User clicks on profile dropdown from admin tab
    And   [Web Admin Page] User clicks on logout button from admin tab
    Then  [Main Page] User sees user logged out successfully message at bottom

  @vim-004 @Web
    Scenario: User is able to log out of portal from home page
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on home button from admin tab
    And     [Web Home Page] User clicks on profile dropdown from home page
    And     [Web Home Page] User clicks on logout button from home page
    Then    [Web Login Page] User should see user logged out success alert

  @vim-005 @Web
  Scenario: User is able to log out of portal from admin page
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on profile dropdown from admin tab
    And     [Web Admin Page] User clicks on logout button from admin tab
    Then    [Web Login Page] User should see user logged out success alert