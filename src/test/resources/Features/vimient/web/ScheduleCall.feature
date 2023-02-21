Feature: Schedule Call

  @vim-001 @Web
  Scenario: User is able to Schedule a call for senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    And     [Web Senior Dashboard Page] User clicks on Scheduler tab
    And     [Web Scheduler Page] User clicks on Who to call dropdown
    And     [Web Scheduler Page] User clicks on Zubair - primary option in list
    And     [Web Scheduler Page] User clicks on assignedCareAgent dropdown
    And     [Web Scheduler Page] User clicks on Zubair Dogar option in list
    And     [Web Scheduler Page] User clicks on callPriority dropdown
    And     [Web Scheduler Page] User clicks on High option in list
    And     [Web Scheduler Page] User enters in the Date textbox today's date in Date
    And     [Web Scheduler Page] User enters in the Time textbox current time
    And     [Web Scheduler Page] User clicks on callDuration dropdown
    And     [Web Scheduler Page] User clicks on 15 min option in list
    And     [Web Scheduler Page] User enters in the Call Reason textbox Automation Test
    And     [Web Scheduler Page] User clicks on callType dropdown
    And     [Web Scheduler Page] User clicks on Fall Detected option in list
    And     [Web Scheduler Page] User clicks on Submit button
    Then    [Web Scheduler Page] User should see a Call Scheduled Successfully alert
