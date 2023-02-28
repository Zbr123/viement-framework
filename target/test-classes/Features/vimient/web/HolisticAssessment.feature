Feature: Care Circle

  @vim-001 @Web
  Scenario: User is able to add new caregiver for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Assessments tab
    Then    [Web Holistic Assessment Page] User should see the Holistic Assessment heading
    When    [Web Holistic Assessment Page] User clicks on never option in eating0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in eating1
    And     [Web Holistic Assessment Page] User clicks on always option in sleepingS0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in sleepingS1
    And     [Web Holistic Assessment Page] User clicks on never option in healthS0
    And     [Web Holistic Assessment Page] User clicks on always option in healthS1

    And     [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert