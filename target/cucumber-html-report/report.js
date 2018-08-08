$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#JIRA STORIES - FX-271,FX-274,FX-602,FX-590"
    }
  ],
  "line": 3,
  "name": "BookacontractonestepSandbox",
  "description": "\r\nAs an API user \r\n\r\nI want sandbox environment to replicate WF Backend system functionality for FX Book A Contract Sandbox.\r\n\r\nSo that I can test the code before going live.\r\n\r\n   \r\n\r\n   As an API provider\r\n\r\n  I want to be able to hit a end point \"foreign-exchange/deals\" so that i can get a success changes in the filed as per the request.",
  "id": "bookacontractonestepsandbox",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#Successful Case (happy path)"
    },
    {
      "line": 19,
      "value": "#Json Schema Valid Response"
    }
  ],
  "line": 21,
  "name": "Send valid Book_a_contract1step in the Sandbox",
  "description": "",
  "id": "bookacontractonestepsandbox;send-valid-book-a-contract1step-in-the-sandbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I have valid Book_a_contract1step Data for the Sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I want to test specific request for Book_a_contract1step in the Sandbox.",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I receive expected Book_a_contract1step response form Sandbox",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 31,
      "value": "#Scenario_One"
    },
    {
      "line": 33,
      "value": "#FX_Quote_Type"
    }
  ],
  "line": 35,
  "name": "Send Invalid FX_quote_type data for Book_a_contract1step in Sandbox to check error response code \u003c1001-017\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-fx-quote-type-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-017\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I send Invalid FX_quote_type Data for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I receive an error response code \"1001-017\" for FX_quote_type is not valid for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "#Buy_Sell_Indicator"
    }
  ],
  "line": 47,
  "name": "As a user i want check Field Buy/Sell Indicator is ENUM for Book_a_contract1step Sandbox",
  "description": "",
  "id": "bookacontractonestepsandbox;as-a-user-i-want-check-field-buy/sell-indicator-is-enum-for-book-a-contract1step-sandbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 49,
  "name": "I have Invalid Book_a_contract1step Sandbox for the field Buy/Sell Indicator",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I send Invalid Book_a_contract1step Sandbox Data for the ENUM field Buy/Sell Indicator",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "I will get the response as Buy/Sell Indicator is ENUM for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 57,
      "value": "#Base_Currency_Code"
    }
  ],
  "line": 59,
  "name": "Send Invalid Base_Currency_Code data for Book_a_contract1step in Sandbox to check error response code \u003c1001-007\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-base-currency-code-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-007\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 61,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "I send Invalid Base_Currency_Code Data for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "I receive an error response code \"1001-007\" for Base_Currency_Code is not valid for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 69,
      "value": "#Base_Currency_Amount"
    }
  ],
  "line": 71,
  "name": "Send Invalid Base_Currency_Amount data for Book_a_contract1step in Sandbox to check error response code \u003c1001-020\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-base-currency-amount-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-020\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 73,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "I send Invalid Base_Currency_Amount Data for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "I receive an error response code \"1001-020\" for Base_Currency_Amount is not valid for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 81,
      "value": "#Contra_Currency_Code"
    }
  ],
  "line": 83,
  "name": "Send Invalid Contra_Currency_Code data for Book_a_contract1step in Sandbox to check error response code \u003c1001-007\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-contra-currency-code-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-007\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "I send Invalid Contra_Currency_Code Data for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "I receive an error response code \"1001-007\" for Contra_Currency_Code is not valid for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 93,
      "value": "#Value_Date_Type"
    }
  ],
  "line": 95,
  "name": "Send Invalid Value_Date_Type data for Book_a_contract1step in Sandbox to check error response code \u003c1001-006\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-value-date-type-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-006\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 97,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "I send Invalid Value_Date_Type Data for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 101,
  "name": "I receive an error response code \"1001-006\" for Value_Date_Type is not valid for Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 104,
      "value": "#partner_reference_id"
    }
  ],
  "line": 106,
  "name": "Send Invalid partner_reference_id data for Book_a_contract1step in Sandbox to check error response code \u003c1001-033\u003e",
  "description": "",
  "id": "bookacontractonestepsandbox;send-invalid-partner-reference-id-data-for-book-a-contract1step-in-sandbox-to-check-error-response-code-\u003c1001-033\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 108,
  "name": "I have Invalid Book_a_contract1step Data for the sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 110,
  "name": "I send Missing partner_reference_id field for Book_a_contract1step",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "I receive an error response code \"1001-033\" for partner_reference_id field is missing from Book_a_contract1step",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});