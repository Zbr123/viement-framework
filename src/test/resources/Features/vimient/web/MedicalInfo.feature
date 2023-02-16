Feature: Medical Info

  @vim-001 @Web
    Scenario: User is able to add medical info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on onboarding info tab
    Then    [Web Onboarding Info Page] User should see the profile info heading
    When    [Web Onboarding Info Page] User clicks on medical info subtab
    Then    [Web Medical Info SubTab Page] User should see the medical history heading