Feature: Home Page Navigation

  @smoke
  @@regression
  Scenario: verify Page Navigation Computer
    Given User is on home page
    When User select menu "computers"

  @sanity
  @regression
  Scenario: verify Page Navigation Electronics
    Given User is on home page
    When User select menu "electronics"

  @regression
  Scenario: verify Page Navigation Apparel
    Given User is on home page
    When User select menu "apparel"

  @regression
  Scenario: verify Page Navigation Digital Downloads
    Given User is on home page
    When User select menu "digital-downloads"

  @regression
  Scenario: verify Page Navigation Books
    Given User is on home page
    When User select menu "books"

  @regression
  Scenario: verify Page Navigation Jewelry
    Given User is on home page
    When User select menu "jewelry"

  @regression
  Scenario: verify Page Navigation Gift Cards
    Given User is on home page
    When User select menu "gift-cards"