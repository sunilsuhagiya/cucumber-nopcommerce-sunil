Feature: Computer page

  @smoke
  @regression
  Scenario: Product Arrange In Alphabetical Order
    Given User is on home page
    When User select menu option "computers"
    And User click on Desktop
    And User select sort by name "Name: A to Z"
    Then Verify user can see products arranged in order

  @sanity
  @regression
  Scenario: Product Added To Shopping Cart SuccessFully
    Given User is on home page
    When User select menu option "computers"
    And User click on Desktop
    And User select sort by name "Name: A to Z"
    And User click on add to cart
    Then Verify text build your own computer "Build your own computer"
    And User select processor "1"
    And User select Ram "5"
    And User select HDD radio button
    And User select OS Vista premium
    And User select software
    Then Verify the price "$1,475.00"
    And User click on add to cart after price
    Then Verify message on green bar "The product has been added to your shopping cart"
    And User click on close the pop up
    And User mouse hover on shopping cart
    And User click on shopping cart
    Then Verify text "Shopping cart"
    And User clears the quantity
    And User enters new quantity
    And User click on Update cart
    Then Verify the total price "$2,950.00"
    And User click on check box
    And User click on check out button
    Then Verify welcome text "Welcome, Please Sign In!"
    And User click on guest check out
    And User enters billing first name "John"
    And User enters billing last name "Smith"
    And User enters billing email id "john@example.com"
    And User select country "233"
    And User select state "0"
    And User enter billing city "London"
    And User enter billing Address "4,Oxford Street"
    And User enter billing Zip code "W2 4TR"
    And User enter billing Phone number "5665995116994"
    And User click on billing check out
    And User click on day air radio
    And User click on continue after radio
    And User click on credit card
    And User click on continue on credit card
    And User enters card holder name "John Smith"
    And User enters card number "5555555555554444"
    And User select card expiry month from drop down "5"
    And User select card expiry year from drop down "2024"
    And User enter card code "3101"
    And User click on continue on card payment page
    Then Verify credit card payment method "Credit Card"
    And Verify shipping method "Next Day Air"
    And Verify total price "$2,950.00"
    And User click on confirm
    Then Verify Thank you text "Thank you"
    And Verify success order text "Your order has been successfully processed!"
    And User click on continue on final page
    And Verify Welcome final text "Welcome to our store"


