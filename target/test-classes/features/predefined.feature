@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    Then element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element using JavaScript with xpath "//*[@name='btnK']"
    Then I wait for element with xpath "//*[@id='ires']" to be present
    Then element with xpath "//*[@id='ires']" should contain text "Cucumber"

#  "//*[@id='rso']" also works, why select "//*[@id='ires']"


  @predefined2
  Scenario: Predefined steps for Yahoo
    Given I open url "https://yahoo.com"
    Then I should see page title as "Yahoo"
    Then element with xpath "//input[@name='p']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='p']"
    Then I click on element using JavaScript with xpath "//*[@id='uh-search-button']"
    Then I wait for element with xpath "//*[@id='web']" to be present
    Then element with xpath "//*[@id='web']" should contain text "Cucumber"

#   "//*[@id='main']" selects more, "//*[@id='web']" doesn't select all results. Why choose "@id = web", what's criteria? What area r we looking for?

  @predefined3
  Scenario: Predefined steps for Bing
    Given I open url "https://www.bing.com/"
    Then I should see page title as "Bing"
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element using JavaScript with xpath "//*[@id='sb_form_go']"
    Then I wait for element with xpath "//*[@id='b_results']" to be present
    Then element with xpath "//*[@id='b_results']" should contain text "Cucumber"

  @predefined4
  Scenario: Predefined steps for Gibiru
    Given I open url "http://gibiru.com"
    Then I should see page title as "Gibiru - Uncensored Anonymous Search"
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element using JavaScript with xpath "//button[@id='button-addon2']"
    Then I wait for element with xpath "//*[@class='gsc-results gsc-webResult']" to be present
    Then element with xpath "//*[@class='gsc-results gsc-webResult']" should contain text "Cucumber"

  @predefined5
  Scenario: Predefined steps for DuckduckGo
    Given I open url "https://duckduckgo.com"
    Then I should see page title as "DuckDuckGo — Privacy, simplified."
    Then element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    Then I click on element using JavaScript with xpath "//*[@id='search_button_homepage']"
    Then I wait for element with xpath "//*[@id='links']" to be present
    Then element with xpath "//*[@id='links']" should contain text "cucumber"

#    need to change 'cucumber' to lower case else fails

  @predefined6
  Scenario: Predefined steps for SwissCows
    Given I open url "https://swisscows.com"
    Then I should see page title as "Swisscows - secure search engine"
    Then element with xpath "//*[@name='query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='query']"
    Then I click on element using JavaScript with xpath "//*[@class='search-submit']"
    Then I wait for element with xpath "//*[@class='donation-web-results-wrap']/.." to be present
    Then element with xpath "//*[@class='donation-web-results-wrap']/.." should contain text "cucumber"

    #    need to change 'cucumber' to lower case else fails

  @predefined7
  Scenario: Predefined steps for SearchEncrypt
    Given I open url "https://www.searchencrypt.com/"
    Then I should see page title as "Search Encrypt - The Privacy Based Search Engine"
    Then element with xpath "(//*[@name='q'])[1]" should be present
    When I type "Behavior Driven Development" into element with xpath "(//*[@name='q'])[1]"
    Then I click on element using JavaScript with xpath "(//*[@id='btn-secure-search'])[1]"
    Then I wait for element with xpath "//*[@id='results-list']" to be present
    Then element with xpath "//*[@id='results-list']" should contain text "cucumber"

    #    need to change 'cucumber' to lower case else fails

  @predefined8
  Scenario: Predefined steps for StartPage
    Given I open url "https://www.startpage.com/"
    Then I should see page title contains "Startpage.com - The world's most private search engine"
    Then element with xpath "//input[@name='query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='query']"
    Then I click on element with xpath "//button[@class='search-form__button']"
    Then I wait for element with xpath "//ol[@class='list-flat']" to be present
    Then element with xpath "//ol[@class='list-flat']" should contain text "Cucumber"

  @predefined9
  Scenario: Predefined steps for Yandex
    Given I open url "https://www.yandex.com/"
    Then I should see page title as "Yandex"
    Then element with xpath "//input[@id='text']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='text']"
    Then I click on element with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//ul[contains(@class,'serp-list')]" to be present
    Then element with xpath "//ul[contains(@class,'serp-list')]" should contain text "cucumber"

  @predefined10
  Scenario: Predefined steps for BoardReader
    Given I open url "http://boardreader.com/"
    Then I should see page title as "Boardreader - Forum Search Engine"
    Then element with xpath "//input[@id='title-query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='title-query']"
    Then I click on element with xpath "//button[@id='title-submit']"
    Then I wait for element with xpath "//ul[@class='mdl-list']" to be present
    Then element with xpath "//ul[@class='mdl-list']" should contain text "cucumber"
  # this is failing, u said something about using list, would it be here?
#why is it failing? how to fix it? Why is "//ul[@class='mdl-list']" not finding 'Cucumber'?

  @predefined11
  Scenario: Predefined steps for Ecosia
    Given I open url "https://www.ecosia.org/"
    Then I should see page title as "Ecosia - the search engine that plants trees"
    Then element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element using JavaScript with xpath "//button[@aria-label='Submit']"
    Then I wait for element with xpath "//div[contains(@class,'card-web')]" to be present
    Then element with xpath "//div[contains(@class,'card-web')]" should contain text "cucumber"