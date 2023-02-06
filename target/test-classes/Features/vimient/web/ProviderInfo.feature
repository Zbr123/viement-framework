Feature: Provider Info

  @vim-001 @Web
    Scenario: User is able to add provider info for a senior
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
    When    [Web Onboarding Info Page] User clicks on provider info subtab
    Then    [Web Provider Info SubTab Page] User should see the doctor1 heading
    And     [Web Provider Info SubTab Page] User should see the dentist1 heading
    When    [Web Provider Info SubTab Page] User enters doctor1 practice name Doctor
    And     [Web Provider Info SubTab Page] User enters doctor1 first name Zubair
    And     [Web Provider Info SubTab Page] User enters doctor1 last name Dogar
    And     [Web Provider Info SubTab Page] User clicks on doctor1 specialty dropdown
    And     [Web Provider Info SubTab Page] User clicks on chiropractor
    And     [Web Provider Info SubTab Page] User enters doctor1 contact phone 1593693571
    And     [Web Provider Info SubTab Page] User enters doctor1 email address zubair.alam+doctor1@vimient.com
    And     [Web Provider Info SubTab Page] User clicks on add doctor button
    Then    [Web Provider Info SubTab Page] User should see doctor2 heading
    When    [Web Provider Info SubTab Page] User enters dentist1 practice name Dr
    And     [Web Provider Info SubTab Page] User enters dentist1 first name Ahsan
    And     [Web Provider Info SubTab Page] User enters dentist1 last name Chohan
    And     [Web Provider Info SubTab Page] User clicks on dentist1 specialty dropdown
    And     [Web Provider Info SubTab Page] User clicks on endodontist
    And     [Web Provider Info SubTab Page] User enters dentist1 contact phone 2593693571
    And     [Web Provider Info SubTab Page] User enters dentist1 email address zubair.alam+doctor1@vimient.com
    And     [Web Provider Info SubTab Page] User clicks on add dentist button