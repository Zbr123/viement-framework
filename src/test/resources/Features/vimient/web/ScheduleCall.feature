Feature: Schedule Call

  @vim-001 @Web
  Scenario: User is able to schedule a call for senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    Then    [Web Home Page] User should see home tab in heading
    When    [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zub
    And     [Web Home Page] User clicks on the top senior after search
    And     [Web Senior Dashboard Page] User clicks on scheduler tab
    And     [Web Scheduler Page] User clicks on who to call dropdown
    And     [Web Scheduler Page] User clicks on first senior in list
    And     [Web Scheduler Page] User clicks on assigned care agent dropdown
    And     [Web Scheduler Page] User clicks on senior zubair dogar
    And     [Web Scheduler Page] User clicks on call priority dropdown
    And     [Web Scheduler Page] User clicks on high call priority
    And     [Web Scheduler Page] User enters current date
    And     [Web Scheduler Page] User enters ten minutes from current time
    And     [Web Scheduler Page] User clicks on call duration dropdown
    And     [Web Scheduler Page] User clicks on call duration first option
    And     [Web Scheduler Page] User enters call reason Automation
    And     [Web Scheduler Page] User clicks on call type dropdown
    And     [Web Scheduler Page] User clicks on call type
    And     [Web Scheduler Page] User clicks on schedule submit button
    Then    [Web Scheduler Page] User should see a call schedule success alert message
