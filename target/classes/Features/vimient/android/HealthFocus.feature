Feature: Health Focus

  @vimient-001 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Verify user should be able to connect with Garmin app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button
    Then  [Dashboard Page] Verify the Good Morning Text with Name "john smith"

  @vimient-002 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Skip all wearable or activity app
    Given [Home Page] App should open successfully
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button
    Then  [Dashboard Page] Verify the Good Morning Text with Name "john smith"

  @vimient-002 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Verify user should be disable with Garmin app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    And   [Health Page] User tap on disconnect button
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-003 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Validate user should be connect to the garmin app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected

  @vimient-004 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Verify user should be able to connect with Fitbit app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page] User tap on Fitbit connect button
    When  [Health Page] Verify user should be on Connect App
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-005 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Verify user should be able to disconnect with Fitbit app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page] User tap on Fitbit connect button
    When  [Health Page] Verify user should be on Connect App
    Given [Health Page] User tap to disconnect my button
    Then  [Health Page]User tap yes button
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-006 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User tap the No Button and validate the massage
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page] User tap on Fitbit connect button
    Given [Health Page]User tap  the no button
    When  [Health Page] Verify user should be on Connect App
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-006 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Verify user should be able to connect with Googlefit app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Home Page]user tap the  google fit app
    When  [Health Page] Verify user should be on Connect App
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-007 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Disconnect to the google fit
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page]Tap the google fit app
    And   [Health Page]Click the google fit app again
    And   [Health Page] User tap on disconncet button
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-009 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: Validate to  Check the validation massage after clicking the cross button
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page]Tap the google fit app
    And   [Health Page]Click the google fit app again
    And   [Health Page] User tap on disconncet button
    Given [Health Page]User tap  the no button
    When  [Health Page] Verify user should be on Connect App
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-009 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User Connect to the google fit,then change and connect to the fitbit
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page]Tap the google fit app
    Then  [Health Page] User tap on Fitbit connect button
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-010 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User connect to the google fit,then change and connect to the garmin app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page]Tap the google fit app
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-011 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User connect to the garmin app,then change and connect to the google fit
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    Then  [Home Page]user tap the  google fit app
    When  [Health Page] Verify user should be on Connect App
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-012 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User connect to the garmin app,then change and connect to the Fitbit
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    Then  [Health Page] User tap on Fitbit connect button
    When  [Health Page] Verify user should be on Connect App
    Given [Health Page] User tap to disconnect my button
    Then  [Health Page]User tap yes button
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button

  @vimient-013 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User connect to the Fitbit,then change and connect to the garmin app
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page] User tap on Fitbit connect button
    When  [Health Page] Verify user should be on Connect App
    And   [Health Page] User tap on Garmin connect button
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    Then  [Health Page] Verify user should be on Connect App
    When  [Health Page] User tap on close connect app
    And   [Health Page] Verify Garmin App should be successfully connected
    And   [Health Page] User tap on Skip Button
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button
    Then  [Dashboard Page] Verify the Good Morning Text with Name "john smith"

  @vimient-014 @SmokeAndroidTest @HealthFocus @vimientAndroid
  Scenario: User connect to the Fitbit,then change and connect to the google fit
    Given [Home Page] App should open successfully
    When  [Home Page] User tap on Create Account Button
    Then  [Health Page] User tap on Fitbit connect button
    When  [Health Page] Verify user should be on Connect App
    Then  [Home Page]user tap the  google fit app
    When  [Health Page] Verify user should be on Connect App
    And   [Push Notification Page] User tap on continue Button
    And   [EmailVerificationPage] User tap on Next button
    And   [Congratulation Page] User tap on Next button
