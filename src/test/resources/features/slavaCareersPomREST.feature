@careers_s
Feature: Careers scenarios

  @careers4_s @regression
  Scenario: REST api Slava
    Given I login to REST as "recruiter" Slava step
    When I create via REST new position
    Then I verify via REST new position in the list
    And I update via REST new position
    Then I verify via REST position details
    And I delete via REST new position