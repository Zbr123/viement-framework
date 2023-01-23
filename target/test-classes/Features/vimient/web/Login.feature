Feature: Login

#  @vim-001 @Web
#    Scenario: Verify that user can successfully signin with admin user
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-admin@srijan.net
#    And     [Web Login Page] User enters password Srijan@12345
#    And     [Web Login Page] User clicks on login button
#    Then    [Admin Page] User should see admin tab in header
#    And     [Adming Page] User should see todo heading
#
#  @vim-002 @Web
#    Scenario: Verify that user can successfully signin with qa user
#    Given   [Main Page] User go the web portal and navigate to the login page
#    When    [Web Login Page] User enters email address srijan-qa@srijan.net
#    And     [Web Login Page] User enters password nk?8[.=+da2UKV%
#    And     [Web Login Page] User clicks on login button
#    Then    [Home Page] User should see home tab in header
#    And     [Home Page] User should see the welcome heading

  @vim-003 @Web
    Scenario: Verify that user can successfully logout with admin user
    Given [Main Page] User go the web portal and navigate to the login page
    When  [Web Login Page] User enters email address srijan-admin@srijan.net
    And   [Web Login Page] User enters password Srijan@12345
    And   [Web Login Page] User clicks on login button
    And   [Admin Page] User clicks on profile dropdown from admin tab
    And   [Admin Page] User clicks on logout button from admin tab
    Then  [Main Page] User sees user logged out successfully message at bottom

#  @vim-004 @Web
#    Scenario: Verify that user can reset password
#    Given [Main Page] User go the web portal and navigate to the login page
#    And   [Web Login Page] User clicks on forgot your password
#    And   [Forgot Password Page] User enters recovery email address zubair.alam+55@vimient.com
#    And   [Forgot Password Page] User clicks on reset password button
##    And   [Forgot