Feature: Home

  @vim-003 @Web
  Scenario:	home page redirection
    Given  [Main Page] User goes to the web portal and navigate to the login page
    When    [Login Page] User enters email srijan-admin@srijan.net
    And     [Login Page] User enters password Srijan@12345
    And     [Login Page] User click on login button
    And     [Admin Page] User click on home button from admin tab