Feature: Login

  @vimient-001 @SmokeAndroidTest @Login @LoginAndroid @android
    Scenario: user should be able to login
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail zubair.alam+android1@vimient.com
    And   [Login Page] User enters androidPasswords Vista!@#135!@#
    And   [Login Page] User clicks on Sign In button

#  @vimient-002 @SmokeAndroidTest @Login @LoginAndroid @android
#    Scenario: User should be able to logout from app

#  @vimient-003 @SmokeAndroidTest @Login @LoginAndroid @android
#    Scenario: User should be able to reset password
#    Given [Login Page] App should open successfully
#    And   [Login Page] User clicks on forgot password
##    And   [Android Forgot Password Page] User enters androidEmail zubair.alam+56@vimient.com