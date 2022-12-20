Feature: Electronic page

  @smoke
  @regression
  Scenario: User Should Navigate To Cell Phones Page Successfully
    Given User is on home page
    When User mouse hover on Electronic tab
    And User mouse hover on cell phone and click
    Then Verify the cell phone text "Cell phones"

  @sanity
  @regression
  Scenario: verify That The Product Added Successfully And Place Order Successfully
    Given User is on home page
    When User mouse hover on Electronic tab
    And User mouse hover on cell phone and click
    Then Verify the cell phone text "Cell phones"
    And User click on list view
    And User click on nokia lumia
    Then Verify nokia lumia text "Nokia Lumia 1020"
    And Verify nokia lumia price "$349.00"
    And User change the quantity
    And User click on add to cart nokia
    Then Verify the message product added to cart "The product has been added to your shopping cart"
    And User click on cross button
    And User click on shopping cart link
    Then Verify shopping cart text "Shopping cart"
    And Verify product quantity "2"
    And Verify total price nokia "$698.00"
    And User click on Terms of services
    And User click on check out box
    Then Verify welcome text for nokia page
    And User click on register tab
    Then User verify register text "Register"
    And User enter First name "Shane"
    And User enter Last name "Jhones"
    And User enter email "Jhones123@gmail.com"
    And User enter password "shane123456"
    And User enter confirm password "shane123456"
    And User click on register
    Then Verify Register success message "Your registration completed"
    And User click on continue after register
    Then Verify shopping cart text "Shopping cart"
    And User click on terms and conditions
    And User click on check out button e
    And User select country from drop down "1"
    And User select state from drop down "49"
    And User enter billing city for electronics "New York"
    And User enter billing address for electronics "Procter Close"
    And User enter billing zipcode for electronics "380019"
    And User enter billing phone number for electronics "9876543456"
    And User click on continue
    And User click on second day air
    And User click on continue after day air
    And User click on credit card Electronics
    And User click on continue button on credit card page
    And User select card type "visa"
    And User enter card name "Shanes Jhones"
    And User enter card number digits "4222222222222"
    And User select card expiry month "9"
    And User select card expiry year "2023"
    And User enter visa code "234"
    And User click on continue on payment
    Then Verify payment method "Credit Card"
    And Verify second day air "2nd Day Air"
    And Verify Nokia Total price "$698.00"
    And User click on continue after verify
    Then Verify Thank you "Thank you"
    And Verify order success "Your order has been successfully processed!"
    And User click on continue on final
    Then Verify welcome "Welcome to our store"
    And User click on log out
    Then Verify url







