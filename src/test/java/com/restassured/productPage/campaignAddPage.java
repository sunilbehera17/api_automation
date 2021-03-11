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

public class campaignAddPage extends CommonPage
{
	
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public String API = "ads/campaign/add";
	
	
	  public String campaignAdd_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
		  //request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"campaign_name\" : "+"\""+"Test"+randomnumber()+"\""+",\n" + 
		  		"\"campaign_description\" : \"Test Adv description2\",\n" + 
		  		"\"edit\" : false\n" + 
		  		"}");
	  
	  response =  postRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long CampaignAddResponseTime()
	  {

		  baseURI = AdProperty.getURL();
		  jsonparser("{\n" + 
				  "\"campaign_name\" : "+"\""+"Test"+randomnumber()+"\""+",\n" + 
			  		"\"campaign_description\" : \"Test Adv description2\",\n" + 
			  		"\"edit\" : false\n" + 
			  		"}");
		  
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
