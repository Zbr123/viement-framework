Feature: Medical Info

  @vim-001 @Web
    Scenario: User is able to add provider info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    And     [Web Senior Dashboard Page] User clicks on Onboarding Info tab
    Then    [Web Onboarding Info Page] User should see the profile info heading
    When    [Web Onboarding Info Page] User clicks on Medical Info subtab
    Then    [Web Medical Info SubTab Page] User should see the medical history heading
    When    [Web Medical Info SubTab Page] User clicks on pacemaker dropdown
    And     [Web Medical Info SubTab Page] User clicks on Yes option