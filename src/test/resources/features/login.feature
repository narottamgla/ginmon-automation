Feature: Verify Ginmon login with valid/invalid credentils

  Scenario: Verify login with valid credentials
    Given I open the Ginmon login page url
    When I enter user name as "test+at12@ginmon.de" and password as "useruser1"
    When I click login button
    Then I should see EmailVerification page
    