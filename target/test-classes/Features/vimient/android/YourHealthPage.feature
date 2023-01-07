
Feature: Your Health

  @vimient-001 @SmokeAndroidTest @Login @vimientAndroid @vimientAndroid
  Scenario: user should be able to login
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Login Button
    And   [Login Page] User tap on login with my email button
    And   [Login Page] User enters email address test07@mailinator.com
    And   [Login Page] User enters password Vista123456
    And   [Login Page] User tap on Login Button
    Then  [Your Health] User enter the height 6
    #And   [Your Health] User tap on the unit field
    #Then  [Your Health] User select the unit Feet
    #And   [Your Health] User enter the weight 70
    #Then  [Your Health] User Tap on thee weight unit field
    #And   [Your Health] User select the weight unit Kilograms
    Then  [Home Page] User tap on next button
    And   [Your Health] User select current life stage Single
    Then  [Home Page] User tap on next button
    And   [Health Page] User tap on 0-5 dependent age 8
    Then  [Health Page] User tap on 6-11 second dependent age 5
   # And   [Health Page] User tap on 12-17 dependent age "3"
    #Then  [Health Page] User tap on 18+ dependent age  "2"
    And   [Home Page] User tap on next button
    Then  [Your Health] User tap stander alcoholic drinks 4
    And   [Home Page] User tap on next button
    Then  [Your Health] User select on tobacco product "Occasionally"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select on package food "Agree"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select on sleep and wake up feeling "Agree"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select the health and wellbeing "Agree"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select the well-balanced lifestyle "Agree"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select the physical health "Disagree"
    And   [Home Page] User tap on next button
    Then  [Your Health] User select the health condition "Good"
    Then  [Your Health} User select the mental wellbeing "Completely agree"
    And   [Your Health] User tap on the show my health score