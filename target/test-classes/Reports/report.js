$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Task.feature");
formatter.feature({
  "name": "validating Demo Blaze Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validating flight booking",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "initialize application on the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the Valid information on Departure \"\u003cdeparture\u003e\" to Destination \"\u003cdestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click find flights",
  "keyword": "And "
});
formatter.step({
  "name": "click the selective flights",
  "keyword": "And "
});
formatter.step({
  "name": "enter the name \"\u003cname\u003e\" address \"\u003caddress\u003e\" city \"\u003ccity\u003e\" state \"\u003cstate\u003e\" zip Code \"\u003czip Code\u003e\" card Type \"\u003ccard Type\u003e\" credit Card Number \"\u003ccredit Card Number\u003e\" month \"\u003cmonth\u003e\" year \"\u003cyear\u003e\" name on Card \"\u003cname on Card\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "validate the purchase flight",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "departure",
        "destination",
        "name",
        "address",
        "city",
        "state",
        "zip Code",
        "card Type",
        "credit Card Number",
        "month",
        "year",
        "name on Card"
      ]
    },
    {
      "cells": [
        "Paris",
        "Rome",
        "Satish",
        "Walajapet",
        "Vellore",
        "Tamilnadu",
        "632513",
        "American Express",
        "56456",
        "11",
        "2022",
        "Satish Kumar"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating flight booking",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "initialize application on the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "org.stepdef.StepDef.initialize_application_on_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the Valid information on Departure \"Paris\" to Destination \"Rome\"",
  "keyword": "When "
});
formatter.match({
  "location": "org.stepdef.StepDef.user_enter_the_Valid_information_on_Departure_to_Destination(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click find flights",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdef.StepDef.click_find_flights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the selective flights",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdef.StepDef.click_the_selective_flights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the name \"Satish\" address \"Walajapet\" city \"Vellore\" state \"Tamilnadu\" zip Code \"632513\" card Type \"American Express\" credit Card Number \"56456\" month \"11\" year \"2022\" name on Card \"Satish Kumar\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.stepdef.StepDef.enter_the_name_address_city_state_zip_Code_card_Type_credit_Card_Number_month_year_name_on_Card(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the purchase flight",
  "keyword": "Then "
});
formatter.match({
  "location": "org.stepdef.StepDef.validate_the_purchase_flight()"
});
formatter.result({
  "status": "passed"
});
});