Feature: validating Demo Blaze Application

  Scenario Outline: validating flight booking
    Given initialize application on the chrome browser
    When user enter the Valid information on Departure "<departure>" to Destination "<destination>"
    And click find flights
    And click the selective flights
    And enter the name "<name>" address "<address>" city "<city>" state "<state>" zip Code "<zip Code>" card Type "<card Type>" credit Card Number "<credit Card Number>" month "<month>" year "<year>" name on Card "<name on Card>"
    Then validate the purchase flight

    Examples: 
      | departure | destination | name   | address   | city    | state     | zip Code | card Type        | credit Card Number | month | year | name on Card |
      | Paris     | Rome        | Satish | Walajapet | Vellore | Tamilnadu |   632513 | American Express |              56456 |    11 | 2022 | Satish Kumar |

      