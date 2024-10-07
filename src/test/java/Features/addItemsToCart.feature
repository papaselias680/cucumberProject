@Regression

Feature: AddItemsToCart
  Scenario : As a logged in user, i want to add items to cart
    Given I am on the Home page
    And I want to add items to cart
    When I click Add To Cart button
    And I click cart icon
    Then Shopping cart is displayed


