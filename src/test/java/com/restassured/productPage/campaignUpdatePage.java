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

public class campaignUpdatePage extends CommonPage
{
	
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public getCampaignPage getCampaignPage = new getCampaignPage();
	public String API = "ads/campaign/update";
	
	public void PassingBodydata()
	{
		jsonparser("{\n" + 
		  		"\"campaign_uuid\" : "+"\""+getCampaignPage.getCampaign_uuid()+"\""+",\n" + 
		  		"\"campaign_name\" : "+"\""+"TestCamp"+randomnumber()+"\""+",\n" + 
		  		"\"campaign_description\" : \"Test Adv description1\",\n" + 
		  		"\"revenue\" : \"20\",\n" + 
		  		"\"edit\" : true\n" + 
		  		"}");
	}
	  public String campaignUpdate_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
		  PassingBodydata();
	  
	  response =  putRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long CampaignUpdateResponseTime()
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
