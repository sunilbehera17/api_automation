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

public class getAddFormPage extends CommonPage
{
	public CommonAPIs commonapis = new CommonAPIs();
	public AdProperty AdProperty = new AdProperty();
	public String token = commonapis.loginAPI(AdProperty.getEmail(),AdProperty.getPassword(),AdProperty.getProductkey(),AdProperty.getProducttoken());
	public String API = "getAddForm";
	
	
	  public String addform_valid_Inputs() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"query\": \"{templateList {template_uuid}}\",\n" + 
		  		"\"form_name\": \"adServerVideoTmp\"\n" + 
		  		"}");
	  
	  response =  postRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long addformResponseTime()
	  {

		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" +
	  "		     \"query\": \"{templateList {template_uuid}}\",\n" +
	  "		     \"form_name\": \"adServerVideoTmp\"\n" + "		}");
	  
	  response =  postRequest(API, token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	  
	  public String InvalidRequestMethod() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" +
	  "		     \"query\": \"{templateList {template_uuid}}\",\n" +
	  "		     \"form_name\": \"adServerVideo\"\n" + "		}");
	  
	  response =  putRequest("getAddForm", token);
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
	  
	  response =  postRequest("getAddForm", "fcgvhbjkljy456789");
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	
	  public String Without_FormName() 
	  { 
		  baseURI = AdProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\n" + 
		  		"\"query\": \"{templateList {template_uuid}}\",\n" + 
		  		"\"form_name\": \"\"\n" + 
		  		"}");
	  
	  response =  postRequest(API, token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	

}
