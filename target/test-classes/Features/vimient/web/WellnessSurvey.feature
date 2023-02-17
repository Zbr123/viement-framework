Feature: WellnessPlan

  @vim-001 @Web
  Scenario: User is able to use submit button in wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on wellness survey tab
    Then    [Web Wellness Survey Page] User should see the wellness check-in survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
    And     [Web Wellness Survey Page] User clicks on wellness survey submit button


  @vim-002 @Web
  Scenario: User is able to use reset button in wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on wellness survey tab
    Then    [Web Wellness Survey Page] User should see the wellness check-in survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
    And     [Web Wellness Survey Page] User clicks on wellness survey reset button


  @vim-003 @Web
  Scenario: User is able to use save button in wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on wellness survey tab
    Then    [Web Wellness Survey Page] User should see the wellness check-in survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
    And     [Web Wellness Survey Page] User clicks on wellness survey submit button
    And     [Web Wellness Survey Page] User clicks on wellness survey save button
    Then    [Web Wellness Survey Page] User should see limit reached alert popup
    When    [Web Wellness Survey Page] User clicks on alert popup okay button
