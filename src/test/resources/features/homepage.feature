Feature: Verify home page navigation

  Scenario: Verify Ginmon home page navigation
    Given I open the Ginmon login page url
    Then I should see Ginmon login page title as "My Ginmon"
    Then I should see Ginmon login page header as "Hello again!"
    
  Scenario: Verify Ginmon home page language switcher option
    Given I open the Ginmon login page url
    When I click on langauge dropdown on home page
    Then I should see Ginmon site lanuage options
    |Deutsch|
    |English|
    