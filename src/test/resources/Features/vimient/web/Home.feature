Feature: Home Page

#  @vim-003 @Web
#    Scenario: home page redirection
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    And     [Admin Page] User clicks on home button from admin tab
#    Then    [Web Home Page] User should see the welcome header

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
#    And     [Web Home Page] User clicks on profile dropdown from home page
#    And     [Web Home Page] User clicks on logout button from home page

#  @vim-006 @Web
#    Scenario: User is able to add user
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    And     [Admin Page]  User clicks on add user button
#    And     [Add Senior Page] User enters first name Zubair
#    And     [Add Senior Page] User enters last name Automation
#    And     [Add Senior Page] User enters mobile phone number 14785
#    And     [Add Senior Page] User clicks on gender select dropdown
#    And     [Add Senior Page] User clicks on male button
#    And     [Add Senior Page] User enters date of birth 05/16/1965
#    And     [Add Senior Page] User enters senior email address
#    And     [Add Senior Page] User enters street address Street 1
#    And     [Add Senior Page] User clicks on state select dropdown
#    And     [Add Senior Page] User clicks on colorado state button
#    And     [Add Senior Page] User enters senior city Denver
#    And     [Add Senior Page] User enters senior zipcode 80014
#    And     [Add Senior Page] User clicks on create account button
#    Then    [Add Senior Page] User should see the account created success alert in green below

  @vim-007 @Web
  Scenario: User is able to add user
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in header
    When    [Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome header
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on scheduler tab
    And     [Web Scheduler Page] User clicks on who to call dropdown