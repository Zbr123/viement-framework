Feature: WellnessPlan

  @vim-001 @Web
  Scenario: User is able to submit wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
    And     [Web Wellness Survey Page] User clicks on wellness survey submit button


  @vim-002 @Web
  Scenario: User is able to reset wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
    And     [Web Wellness Survey Page] User clicks on wellness survey reset button


  @vim-003 @Web
  Scenario: User is able to save wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button on wellness survey form
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button on wellness survey form
#    And     [Web Wellness Survey Page] User clicks on wellness survey submit button
    And     [Web Wellness Survey Page] User clicks on wellness survey save button
    Then    [Web Wellness Survey Page] User should see limit reached alert popup
    When    [Web Wellness Survey Page] User clicks on alert popup okay button
