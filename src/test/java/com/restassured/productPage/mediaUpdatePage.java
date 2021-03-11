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

import com.restassured.property.AdProperty;;

public class mediaUpdatePage extends CommonPage
{
	
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public String API = "ads/media/update";
	
	
	public void PassingBodydata()
	{
		jsonparser("{\n" + 
				"    \"data\": [\n" + 
				"        {\n" + 
				"            \"field_name\": \"content_name\",\n" + 
				"            \"field_value\": \"beingsambitray\",\n" + 
				"            \"is_default\": 1,\n" + 
				"            \"field_uuid\": \"WiONbtlVcaNzE4VdKycwAiyiizCGI66vMY3h5hNls9zm9OTrxzgbMmWLJYAYG5K1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"field_name\": \"content_category\",\n" + 
				"            \"field_value\": \"20e042c829c44a38b7affd6dad2112c8\",\n" + 
				"            \"is_default\": 3,\n" + 
				"            \"field_uuid\": \"WiONbtlVcaNzE4VdKycwAiyiizCGI66vMY3h5hNls9zm9OTrxzgbMmWLJYAYG5K3\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"field_name\": \"campaign\",\n" + 
				"            \"field_value\": \"418fc24c19764b3a99f5a96529c52590\",\n" + 
				"            \"is_default\": 3,\n" + 
				"            \"field_uuid\": \"4ABymlAX90wQydhF07fqOlDZ7kLMzkZSBVOHQ7FtOcMdXVdWM23BYdZl5vblfaZU\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"field_name\": \"redirect_link\",\n" + 
				"            \"field_value\": \"http://www.muvi.com\",\n" + 
				"            \"is_default\": 3,\n" + 
				"            \"field_uuid\": \"4ujRUsFWKR33zIO5WoqXjzr9yh2lIcn0K9AssghX6OB83iwxolyFiRwBI0V0mtdY\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"field_name\": \"content_asset_uuid\",\n" + 
				"            \"field_value\": \"E75A08BD7DAB768A9B41D711D231614247891044\",\n" + 
				"            \"is_default\": 1,\n" + 
				"            \"field_uuid\": \"WiONbtlVcaNzE4VdKycwAiyiizCGI66vMY3h5hNls9zm9OTrxzgbMmWLJYAYG5K4\"\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"redirect_link\": \"http://www.muvi.com\",\n" + 
				"    \"edit\": true,\n" + 
				"    \"content_uuid\": \"951c9bff94cb439bb2ad4c8bd59b88d3\"\n" + 
				"}");
	}
	  public String mediaUpdate_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
		  //request data (Json data) 
		  PassingBodydata();
	  response =  putRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long mediaUpdateResponseTime()
	  {

		  baseURI = AdProperty.getURL();
		  PassingBodydata();
		  
		  response =  postRequest(API, token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	  
	  public String addform_invalid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" +
	  "		     \"query\": \"{templateList {template_uuid}}\",\n" +
	  "		     \"form_name\": \"adServerVideo\"\n" + "		}");
	  
	  response =  postRequest("getAddForm", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	 
	
	

}
