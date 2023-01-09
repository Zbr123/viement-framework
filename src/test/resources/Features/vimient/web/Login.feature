Feature: Login

  @vim-001 @Web
  Scenario:	Verify that user can successfully signin with admin user
    Given  [Main Page] User goes to the web portal and navigate to the login page
    When   [Login Page] User enters email srijan-admin@srijan.net
    And    [Login Page] User enters password Srijan@12345
    And    [Login Page] User click on login button

  @vim-002 @Web
  Scenario:	Verify that user can successfully signin with qa user
    Given  [Main Page] User goes to the web portal and navigate to the login page
    When   [Login Page] User enters email srijan-qa@srijan.net
    And    [Login Page] User enters password nk?8[.=+da2UKV%
    And    [Login Page] User click on login button