Feature: Menu Management

  Scenario: Add a menu item
     #AND and BUT keywords can also be added to GIVEN
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added

