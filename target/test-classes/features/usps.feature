@usps
  Feature: USPS feature

    @usps1
    Scenario: verify zipcode from address
      Given I open "usps" page
      And I go to Lookup ZIP page by address
      And I search for result
      Then result must contain "94022" zip code

    @usps2
    Scenario: Validate ZIP code for Portnov Computer School
      Given I open "usps" page
     # When I goto Lookup ZIP page by address
      When I mouse over and go to Lookup Zip page by address
      And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state
      And I search for result
      Then result must contain "94022" zip code

    @usps3
    Scenario: Validate ZIP code with Calculate price
      Given I open "usps" page
      When I go to Calculate price page
      And I put country, shape, quantity
      And I submit for result
      Then result must have price "$2.30"

    @usps4
    Scenario: Calculate price
      Given I open "usps" page
      When I go to Calculate price page
      And I select "United Kingdom" with "Postcard" shape
      And I define "2" quantity
      Then I calculate the price and validate cost is "$2.30"

