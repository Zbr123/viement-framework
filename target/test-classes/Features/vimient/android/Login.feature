Feature: Login

  @vimient-001 @SmokeAndroidTest @Login @android
  Scenario: user should be able to login
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Login Button
    And   [Login Page] User tap on login with my email button
    And   [Login Page] User enters email address test07@mailinator.com
    And   [Login Page] User enters password Vista123456
#    And   [Login Page] User tap on Login Button