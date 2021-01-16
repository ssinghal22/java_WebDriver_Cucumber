@predefined
Feature: Smoke steps Practice 1

  @predefined1
  Scenario: Predefined steps for Google practice 1
    Given I open url "https://www.google.com/"
    Then I should see page title as "Google"
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element with xpath "//*[@name='btnK']"
    Then I wait for element with xpath "//*[@id='rso']" to be present
    Then element with xpath "//*[@id='rso']" should contain text "Cucumber"

  @predefined2
  Scenario: Predefined steps for Yahoo practice 1
    Given I open url "https://www.yahoo.com/"
    Then I should see page title as "Yahoo"
    Then element with xpath "//*[@name='p']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='p']"
    Then I click on element with xpath "//*[@value='Search']"
    Then I wait for element with xpath "//*[@id='web']" to be present
    Then element with xpath "//*[@id='web']" should contain text "BDD"

  @predefined3
  Scenario: Predefined steps for Bing practice 1
    Given I open url "https://www.bing.com/"
    Then I should see page title as "Bing"
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element with xpath "//label[@aria-label='Search the web']"
    Then I wait for element with xpath "//ol[@id='b_results']" to be present
    Then element with xpath "//ol[@id='b_results']" should contain text "BDD"

  @predefined4
  Scenario: Predefined steps for Gibiru practice 1
    Given I open url "https://gibiru.com/"
    Then I should see page title as "Gibiru – Protecting your privacy since 2009"
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element with xpath "//*[@id='button-addon2']"
    Then I wait for element with xpath "//div[@class='gsc-resultsbox-visible']" to be present
    Then element with xpath "//div[@class='gsc-resultsbox-visible']" should contain text "Cucumber"