Feature: Add Senior

  @vim-001 @Web
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
