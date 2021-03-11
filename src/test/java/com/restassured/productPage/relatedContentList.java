/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Shibanee <shibanee@muvi.com> 

apiautomationframework com.restassured.productTest 14-09-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.json.JSONTokener;

import com.restassured.property.ContentProperty;;

public class relatedContentList extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String relatedContentList_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		 jsonparser("{\r\n" + 
		 		"     \"query\":\"{ relatedContent(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\")"
		 		+ " { bundle_uuid parent_uuid content_uuid  } }\"\r\n" + 
		 		"        \r\n" + 
		 		"       \r\n" + 
		 		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long relatedContentListResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			 		"     \"query\":\"{ relatedContent(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\")"
			 		+ " { bundle_uuid parent_uuid content_uuid  } }\"\r\n" + 
			 		"        \r\n" + 
			 		"       \r\n" + 
			 		"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String relatedContentList_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			 		"     \"query\":\"{ relatedContent(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\")"
			 		+ " { bundle_uuid parent_uuid content_uuid  } }\"\r\n" + 
			 		"        \r\n" + 
			 		"       \r\n" + 
			 		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	 
	  
	  
}
