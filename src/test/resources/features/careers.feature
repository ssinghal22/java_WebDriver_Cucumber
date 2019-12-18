@careers
Feature: Careers scenarios

  @careers1
  Scenario: Recruiter creates position
    Given I open "careers" page object
    And I login as "recruiter"
    Then I verify "recruiter" login
    When I create new position
    And I verify position created

  @careers2
  Scenario: candidate applies to a position
    Given I open "careers" page object
    And I apply to a new position
    Then I verify profile is created
    And I see position in my jobs

  @careers3
  Scenario: Candidate adds new job
    Given I open "careers" page object
    And I login as "candidate"
    Then I verify "candidate" login
    When I apply for a new job
    Then I see position marked as applied
    And I see position added in my jobs

  @careers4
  Scenario: REST api
    Given I login to REST as "recruiter"
    When I create a new position with REST
    And I delete this new position with REST

  @careers1_4
  Scenario: Recruiter creates position, with REST, combo of scenario 1 and 4
    Given I login to REST as "recruiter"
    When I create a new position with REST
    And I verify position created, in REST

  @careers2_4
  Scenario: candidate applies to a position, with REST
    Given I apply to a new position with REST
    Then I verify profile is created with REST
    And I see position in my jobs with REST
    Then position is deleted

  @careers3_4
  Scenario: Candidate adds new job, with REST
    Given I login to REST as "candidate"
    When I apply for a job with REST
    And I see position in my jobs with REST



