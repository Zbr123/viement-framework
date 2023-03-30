Feature: Welcome Page Continue Button


  @vimient-001 @SmokeAndroidTest @Login @LoginAndroid @android
  Scenario: User should be able to click on Continue button on Welcome Page
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail zubair.alam+android1@vimient.com
    And   [Login Page] User enters androidPasswords Vista!@#135!@#
    And   [Login Page] User clicks on Sign In button
    And   [Welcome Page] User clicks on continue button
    And   [Home Page] User taps on hamburger menu
    And   [Home Page] User taps on wellness signs tab
    And   [Wellness Signs Tab] User clicks on month view
    And   [Wellness Signs Tab] User clicks on left calendar arrow
    And   [Wellness Signs Tab] User clicks on week view
    And   [Wellness Signs Tab] User clicks on left calendar arrow
    And   [Wellness Signs Tab] User clicks on day view
    And   [Home Page] User taps on hamburger menu
    And   [Home Page] User taps on signout tab