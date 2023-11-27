
Feature: Nykaa(Beauty and personal care)shopping

  @atest
  Scenario: Launch the Browser and Url
    Given User launch the Web browser and Url
    Then User should be on the Nykaa home page
@btest
  Scenario: Search a product
    Given User move to an cursor on Skin and click a facewash
    When Page is navigate to new tab
    And User click a Cetaphil Gentle Skin Cleanser
    Then User should see the Cetaphil Gentle Skin Cleanser product
#@ctest
  #Scenario: Select a Quantity
    #Given The User selected the product quantity
    #When User can able to dropdown the quantity
    #And User should increase the quantity size of product
@dtest
  Scenario: Add to cart
    Given User click a Add to card button
    When User click a bag button
    And User click a proceed button
    Then Place your oder page should be opend
@etest
  Scenario: Continue as guest
    Given User can able to click a Continue as guest button
    
@ftest
  Scenario: Add a Address
    Given User enters their Pincode in given filed
    When User enters their house no in given filed
    And User enters their Road/Area name in given filed
    And User enters their  name in given filed
    And User enters their Phone no in given filed
    And User enters their Email id in given filed
    And User click on Ship to the Address button
    Then The Payment page should be opend
@gtest
  Scenario: Payment Method
    Given User click on Cash on Delivery
    #When User click on Place a order button
    Then Order should be placed with cash on delivery
