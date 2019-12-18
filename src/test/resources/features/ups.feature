@ups
Feature: UPS test cases

  @ups1 @smoke
  Scenario: UPS end to end first
    Given I go to "ups_global" page
    And I select "North America" and "United States - English" on global page
    And I open Shipping menu
    When I go to Create Shipment page
     # And I fill out required fields
    When I fill out origin shipment fields
    And I Submit the form
      #Then I verify submitted data saved successfully
    Then I verify origin shipment fields submitted
    When I cancel the form
   # And I verify form reset successfully
    Then I verify shipment form is reset

   # mine + SS's updates