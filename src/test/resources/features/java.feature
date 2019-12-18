@java
  Feature: Java feature

    @java1
    Scenario: Initial java scenario
      Given I write java step
      And I print "Say hello!" in console
      And I print "Another text!" in console
      And I do actions with "Apple" and "Orange"
      And I do actions with "Orange" and "Orange"
      And I do actions with "I have an orange" and "orange"
      And I compare "Sonia" and "Kris"
      And I print url for "soni" page
      And I print url for "sample" page
      And I print url for "google" page

    @java2
    Scenario: Arrays exercise
      Given I work with arrays

    @java3
    Scenario: Map exercise
      Given I work with maps

    @java4
    Scenario: Class exercise
      Given I work with classes


