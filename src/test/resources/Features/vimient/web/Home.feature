Feature: Home Page

#  @vim-003 @Web
#    Scenario: home page redirection
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    And     [Admin Page] User clicks on home button from admin tab
#
##    Then    [Web Home Page] User should see the welcome header
#
#  @vim-004 @Web
#    Scenario: User is able to log out of portal from admin page
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    And     [Admin Page] User clicks on profile dropdown from admin tab
#    And     [Admin Page] User clicks on logout button from admin tab
#
#  @vim-005 @Web
#    Scenario: User is able to log out of portal from home page
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    And     [Admin Page] User clicks on home button from admin tab
#    And     [Home Page] User clicks on profile dropdown from home page
#    And     [Home Page] User clicks on logout button from home page

  @vim-006 @Web
    Scenario: User is able to add user
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Admin Page]  User clicks on add user button
    And     [Add Senior Page] User enters first name Zubair
    And     [Add Senior Page] User enters last name Shafi
    And     [Add Senior Page] User enters mobile phone number 2359421681
    And     [Add Senior Page] User clicks on gender select dropdown
    And     [Add Senior Page] User clicks on male button