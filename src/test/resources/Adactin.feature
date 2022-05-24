Feature: Validating functionalities of Adactin Hotel Application

  Scenario: Validating the Login Functionality of Adactin Hotel Application
    Given user is on Adactin App using Chrome Browser
    When user must type the username as "<SatishKS1>" and password as "<TTFK8K>" and click login
    Then the user validate the login page with "hello SatishKS1"

  Scenario Outline: Validating the order confirmation by inserting some mandatory fields
    Given user is on Adactin App using Chrome Browser
    When the user type the username"<username>" and password "<password>" and click login
    And User enters location no of rooms Checkin date "<arrdate>" Checkout date "<depdate>" adult per room and clicks search
    And User selects the hotel info and clicks continue
    Then user enter the First Name "<firstname>" Last Name "<lastname>" Billing Address "<address>" Credit Card No "<ccno>" and select the creadit card type, expire month and year and type the CVV Number "<cvv>"
    Then user click the booknow

    Examples: 
      | username  | password | arrdate    | depdate    | firstname | lastname | billingaddress       | CCno             | cvvnumber |
      | SatishKS1 | TTFK8K   | 24/06/2022 | 25/07/2022 | Satish    | Kumar    | Thoraipakkam,Chennai | 1234567890123456 |       786 |

  Scenario: Validating Adacting hotel application with incorrect checkin dates
    Given User is on adactin hotel application in chrome browser
    When User enter username as "SatishKS1" and password as "TTFK8K" and clicks login
    And User enters location Number of rooms with incorrect Checkin date "24/06/2022" Checkout date "25/07/2022" adults per room and clicks search
    Then User selects the hotel and clicks continue and validates the error message

  Scenario Outline: Validating cancellation of order id in Adactin Hotel Application
    Given User is on adactin hotel application in chrome browser
    When User enters the username as "<username>" and password as "<password>" and clicks login
    And User enters location Number of rooms Checkin date "<arrdate>" Checkout date "<depdate>" adults per room and clicks search
    And User selects the hotel and clicks continue
    And User enters First name "<firstname>" Last name "<lastname>" Billing Address "<address>" creditcard number "<ccnum>" and selects credit card type Expiry date and enters cvv "<cvv>" and clicks BookNow
    Then User gets order id clicks my itinerary and Validates canecellation by cancelling the order id

    Examples: 
      | username  | password | arrdate    | depdate    | firstname | lastname | billingaddress       | CCno             | cvvnumber |
      | SatishKS1 | TTFK8K   | 24/06/2022 | 25/07/2022 | Satish    | Kumar    | Thoraipakkam,Chennai | 1234567890123456 |       786 |

  Scenario: Validating the cancellation of oroder id from booked itinerary in Adactin Hotel Application
    Given User is on adactin hotel application in chrome browser
    When User enter username as "SatishKS1" and password as "TTFK8K" and clicks login
    And User clicks booked itenary and selects the booking and clicks cancel
    Then User validates the cancellation of the booked order
