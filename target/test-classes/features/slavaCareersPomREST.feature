@careers_s
Feature: Careers scenarios

  @careers3_s
  Scenario: Careers adds new job
    Given I open "careers" page
    And I login as "candidate"
    Then I verify "candidate" login
    When I apply for a new job
    Then I see position marked as applied
    And I see position in my jobs

  @careers4_s @regression
  Scenario: REST api Slava
    Given I login to REST as "recruiter" Slava step
    When I create via REST new position
    Then I verify via REST new position in the list
    And I update via REST new position
    Then I verify via REST position details
    And I delete via REST new position