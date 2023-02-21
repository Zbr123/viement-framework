Feature: Care Circle

  @vim-001 @Web
    Scenario: User is able to add provider info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation02 after search
    And     [Web Senior Dashboard Page] User clicks on Onboarding Info tab
    Then    [Web Onboarding Info Page] User should see the Profile Info heading
    When    [Web Onboarding Info Page] User clicks on Care Circle subtab
    Then    [Web Care Circle SubTab Page] User should see the Contact 1 heading
    When    [Web Care Circle SubTab Page] User enters Zubair in First Name text box
    And     [Web Care Circle SubTab Page] User enters Automation02 in Middle Name text box
    And     [Web Care Circle SubTab Page] User enters Dogar in Last Name text box
    And     [Web Care Circle SubTab Page] User clicks on gender dropdown
    And     [Web Care Circle SubTab Page] User clicks on Male option
    And     [Web Care Circle SubTab Page] User enters 73518 in Mobile Phone text box
    And     [Web Care Circle SubTab Page] User enters zubair.alam+automation02@vimient.com in Email text box
    And     [Web Care Circle SubTab Page] User clicks on relationship_with_senior dropdown
    And     [Web Care Circle SubTab Page] User clicks on Uncle option
    And     [Web Care Circle SubTab Page] User enters 4231 W 10th Ave in Flat, House no.,Building,Apartment text box
    And     [Web Care Circle SubTab Page] User enters Denver in City text box
    And     [Web Care Circle SubTab Page] User clicks on state dropdown
    And     [Web Care Circle SubTab Page] User clicks on CO option
    And     [Web Care Circle SubTab Page] User enters 80014 in Zip code text box
    And     [Web Care Circle SubTab Page] User clicks on best_day_to_contact dropdown
    And     [Web Care Circle SubTab Page] User clicks on Anyday option
    And     [Web Care Circle SubTab Page] User clicks on best_time_to_contact dropdown
    And     [Web Care Circle SubTab Page] User clicks on Anytime option
    And     [Web Care Circle SubTab Page] User clicks on primary contact radioButton
    And     [Web Care Circle SubTab Page] User clicks on emergency_contact check box
    And     [Web Care Circle SubTab Page] User clicks on Save button
    Then    [Web Care Circle SubTab Page] User should see a Saved Successfully alert