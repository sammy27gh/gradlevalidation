package com.firstdata.gateway.ucomm.domain;

import java.util.Map;

//import com.sun.media.jfxmedia.logging.Logger;


import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;

public class BookACtrct1StpRequest {
	
	
	public static String createRequestBody(BookACtrct1Stp bookACtrct1Stp){
		
		String request = "{\"client_identifier\": {\"client_name\": \""+bookACtrct1Stp.getClient_name()
        		+"\", \"organization_name\": \""+bookACtrct1Stp.getOrganization_name()
        		+"\", \"version\" : \""+bookACtrct1Stp.getVersion()
        		+"\" , \"customer_identifiers\": [{\"issued_id_type\": \""+bookACtrct1Stp.getIssued_id_type()
        		+"\", \"issued_id_value\": \""+bookACtrct1Stp.getIssued_id_value()
        		+"\"} ] }, \"requests_for_quote\":[ {\"sequence_id\": \""+java.util.UUID.randomUUID()
        		+"\",\"fx_quote_type\": \""+bookACtrct1Stp.getFx_quote_type()
        		+"\", \"buy_sell_indicator\": \""+bookACtrct1Stp.getBuy_sell_indicator()
        		+"\", \"base_currency_code\": \""+bookACtrct1Stp.getBase_currency_code()
        		+"\", \"base_currency_amount\":"+bookACtrct1Stp.getBase_currency_amount()
        		+", \"contra_currency_code\": \""+bookACtrct1Stp.getContra_currency_code()
        		+"\", \"receiving_method\": \""+bookACtrct1Stp.getReceiving_method()
        		+"\", \"fx_value_date_type\": \""+bookACtrct1Stp.getFx_value_date_type()
        		+"\", \"partner_reference_id\": \""+bookACtrct1Stp.getPartner_reference_id()
        		+"\"} ] }";
		
		return request;
	}
	private static VerifyFunctions verifyfunctions;
	public static Headers createRequestHeader(BookACtrct1Stp bookACtrct1Stp) throws Throwable{
		verifyfunctions = new VerifyFunctions(); 
		String bearerToken = verifyfunctions.fetchAPIToken("Unlimit");
		Header reqIdHdr = new Header("request-id", java.util.UUID.randomUUID().toString());
		Header gtwCmpnyIdHdr = new Header("gateway-company-id", bookACtrct1Stp.getGateway_company_id());
		Header gtwUsrIdHdr = new Header("gateway-user-id", bookACtrct1Stp.getGateway_user_id());
		Header sessionIdHdr = new Header("session-id", bookACtrct1Stp.getSession_id());
		Header authorizationKeyHdr = new Header("Authorization", "Bearer "+ bearerToken);
		Headers headers = new Headers(reqIdHdr,gtwCmpnyIdHdr, gtwUsrIdHdr, sessionIdHdr, authorizationKeyHdr);
		return headers;
		
	}
	
	public static Headers createRequestHeadernoAPIKey(BookACtrct1Stp bookACtrct1Stp) throws Throwable{
		Header reqIdHdr = new Header("request-id", java.util.UUID.randomUUID().toString());
		Header gtwCmpnyIdHdr = new Header("gateway-company-id", bookACtrct1Stp.getGateway_company_id());
		Header gtwUsrIdHdr = new Header("gateway-user-id", bookACtrct1Stp.getGateway_user_id());
		Header sessionIdHdr = new Header("session-id", bookACtrct1Stp.getSession_id());
		Headers headers = new Headers(reqIdHdr,gtwCmpnyIdHdr, gtwUsrIdHdr, sessionIdHdr);
		return headers;
		
	}
	
	// add the different headers for the different scopes. 
		private static VerifyFunctions verifyfunctions_dealingQuotes;
		public static Headers createRequestHeader_dealingQuotes(BookACtrct1Stp bookACtrct1Stp) throws Throwable{
			verifyfunctions_dealingQuotes = new VerifyFunctions(); 
			String bearerToken = verifyfunctions_dealingQuotes.fetchAPIToken_DealingQuotes("Unlimit");
			Header reqIdHdr = new Header("request-id", java.util.UUID.randomUUID().toString());
			Header gtwCmpnyIdHdr = new Header("gateway-company-id", bookACtrct1Stp.getGateway_company_id());
			Header gtwUsrIdHdr = new Header("gateway-user-id", bookACtrct1Stp.getGateway_user_id());
			Header sessionIdHdr = new Header("session-id", bookACtrct1Stp.getSession_id());
			Header authorizationKeyHdr = new Header("Authorization", "Bearer "+ bearerToken);
			Headers headers = new Headers(reqIdHdr,gtwCmpnyIdHdr, gtwUsrIdHdr, sessionIdHdr, authorizationKeyHdr);
			return headers;
			
		}
		
		// Add the different parameter base
		public static Map<String, String> createRequestParametersBase(BookACtrct1Stp bookACtrct1Stp) {
			
			return null;
		}
		
		
	private String client_name;
	private String organization_name;
	private String version;
	private String issued_id_type;
	private String issued_id_value;
	private String sequence_id;
	private String fx_quote_type;
	private String buy_sell_indicator;
	private String base_currency_code;
	private String base_currency_amount;
	private String contra_currency_code;
	private String receiving_method;
	private String fx_value_date_type;
	private String fx_value_date;
	private String from_account_id;
	private String from_account_branch_id;
	private String partner_reference_id;
	
	public String getFx_quote_type() {
		return fx_quote_type;
	}

	public void setFx_quote_type(String fx_quote_type) {
		this.fx_quote_type = fx_quote_type;
	}

	public String getFx_value_date_type() {
		return fx_value_date_type;
	}

	public void setFx_value_date_type(String fx_value_date_type) {
		this.fx_value_date_type = fx_value_date_type;
	}

	public String getFx_value_date() {
		return fx_value_date;
	}

	public void setFx_value_date(String fx_value_date) {
		this.fx_value_date = fx_value_date;
	}

	public String getFrom_account_id() {
		return from_account_id;
	}

	public void setFrom_account_id(String from_account_id) {
		this.from_account_id = from_account_id;
	}

	public String getFrom_account_branch_id() {
		return from_account_branch_id;
	}

	public void setFrom_account_branch_id(String from_account_branch_id) {
		this.from_account_branch_id = from_account_branch_id;
	}

	public String getPartner_reference_id() {
		return partner_reference_id;
	}

	public void setPartner_reference_id(String partner_reference_id) {
		this.partner_reference_id = partner_reference_id;
	}

	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getIssued_id_type() {
		return issued_id_type;
	}
	public void setIssued_id_type(String issued_id_type) {
		this.issued_id_type = issued_id_type;
	}
	public String getIssued_id_value() {
		return issued_id_value;
	}
	public void setIssued_id_value(String issued_id_value) {
		this.issued_id_value = issued_id_value;
	}
	public String getBuy_sell_indicator() {
		return buy_sell_indicator;
	}
	public void setBuy_sell_indicator(String buy_sell_indicator) {
		this.buy_sell_indicator = buy_sell_indicator;
	}
	public String getBase_currency_code() {
		return base_currency_code;
	}
	public void setBase_currency_code(String base_currency_code) {
		this.base_currency_code = base_currency_code;
	}
	public String getBase_currency_amount() {
		return base_currency_amount;
	}
	public void setBase_currency_amount(String base_currency_amount) {
		this.base_currency_amount = base_currency_amount;
	}
	public String getContra_currency_code() {
		return contra_currency_code;
	}
	public void setContra_currency_code(String contra_currency_code) {
		this.contra_currency_code = contra_currency_code;
	}
	public String getReceiving_method() {
		return receiving_method;
	}
	public void setReceiving_method(String receiving_method) {
		this.receiving_method = receiving_method;
	}
	public String getSequence_id() {
		return sequence_id;
	}

	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}

	


}
