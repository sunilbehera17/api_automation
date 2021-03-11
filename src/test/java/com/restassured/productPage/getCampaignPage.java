/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 25-08-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import com.restassured.assertion.JsonExtract;
import com.restassured.property.AdProperty;;

public class getCampaignPage extends CommonPage
{
	
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public JsonExtract JsonExtract = new JsonExtract();
	public String API = "getCampaign";
	
	
	  public String getCampaign_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"query\": \"{fieldList {field_trans_uuid}}\"\n" + 
		  		"\n" + 
		  		"}");
	  
	  response =  postRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public String getCampaign_uuid() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"query\": \"{fieldList {field_trans_uuid}}\"\n" + 
		  		"\n" + 
		  		"}");
		  JSONObject inputJSONObject = new JSONObject(getCampaign_valid_Inputs());
		  
		  String campaign_uuid=JsonExtract.getKeyValue(inputJSONObject, "field_trans_uuid");
		  
	  System.out.println("The extracted campign uuid is -- "+campaign_uuid);
		
		return campaign_uuid;
	  }
	  
	  public long getCampaignResponseTime()
	  {

		  baseURI = AdProperty.getURL();
		  jsonparser("{\n" + 
		  		"\"query\": \"{fieldList {field_trans_uuid}}\"\n" + 
		  		"\n" + 
		  		"}");
		  
		  response =  postRequest(API, token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	  
	  public String InvalidRequestMethod() 
	  { 
		  baseURI = AdProperty.getURL();
	  
		  jsonparser("{\n" + 
			  		"\"query\": \"{fieldList {field_trans_uuid}}\"\n" + 
			  		"\n" + 
			  		"}");
	  
	  response =  putRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	  public String invalid_token() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" +
	  "		     \"query\": \"{templateList {template_uuid}}\",\n" +
	  "		     \"form_name\": \"adServerVideo\"\n" + "		}");
	  
	  response =  postRequest(API, "fcgvhbjkljy456789");
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	 
	
	

}
