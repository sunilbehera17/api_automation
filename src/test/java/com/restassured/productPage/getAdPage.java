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

public class getAdPage extends CommonPage
{
	
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public String API = "getAd";
	
	
	public void Passingbodydata()
	{
		//request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"query\": \"{contentList(app_token: \\\"\\\",product_key: \\\"8E4F8A19B07D4F22927CD4CB54672D27\\\") {content_name}}\"\n" + 
		  		"}");
	}
	
	  public String getad_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
		  Passingbodydata();
	  
	  
	  response =  postRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long getadResponseTime()
	  {

		  baseURI = AdProperty.getURL();
	  
		  Passingbodydata();
		  response =  postRequest(API, token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	  
	 
	  public String InvalidRequestMethod() 
	  { 
		  baseURI = AdProperty.getURL();
	  
		  Passingbodydata();
		  
	  response =  deleteRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	  public String invalid_token() 
	  { 
		  baseURI = AdProperty.getURL();
	  
		  Passingbodydata();
		  
	  response =  postRequest(API, "fcgvhbjkljy456789");
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	
	

}
