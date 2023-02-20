Feature: Care Circle

  @vim-001 @Web
    Scenario: User is able to add provider info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation02 after search
    And     [Web Senior Dashboard Page] User clicks on Onboarding Info tab
    Then    [Web Onboarding Info Page] User should see the Profile Info heading
    When    [Web Onboarding Info Page] User clicks on Care Circle subtab
    Then    [Web Care Circle SubTab Page] User should see the Contact 1 heading
    When    [Web Care Circle SubTab Page] User enters Zubair in First Name text box
    And     [Web Care Circle SubTab Page] User enters Automation in Middle Name text box
    And     [Web Care Circle SubTab Page] User enters Dogar in Last Name text box
    And     [Web Care Circle SubTab Page] User clicks on gender dropdown
    And     [Web Care Circle SubTab Page] User clicks on Male option
    And     [Web Care Circle SubTab Page] User enters 73518 in Mobile Phone text box
    And     [Web Care Circle SubTab Page] User enters zubair.alam+automation02@vimient.com in Email text box