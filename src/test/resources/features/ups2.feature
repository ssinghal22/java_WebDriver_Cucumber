@ups2
Feature: UPS second feature

  @ups2-1
  Scenario: Validate Create Shipment functionality
    Given I open "ups" page
    When I go to Create Shipment page
    And I fill out required fields
    And I Submit the form
    Then I verify submitted data saved successfully
    When I fill out destination shipment fields

            # Then I verify total charges appear
    Then I verify total charges changed to "$11.71"
    And I submit the shipment form
    And I set packaging type
    Then I verify total charges changed to "$37.47"
#    Then I verify total charges changed

    And I submit the shipment form
    And I select cheapest delivery option
    And I submit the shipment form
    And I set Saturday Delivery type

#    Then I verify total charges changed again
    Then I verify total charges changed to "$54.47"
    And I submit the shipment form
    And I select Paypal payment type
    And  I submit the paypal form
    Then I review all recorded details on the review
    And I cancel the shipment form
    And I verify form reset successfully

  # sorry, Given, And, When is not same as urs
  # 8/1/22 not so good way of writing step defs, ignore it