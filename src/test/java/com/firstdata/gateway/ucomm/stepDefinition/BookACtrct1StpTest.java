package com.firstdata.gateway.ucomm.stepDefinition;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.testng.Assert;

import com.firstdata.gateway.ucomm.domain.BookACtrct1Stp;
import com.firstdata.gateway.ucomm.domain.BookACtrct1StpRequest;
import com.firstdata.gateway.ucomm.domain.VerifyFunctions;
import com.firstdata.gateway.ucomm.util.ForeignExchangeServiceFileProcessor;

//import com.jayway.restassured.response.Header;

import com.jayway.restassured.response.Headers;

import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

import cucumber.api.PendingException;

public class BookACtrct1StpTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookACtrct1StpTest.class);

	public Response responseWhen;

	public Response responseThen;

	private static VerifyFunctions verifyfunctions;

	static BookACtrct1Stp javaBean;

	static List<BookACtrct1Stp> requestList = new ArrayList<BookACtrct1Stp>();

	static Map<String, BookACtrct1Stp> dataMap = new HashMap<String, BookACtrct1Stp>();

	static {

		verifyfunctions = new VerifyFunctions();

		Map<String, String> columnMapping = new HashMap<String, String>();

		columnMapping.put("ScenarioName", "scenario_name");

		columnMapping.put("request_id", "request_id");

		columnMapping.put("buy_sell_indicator", "buy_sell_indicator");

		columnMapping.put("base_currency_code", "base_currency_code");

		columnMapping.put("base_currency_amount", "base_currency_amount");

		columnMapping.put("contra_currency_code", "contra_currency_code");

		columnMapping.put("contra_currency_amount", "contra_currency_amount");

		columnMapping.put("receiving_method", "receiving_method");

		columnMapping.put("pricing_id", "pricing_id");

		columnMapping.put("exchange_rate", "exchange_rate");

		columnMapping.put("exchange_convert_rule", "exchange_convert_rule");

		columnMapping.put("gateway-company-id", "gateway_company_id");

		columnMapping.put("gateway-user-id", "gateway_user_id");

		columnMapping.put("Authorization", "authorization");

		columnMapping.put("response_code", "response_code");

		columnMapping.put("response_description", "response_description");

		columnMapping.put("field_name", "field_name");

		columnMapping.put("field_value", "field_value");

		columnMapping.put("client_request_id", "client_request_id");

		String resources = "src/test/resources/environment/";

		String env = System.getProperty("env");

		String testDataFile = resources + env + "/testdata/Subscription.csv";



		requestList = new ForeignExchangeServiceFileProcessor<BookACtrct1Stp>()

				.parseCSVToBeanList(resources + env + testDataFile, columnMapping, BookACtrct1Stp.class);

		Iterator<BookACtrct1Stp> iterator = requestList.iterator();

		while (iterator.hasNext()) {

			javaBean = iterator.next();

			dataMap.put(javaBean.getScenario_name(), javaBean);

		}

	}

	@Given("^I have valid Get_Quote Data$")

	public void i_have_valid_Get_Quote_Data() throws Throwable {

		LOGGER.info("I have valid Get_Quote Data");

	}

	@When("^I send a valid Get_Quote all the request fields as Query Parameters$")

	public void i_send_a_valid_Get_Quote_all_the_request_fields_as_Query_Parameters() throws Throwable {

		try {

			LOGGER.info("When I send a valid Get_Quote all the request fields");

			String ScenarioName = "Send valid Get_Quote data";

			LOGGER.debug("Input test data is: " + dataMap.get(ScenarioName));

			Headers requestHeaders = BookACtrct1StpRequest.createRequestHeader(dataMap.get(ScenarioName));

			Map<String, String> parameters = BookACtrct1StpRequest.createRequestParametersBase(dataMap.get(ScenarioName));

			LOGGER.debug("Query Parameters are: " + parameters.toString());

			verifyfunctions.baseURI();

			responseWhen = given().contentType(com.jayway.restassured.http.ContentType.JSON).parameters(parameters)

					.headers(requestHeaders).when().get("foreign-exchange/v2/quotes/non-dealing-quotes")

					.then().statusCode(200)

					.extract().response();

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

		responseThen = responseWhen;

	}

	@Then("^I receive valid Get_Quote response along with all applicable fields$")

	public void i_receive_valid_Get_Quote_response_along_with_all_applicable_fields() throws Throwable {

		try {

			LOGGER.info("Then I receive valid Get_Quote response along with all applicable fields");

			if (responseThen != null) {

				LOGGER.info("Total Response for Get_Quote is: " + responseThen.asString());

				// String ScenarioName = "Send valid Get_Quote data";

				// Response outputs

				verifyfunctions.responseObject(responseThen);

				// Assert True/False/Equals validations

				Assert.assertTrue(responseThen.asString().contains("buy_or_sell"),

						"Response should contain buy_or_sell");

				Assert.assertTrue(responseThen.asString().contains("base_currency_code"),

						"Response should contain base_currency_code");

				Assert.assertTrue(responseThen.asString().contains("base_currency_amount"),

						"Response should contain base_currency_amount");

				Assert.assertTrue(responseThen.asString().contains("contra_currency_code"),

						"Response should contain contra_currency_code");

				Assert.assertTrue(responseThen.asString().contains("contra_currency_amount"),

						"Response should contain contra_currency_amount");

				Assert.assertTrue(responseThen.asString().contains("receiving_method"),

						"Response should contain receiving_method");

				Assert.assertTrue(responseThen.asString().contains("exchange_rate"),

						"Response should contain exchange_rate");

				Assert.assertTrue(responseThen.asString().contains("exchange_rate_conversion_rule"),

						"Response should contain exchange_rate_conversion_rule");

			} else {

				Assert.fail();

			}

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

	}

	@Given("^I have Invalid Get_Quote Data$")

	public void i_have_Invalid_Get_Quote_Data() throws Throwable {

		LOGGER.info("I have Invalid Get_Quote Data");

	}

	@When("^I send an Get_Quote with invalid data of buy_or_sell Passing Enumeration Bu(\\d+) Instead of Buy$")

	public void i_send_an_Get_Quote_with_invalid_data_of_buy_or_sell_Passing_Enumeration_Bu_Instead_of_Buy(int arg1)
			throws Throwable {

		try {

			LOGGER.info(
					"When I send an Get_Quote with invalid data of buy_or_sell Passing Enumeration Bu(\\d+) Instead of Buy");

			String ScenarioName = "Send Invalid Data buy_or_sell Passing Enumeration Bu1 Instead of Buy";

			LOGGER.debug("Input test data is: " + dataMap.get(ScenarioName));

			Headers requestHeaders = BookACtrct1StpRequest.createRequestHeader(dataMap.get(ScenarioName));

			Map<String, String> parameters = BookACtrct1StpRequest.createRequestParametersBase(dataMap.get(ScenarioName));

			verifyfunctions.baseURI();

			responseWhen = given().contentType(com.jayway.restassured.http.ContentType.JSON).parameters(parameters)

					.headers(requestHeaders).when().get("foreign-exchange/v2/quotes/non-dealing-quotes")

					.then().statusCode(400)

					.extract().response();

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

		responseThen = responseWhen;

	}

	@Then("^I receive an error response in Get_Quote which indicates the fields in error for buy_or_sell Passing Enumeration Bu(\\d+) Instead of Buy$")

	public void i_receive_an_error_response_in_Get_Quote_which_indicates_the_fields_in_error_for_buy_or_sell_Passing_Enumeration_Bu_Instead_of_Buy(
			int arg1) throws Throwable {

		try {

			LOGGER.info("buy_sell_indicator response that Enum Value for Get_Quote");

			if (responseThen != null) {

				LOGGER.info("Total Response for Get_Quote is: " + responseThen.asString());

				String ScenarioName = "Send Invalid Data buy_or_sell Passing Enumeration Bu1 Instead of Buy";

				// Response outputs

				verifyfunctions.responseObject(responseThen);

				// Assert True/False/Equals validations

				LOGGER.info("error_code : " + responseThen.path("errors[0].error_code"));

				LOGGER.info("error_description : " + responseThen.path("errors[0].description"));

				LOGGER.info("field_name : " + responseThen.path("errors[0].field_name"));

				LOGGER.info("response_code : " + dataMap.get(ScenarioName).getResponse_code());

				LOGGER.info("response_description : " + dataMap.get(ScenarioName).getResponse_description());


				Assert.assertEquals(responseThen.path("errors[0].error_code"),

						dataMap.get(ScenarioName).getResponse_code().toString());

				Assert.assertEquals(responseThen.path("errors[0].description"),

						dataMap.get(ScenarioName).getResponse_description().toString());

				
						

			} else {

				Assert.fail();

			}

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

	}

	@When("^I send an Get_Quote with invalid data of buy_or_sell having more than (\\d+) Characters$")

	public void i_send_an_Get_Quote_with_invalid_data_of_buy_or_sell_having_more_than_Characters(int arg1)
			throws Throwable {

		try {

			LOGGER.info("When I send an Get_Quote with invalid data of buy_or_sell having more than 3 Characters");

			String ScenarioName = "Send Invalid Data with buy_or_sell more than 3 Characters";

			LOGGER.debug("Input test data is: " + dataMap.get(ScenarioName));

			Headers requestHeaders = BookACtrct1StpRequest.createRequestHeader(dataMap.get(ScenarioName));

			System.out.println(requestHeaders.toString());

			Map<String, String> parameters = BookACtrct1StpRequest.createRequestParametersBase(dataMap.get(ScenarioName));

			verifyfunctions.baseURI();

			responseWhen = given().contentType(com.jayway.restassured.http.ContentType.JSON).parameters(parameters)

					.headers(requestHeaders).when().get("foreign-exchange/v2/quotes/non-dealing-quotes")

					.then().statusCode(400)

					.extract().response();

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

		responseThen = responseWhen;

	}

	@Then("^I receive an error response in Get_Quote which indicates the fields in error for buy_or_sell more than (\\d+) Characters$")

	public void i_receive_an_error_response_in_Get_Quote_which_indicates_the_fields_in_error_for_buy_or_sell_more_than_Characters(
			int arg1) throws Throwable {

		try {

			LOGGER.info("buy_or_sell more than 3 Characters");

			if (responseThen != null) {

				LOGGER.info("Total Response for Get_Quote is: " + responseThen.asString());

				String ScenarioName = "Send Invalid Data with buy_or_sell more than 3 Characters";

				// Response outputs

				verifyfunctions.responseObject(responseThen);

				// Assert True/False/Equals validations

				// LOGGER.info("error_code : " + responseThen.path("errors[0].error_code"));

				LOGGER.info("error_description : " + responseThen.path("errors[0].description"));

				LOGGER.info("error_description : " + responseThen.path("errors[0].description"));

				LOGGER.info("field_name : " + responseThen.path("errors[0].field_name"));

				LOGGER.info("response_code : " + dataMap.get(ScenarioName).getResponse_code());

				LOGGER.info("response_description : " + dataMap.get(ScenarioName).getResponse_description());

				//LOGGER.info("field_name : " + dataMap.get(ScenarioName).getField_name());

				Assert.assertEquals(responseThen.path("errors[0].error_code"),

						dataMap.get(ScenarioName).getResponse_code().toString());

				Assert.assertEquals(responseThen.path("errors[0].description"),

						dataMap.get(ScenarioName).getResponse_description().toString());

				
			} else {

				Assert.fail();

			}

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

	}

	@When("^I send an Get_Quote with invalid data of buy_or_sell having less than (\\d+) Characters$")

	public void i_send_an_Get_Quote_with_invalid_data_of_buy_or_sell_having_less_than_Characters(int arg1)
			throws Throwable {

		try {

			LOGGER.info("When I send an Get_Quote with invalid data of buy_or_sell having less than 3 Characters");

			String ScenarioName = "Send Invalid Data with buy_or_sell less than 3 Characters";

			LOGGER.debug("Input test data is: " + dataMap.get(ScenarioName));

			Headers requestHeaders = BookACtrct1StpRequest.createRequestHeader(dataMap.get(ScenarioName));

			Map<String, String> parameters = BookACtrct1StpRequest.createRequestParametersBase(dataMap.get(ScenarioName));

			verifyfunctions.baseURI();

			responseWhen = given().contentType(com.jayway.restassured.http.ContentType.JSON).parameters(parameters)

					.headers(requestHeaders).when().get("foreign-exchange/v2/quotes/non-dealing-quotes")

					.then().statusCode(400)

					.extract().response();

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

		responseThen = responseWhen;

	}

	@Then("^I receive an error response in Get_Quote which indicates the fields in error for buy_or_sell less than (\\d+) Characters$")

	public void i_receive_an_error_response_in_Get_Quote_which_indicates_the_fields_in_error_for_buy_or_sell_less_than_Characters(
			int arg1) throws Throwable {

		try {

			LOGGER.info("buy_or_sell less than 3 Characters");

			if (responseThen != null) {

				LOGGER.info("Total Response for Get_Quote is: " + responseThen.asString());

				String ScenarioName = "Send Invalid Data with buy_or_sell less than 3 Characters";

				// Response outputs

				verifyfunctions.responseObject(responseThen);

				// Assert True/False/Equals validations

				LOGGER.info("error_description : " + responseThen.path("errors[0].description"));

				// LOGGER.info("error_code : " + responseThen.path("errors[0].error_code"));

				LOGGER.info("error_description : " + responseThen.path("errors[0].description"));

				LOGGER.info("field_name : " + responseThen.path("errors[0].field_name"));

				LOGGER.info("response_code : " + dataMap.get(ScenarioName).getResponse_code());

				LOGGER.info("response_description : " + dataMap.get(ScenarioName).getResponse_description());

				//LOGGER.info("field_name : " + dataMap.get(ScenarioName).getField_name());

				Assert.assertEquals(responseThen.path("errors[0].error_code"),

						dataMap.get(ScenarioName).getResponse_code().toString());

				Assert.assertEquals(responseThen.path("errors[0].description"),

						dataMap.get(ScenarioName).getResponse_description().toString());

				//Assert.assertEquals(responseThen.path("errors[0].field_name"),

						//dataMap.get(ScenarioName).getField_name().toString());

			} else {

				Assert.fail();

			}

		} catch (Exception e) {

			LOGGER.error(e.getMessage());

			Assert.fail();

		}

	}


}
