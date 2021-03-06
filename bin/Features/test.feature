#JIRA STORIES - FX-271,FX-274,FX-602,FX-590
 @Test1
Feature: BookacontractonestepSandbox

 As an API user 

	I want sandbox environment to replicate WF Backend system functionality for FX Book A Contract Sandbox.

	So that I can test the code before going live.

     

     As an API provider

    I want to be able to hit a end point "foreign-exchange/deals" so that i can get a success changes in the filed as per the request.

    #Successful Case (happy path)          

    #Json Schema Valid Response
 
      Scenario: Send valid Book_a_contract1step in the Sandbox

        Given I have valid Book_a_contract1step Data for the Sandbox

        When  I want to test specific request for Book_a_contract1step in the Sandbox.

        Then  I receive expected Book_a_contract1step response form Sandbox



    #Scenario_One 

    #FX_Quote_Type

      Scenario: Send Invalid FX_quote_type data for Book_a_contract1step in Sandbox to check error response code <1001-017>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Invalid FX_quote_type Data for Book_a_contract1step

         Then  I receive an error response code "1001-017" for FX_quote_type is not valid for Book_a_contract1step

         

    #Buy_Sell_Indicator

      Scenario: As a user i want check Field Buy/Sell Indicator is ENUM for Book_a_contract1step Sandbox

        Given I have Invalid Book_a_contract1step Sandbox for the field Buy/Sell Indicator

        When I send Invalid Book_a_contract1step Sandbox Data for the ENUM field Buy/Sell Indicator

        Then I will get the response as Buy/Sell Indicator is ENUM for Book_a_contract1step

    

    #Base_Currency_Code

      Scenario: Send Invalid Base_Currency_Code data for Book_a_contract1step in Sandbox to check error response code <1001-007>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Invalid Base_Currency_Code Data for Book_a_contract1step

         Then  I receive an error response code "1001-007" for Base_Currency_Code is not valid for Book_a_contract1step

    

    #Base_Currency_Amount

      Scenario: Send Invalid Base_Currency_Amount data for Book_a_contract1step in Sandbox to check error response code <1001-020>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Invalid Base_Currency_Amount Data for Book_a_contract1step

         Then  I receive an error response code "1001-020" for Base_Currency_Amount is not valid for Book_a_contract1step

    

    #Contra_Currency_Code

      Scenario: Send Invalid Contra_Currency_Code data for Book_a_contract1step in Sandbox to check error response code <1001-007>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Invalid Contra_Currency_Code Data for Book_a_contract1step

         Then  I receive an error response code "1001-007" for Contra_Currency_Code is not valid for Book_a_contract1step

    

    #Value_Date_Type

      Scenario: Send Invalid Value_Date_Type data for Book_a_contract1step in Sandbox to check error response code <1001-006>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Invalid Value_Date_Type Data for Book_a_contract1step

         Then  I receive an error response code "1001-006" for Value_Date_Type is not valid for Book_a_contract1step

         
  #partner_reference_id

      Scenario: Send Invalid partner_reference_id data for Book_a_contract1step in Sandbox to check error response code <1001-033>

         Given I have Invalid Book_a_contract1step Data for the sandbox

         When  I send Missing partner_reference_id field for Book_a_contract1step

         Then  I receive an error response code "1001-033" for partner_reference_id field is missing from Book_a_contract1step

    
    