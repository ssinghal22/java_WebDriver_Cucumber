@credible
  Feature: Credible scenario

    @credible1_pom
    Scenario: Interview project
      Given I go to credible page object
      When I click on Student Loans tile in the landing page
      And I enter Education info
      And I enter Financial info
      And I enter Profile info

