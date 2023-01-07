
Feature: E2E Flow

#  @vimient-001 @SmokeAndroidTest @Login @vimientAndroid
#  Scenario: user should be able to create account using E2E Flow
#    Given [Home Page] App should open successfully
#    When  [Home Page] User tap on Create Account Button
#    When  [Health Page] User tap on Skip Button
#    And   [Push Notification Page] User tap on continue Button
#    And   [EmailVerificationPage] User tap on Next button
#    And   [Congratulation Page] User tap on Next button
#    And   [Dashboard Page] User tap the me button
#    Then  [Me Page] User tap on Add Photo Avatar
#
  @vimient-002@SmokeAndroidTest @Login @vimientAndroid @android
  Scenario: user should be able to new create account using E2E Flow
    Given [Home Page] App should open successfully
    When  [Hom Page] User tap on Create Account Button
    When  [Home Page] User click on Next button
    And   [Hi Page] User enter the company code pcompany
    And   [Home Page] User tap on next button
    And   [Terms of Use Page] User tap on accept all button
    And   [Home Page] User click on Next button
    Then  [Personal detail] User enter the first name Ahsan
    And   [Personal detail] User enter the last name khan
    Then  [Personal detail] User enter the email address "user"
    And   [Personal detail] User tap on the country of residency
    Then  [Personal detail] User select the country Afghanistan
    And   [Personal detail] User tap the country
    Then  [Personal detail] User select the country India
    #When  [Personal detail] User scroll down
    And   [Personal detail] User tap the location
    Then  [Personal detail] User select the location Pedder Road
    And   [Personal detail] User tap the Department
    Then  [Personal detail] User select the Department Sales
    And   [Home Page] User click on Next button
    Then  [Personal detail] User enter the password Vista123456
    And   [Personal detail] user enter the confirm password Vista123456
    And   [Home Page] User click on Next button
    And   [Home Page] User click on Next button
    When  [Personal detail] user tap the gender
    Then  [Personal detail] user select the gender
    And   [Personal detail] user tap the date of birth
    And   [Personal Detail] user tap the confirm button
    And   [Home Page] User click on Next button
    Then  [Personal detail] user  see the tick mark on the show your details ""
    And   [Home Page] User tap on next button
    Then  [Your Health] User enter the height 6
    And   [Your Health] User tap on the unit field
    Then  [Your Health] User select the unit Feet
    And   [Your Health] User enter the weight 70
    Then  [Your Health] User Tap on thee weight unit field
    And   [Your Health] User select the weight unit Pounds
    Then  [Home Page] User tap on next button
    And   [Your Health] User select current life stage Single
    Then  [Home Page] User tap on next button
    And   [Health Page] User tap on 0-5 dependent age 8
    Then  [Health Page] User tap on 6-11 second dependent age 5
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
    And   [Home Page] User tap on next button
    Then  [Your Health} User select the mental wellbeing "Completely agree"
    And   [Your Health] User tap on the show my health score
    And   [Home Page] User click on Next button
    Then  [Personal detail] user  see the tick mark on the assess your current health ""
    And   [Home Page] User tap on next button
    And   [Health Focus] User select the placholder pillors "Activity"
    Then  [Health Focus] User select a focus area "Fitness"
    And   [Home Page] User tap on next button
    Then  [Health Focus] User select moderate activity 3
    And   [Home Page] User tap on next button
    Then  [Health Focus] User select vigorous activity 4
    And   [Home Page] User tap on next button
    Then  [Health Focus] User select the strength training 7
    And   [Home Page] User tap on next button
    Then  [Health Focus] User select the spent time 5
    And   [Home Page] User tap on next button
    Then  [Devices Page] User connect  a devices "Fitbit"
    And   [Health Page] User tap on Skip Button
    Then  [Push Notification Page] User tap on continue Button
    And   [Home Page] User tap on next button
#    Then  [Congratulation Page] user see the tick mark on the define your health focus ""
    And   [Home Page] User tap on next button







#  Scenario: user should be able to new create account using Flow
#    Given [Home Page] App should open successfully
#    When  [Hom Page] User tap on Create Account Button
#    When  [Home Page] User tap on next button
#    And   [Hi Page] User enter the company code pcompany
#    And   [EmailVerificationPage] User tap on Next button
#    And   [Terms of Use Page] User tap on accept all button
#    When  [Personal detail] User scroll down
#
