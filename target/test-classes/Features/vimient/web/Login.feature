Feature: Login

  @vim-001 @Web
  Scenario:	Verify that user can successfully signin with admin user
  Given  [Main Page] User go the web portal and navigate to the login page
  When   [Web Login Page] User enters email address srijan-admin@srijan.net
  And    [Web Login Page] User enters password Srijan@12345
  And    [Web Login Page] User click on login button

  @vim-002 @Web
  Scenario:	Verify that user can successfully signin with qa user
    Given  [Main Page] User go the web portal and navigate to the login page
    When   [Web Login Page] User enters email address srijan-qa@srijan.net
    And    [Web Login Page] User enters password nk?8[.=+da2UKV%
    And    [Web Login Page] User click on login button