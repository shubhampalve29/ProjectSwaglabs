Feature: Add To Cart

  @smoketest1
  Scenario: Adding a aproduct to cart
    Given user is on login page
    And user enters valid credentials
    Then user is navigated to the home page
    And user added a product to cart

  @smoketest2
  Scenario: Validating that the product is added to cart successfully
    Given user is on login page
    And user enters valid credentials
    Then user is navigated to the home page
    When user added a product to cart and observed the product name
    And user clicks on cart icon on the top
    Then the added product should be visible in the cart
