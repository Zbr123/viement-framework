Feature: Home Page

  @vim-003 @Web
    Scenario: home page redirection
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on home button from admin tab
    Then    [Web Home Page] User should see the welcome heading

  @vim-004 @Web
    Scenario: User is able to log out of portal from admin page
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on profile dropdown from admin tab
    And     [Web Admin Page] User clicks on logout button from admin tab
    Then    [Web Login Page] User should see user logged out success alert

  @vim-005 @Web
    Scenario: User is able to log out of portal from home page
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page] User clicks on home button from admin tab
    And     [Web Home Page] User clicks on profile dropdown from home page
    And     [Web Home Page] User clicks on logout button from home page
    Then    [Web Login Page] User should see user logged out success alert

  @vim-006 @Web
    Scenario: User is able to add senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email address srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on login button
    And     [Web Admin Page]  User clicks on add user button
    And     [Web Add Senior Page] User enters first name Zubair
    And     [Web Add Senior Page] User enters last name Automation
    And     [Web Add Senior Page] User enters mobile phone number 14785
    And     [Web Add Senior Page] User clicks on gender select dropdown
    And     [Web Add Senior Page] User clicks on male button
    And     [Web Add Senior Page] User enters date of birth 05/16/1965
    And     [Web Add Senior Page] User enters senior email address
    And     [Web Add Senior Page] User enters street address Street 1
    And     [Web Add Senior Page] User clicks on state select dropdown
    And     [Web Add Senior Page] User clicks on colorado state button
    And     [Web Add Senior Page] User enters senior city Denver
    And     [Web Add Senior Page] User enters senior zipcode 80014
    And     [Web Add Senior Page] User clicks on create account button
    Then    [Web Add Senior Page] User should see the account created success alert in green below

  @vim-007 @Web
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

  @vim-008 @Web
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

  @vim-009 @Web
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

  @vim-010 @Web
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

