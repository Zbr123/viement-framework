Feature: Home Page

  @vim-003 @Web
  Scenario:	home page redirection
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User click on login button
    And     [Admin Page] User click on home button from admin tab
#

#    Then    [Web Home Page] User should see the welcome header

#  @vim-004 @Web
#  Scenario:	User is able to logout of the portal
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User click on login button
#    And     [Admin Page] User click on home button from admin tab
#    And     [Home Page] User clicks on profile dropdown
#    And     [Home Page]

#  @vim-004 @Web
#  Scenario:	home page redirection
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User click on login button
#    And     [Admin Page] User click on home button from admin tab