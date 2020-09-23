$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/predefined.feature");
formatter.feature({
  "name": "Smoke steps",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@predefined"
    }
  ]
});
formatter.scenario({
  "name": "Predefined steps for Google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://google.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//*[@name\u003d\u0027btnK\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027ires\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027ires\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for Yahoo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://yahoo.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Yahoo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@name\u003d\u0027p\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@name\u003d\u0027p\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//*[@id\u003d\u0027uh-search-button\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027web\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027web\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for Bing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://www.bing.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Bing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//*[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//*[@id\u003d\u0027sb_form_go\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027b_results\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027b_results\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for Gibiru",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"http://gibiru.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Gibiru - Uncensored Anonymous Search\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//*[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//button[@id\u003d\u0027button-addon2\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@class\u003d\u0027gsc-results gsc-webResult\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@class\u003d\u0027gsc-results gsc-webResult\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for DuckduckGo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://duckduckgo.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"DuckDuckGo — Privacy, simplified.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//*[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//*[@id\u003d\u0027search_button_homepage\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027links\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027links\u0027]\" should contain text \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for SwissCows",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined6"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://swisscows.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Swisscows - secure search engine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@name\u003d\u0027query\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//*[@name\u003d\u0027query\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//*[@class\u003d\u0027search-submit\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@class\u003d\u0027donation-web-results-wrap\u0027]/..\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@class\u003d\u0027donation-web-results-wrap\u0027]/..\" should contain text \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for SearchEncrypt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://www.searchencrypt.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Search Encrypt - The Privacy Based Search Engine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"(//*[@name\u003d\u0027q\u0027])[1]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"(//*[@name\u003d\u0027q\u0027])[1]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"(//*[@id\u003d\u0027btn-secure-search\u0027])[1]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//*[@id\u003d\u0027results-list\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027results-list\u0027]\" should contain text \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for StartPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined8"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://www.startpage.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title contains \"Startpage.com - The world\u0027s most private search engine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleContains(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@name\u003d\u0027query\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@name\u003d\u0027query\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@class\u003d\u0027search-form__button\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//ol[@class\u003d\u0027list-flat\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//ol[@class\u003d\u0027list-flat\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for Yandex",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined9"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://www.yandex.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Yandex\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@id\u003d\u0027text\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@id\u003d\u0027text\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@type\u003d\u0027submit\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//ul[contains(@class,\u0027serp-list\u0027)]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//ul[contains(@class,\u0027serp-list\u0027)]\" should contain text \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for BoardReader",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined10"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"http://boardreader.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Boardreader - Forum Search Engine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@id\u003d\u0027title-query\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@id\u003d\u0027title-query\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@id\u003d\u0027title-submit\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//ul[@class\u003d\u0027mdl-list\u0027]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//ul[@class\u003d\u0027mdl-list\u0027]\" should contain text \"Cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \nExpecting:\n \u003c\"\"\u003e\nto contain:\n \u003c\"Cucumber\"\u003e \n\tat definitions.PredefinedStepDefs.elementWithXpathShouldContainText(PredefinedStepDefs.java:122)\n\tat ✽.element with xpath \"//ul[@class\u003d\u0027mdl-list\u0027]\" should contain text \"Cucumber\"(src/test/resources/features/predefined.feature:113)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Predefined steps for Ecosia",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@predefined"
    },
    {
      "name": "@predefined11"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://www.ecosia.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see page title as \"Ecosia - the search engine that plants trees\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iShouldSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@name\u003d\u0027q\u0027]\" should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Behavior Driven Development\" into element with xpath \"//input[@name\u003d\u0027q\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//button[@aria-label\u003d\u0027Submit\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for element with xpath \"//div[contains(@class,\u0027card-web\u0027)]\" to be present",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iWaitForElementWithXpathToBePresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//div[contains(@class,\u0027card-web\u0027)]\" should contain text \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/sample.feature");
formatter.feature({
  "name": "Sample page predefined steps",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sample"
    }
  ]
});
formatter.scenario({
  "name": "Responsive UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I resize window to 1200 and 800",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iResizeWindowToAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027location\u0027]\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentDate\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentTime\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I resize window to 800 and 800",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iResizeWindowToAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027location\u0027]\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentDate\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentTime\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I resize window to 400 and 800",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iResizeWindowToAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027location\u0027]\" should not be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldNotBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentDate\u0027]\" should not be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldNotBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027currentTime\u0027]\" should not be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldNotBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"s\" into element with xpath \"//*[@name\u003d\u0027username\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//*[@name\u003d\u0027email\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027username-error\u0027]\" should contain text \"2 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"sss\" into element with xpath \"//*[@name\u003d\u0027email\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//*[@name\u003d\u0027password\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//*[@id\u003d\u0027email-error\u0027]\" should contain text \"valid email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldContainText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Password fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@name\u003d\u0027password\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@id\u003d\u0027confirmPassword\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@id\u003d\u0027confirmPassword\u0027]\" should be disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisabled(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@id\u003d\u0027name\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//div[@role\u003d\u0027dialog\u0027]\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Soni\" into element with xpath \"//input[@id\u003d\u0027firstName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Kris\" into element with xpath \"//input[@id\u003d\u0027middleName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Sing\" into element with xpath \"//input[@id\u003d\u0027lastName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//span[text()\u003d\u0027Save\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//input[@id\u003d\u0027name\u0027]\" should have attribute \"value\" as \"Soni Kris Sing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldHaveAttributeAs(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Privacy policy",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample6"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@id\u003d\u0027formSubmit\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//label[@for\u003d\u0027agreedToPrivacyPolicy\u0027]\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//input[@name\u003d\u0027agreedToPrivacyPolicy\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify form data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"SoniS\" into element with xpath \"//input[@name\u003d\u0027username\u0027]\"",
  "keyword": "When "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"soniya.singhal@epsilon.com\" into element with xpath \"//input[@name\u003d\u0027email\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Sunshine\" into element with xpath \"//input[@id\u003d\u0027password\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Sunshine\" into element with xpath \"//input[@id\u003d\u0027confirmPassword\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@name\u003d\u0027name\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Soni\" into element with xpath \"//input[@id\u003d\u0027firstName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Kris\" into element with xpath \"//input[@id\u003d\u0027middleName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Sing\" into element with xpath \"//input[@id\u003d\u0027lastName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//span[@class\u003d\u0027ui-button-text\u0027][text()\u003d\u0027Save\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"650-111-2222\" into element with xpath \"//input[@name\u003d\u0027phone\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@id\u003d\u0027dateOfBirth\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@class\u003d\u0027ui-datepicker-month\u0027]/option[@value\u003d\u00276\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@class\u003d\u0027ui-datepicker-year\u0027]/option[@value\u003d\u00272000\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//a[contains(@class,\u0027ui-state-default\u0027)][text()\u003d\u002711\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@name\u003d\u0027countryOfOrigin\u0027]/option[@value\u003d\u0027India\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@name\u003d\u0027gender\u0027][@value\u003d\u0027female\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//input[@name\u003d\u0027allowedToContact\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"800 Fremont St #101 \\n Evergreen CA 90123\" into element with xpath \"//textarea[@id\u003d\u0027address\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@name\u003d\u0027carMake\u0027]/option[@value\u003d\u0027Other\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I switch to iframe with xpath \"//iframe[@name\u003d\u0027additionalInfo\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iSwitchToIframeWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Krishna\" into element with xpath \"//input[@name\u003d\u0027contactPersonName\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I switch to default content",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iSwitchToDefaultContent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@name\u003d\u0027agreedToPrivacyPolicy\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@id\u003d\u0027formSubmit\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//legend[text() \u003d \u0027Submitted sample form data\u0027]\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027username\u0027][text()\u003d\u0027SoniS\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027email\u0027][text()\u003d\u0027soniya.singhal@epsilon.com\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027firstName\u0027][text()\u003d\u0027Soni\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027middleName\u0027][text()\u003d\u0027Kris\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027lastName\u0027][text()\u003d\u0027Sing\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027dateOfBirth\u0027][text()\u003d\u002707/11/2000\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027countryOfOrigin\u0027][text()\u003d\u0027India\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027gender\u0027][text()\u003d\u0027female\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027allowedToContact\u0027][text()\u003d\u0027true\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027address\u0027][text()\u003d\u0027800 Fremont St #101 \\n Evergreen CA 90123\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027carMake\u0027][text()\u003d\u0027Other\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027agreedToPrivacyPolicy\u0027][text()\u003d\u0027true\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027contactPersonName\u0027][text()\u003d\u0027Krishna\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027password\u0027][text()\u003d\u0027[entered]\u0027]\" should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.elementWithXpathShouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element with xpath \"//b[@name\u003d\u0027password\u0027][text()\u003d\u0027[entered]\u0027]\" should not have text as \"Sunshine\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Non-required fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sample"
    },
    {
      "name": "@sample8"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open url \"https://skryabin.com/webdriver/html/sample.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PredefinedStepDefs.iOpenUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"1112223344\" into element with xpath \"//input[@name\u003d\u0027phone\u0027]\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@name\u003d\u0027countryOfOrigin\u0027]/option[@value\u003d\u0027India\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@name\u003d\u0027gender\u0027][@value\u003d\u0027female\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element using JavaScript with xpath \"//input[@name\u003d\u0027allowedToContact\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementUsingJavaScriptWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"877 Willow St #226 \\n San Jose CA 95125\" into element with xpath \"//textarea[@id\u003d\u0027address\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iTypeIntoElementWithXpath(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@name\u003d\u0027carMake\u0027]/option[@value\u003d\u0027Other\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//button[@id\u003d\u0027thirdPartyButton\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept alert",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iAcceptAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//input[@id\u003d\u0027dateOfBirth\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@class\u003d\u0027ui-datepicker-month\u0027]/option[@value\u003d\u00276\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//select[@class\u003d\u0027ui-datepicker-year\u0027]/option[@value\u003d\u00272000\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on element with xpath \"//a[contains(@class,\u0027ui-state-default\u0027)][text()\u003d\u002711\u0027]\"",
  "keyword": "And "
});
formatter.match({
  "location": "PredefinedStepDefs.iClickOnElementWithXpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});