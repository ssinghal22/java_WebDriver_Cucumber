@usps
Feature: USPS scenarios

#  @usps1 @usps_zip
#  Scenario: Validate ZIP code for Portnov Computer School
#    Given I go to "usps" page
#    When I go to Lookup ZIP page by address
#    And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state
#    Then I validate "94022" zip code exists in the result

  @usps1_pom
  Scenario: Validate ZIP code for Portnov Computer School, using POM
    Given I open "usps" page, using POM
    When I go to Lookup ZIP page by address, using POM
    And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state, using POM
    Then I validate "94022" zip code exists in the result, using POM

  @usps9
  Scenario: Calculate price logic page object
    Given I go to usps page object
    When I go to Calculate Price page object
    And I select "United Kingdom" with "Postcard" shape page object
    And I define "2" quantity page object
    Then I calculate the price and validate cost is "$2.30" page object

  @usps10
  Scenario: Wrong store id does not match page object
    Given I go to usps page object
    When I go to Postal Store tab
    And I enter "12345" into store search page object
    Then I search and validate no products found page object