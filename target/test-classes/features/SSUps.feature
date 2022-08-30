#@ups
#Feature: UPS test cases
#
#  @ups1
#  Scenario: UPS end to endfirst
#    Given I go to "ups_global" page
#    And I select "North America" and "United States - English" on global page
#    And I open Shipping menu
#    And I go to Create a Shipment
#    When I fill out origin shipment fields
#    And I submit the shipment form
#    Then I verify origin shipment fields submitted
#    And I cancel the shipment form
#    Then I verify shipment form is reset

  # steps r same as in ups.feature