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

public class searchAdd extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	  public String searchAdd_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("[\r\n" + 
		  		"    {\r\n" + 
		  		"        \"index_name\": \"shibanee-test\",\r\n" + 
		  		"        \"type\": \"content\",\r\n" + 
		  		"        \"uu_id\": \"2\"\r\n" + 
		  		"    },\r\n" + 
		  		"    {\r\n" + 
		  		"        \"content_name\": \"Content Two\",\r\n" + 
		  		"        \"app_token\": \"jIfhe4BZEaDDFXr0Vpsc6xyq74RvPPuV\",\r\n" + 
		  		"        \"content_asset_type\": \"1\",\r\n" + 
		  		"        \"content_desc\": \"Animation\",\r\n" + 
		  		"        \"store_key\": \":store_key\",\r\n" + 
		  		"        \"content_uuid\": \"2\"\r\n" + 
		  		"    }\r\n" + 
		  		"]\r\n" + 
		  		"");
	  
	  response =  postRequest("search/add",null);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long searchAddResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("[\r\n" + 
		  		"    {\r\n" + 
		  		"        \"index_name\": \"shibanee-test\",\r\n" + 
		  		"        \"type\": \"content\",\r\n" + 
		  		"        \"uu_id\": \"2\"\r\n" + 
		  		"    },\r\n" + 
		  		"    {\r\n" + 
		  		"        \"content_name\": \"Content Two\",\r\n" + 
		  		"        \"app_token\": \"jIfhe4BZEaDDFXr0Vpsc6xyq74RvPPuV\",\r\n" + 
		  		"        \"content_asset_type\": \"1\",\r\n" + 
		  		"        \"content_desc\": \"Animation\",\r\n" + 
		  		"        \"store_key\": \":store_key\",\r\n" + 
		  		"        \"content_uuid\": \"2\"\r\n" + 
		  		"    }\r\n" + 
		  		"]");
	  response =  postRequest("search/add",null);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String searchAdd_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("[\r\n" + 
		  		"    {\r\n" + 
		  		"        \"index_name\": \"SShibanee-test\",\r\n" + 
		  		"        \"type\": \"content\",\r\n" + 
		  		"        \"uu_id\": \"2\"\r\n" + 
		  		"    },\r\n" + 
		  		"    {\r\n" + 
		  		"        \"content_name\": \"Content Two\",\r\n" + 
		  		"        \"app_token\": \"jIfhe4BZEaDDFXr0Vpsc6xyq74RvPPuV\",\r\n" + 
		  		"        \"content_asset_type\": \"1\",\r\n" + 
		  		"        \"content_desc\": \"Animation\",\r\n" + 
		  		"        \"store_key\": \":store_key\",\r\n" + 
		  		"        \"content_uuid\": \"2\"\r\n" + 
		  		"    }\r\n" + 
		  		"]\r\n" + 
		  		"");
	  
	  response =  postRequest("search/add",null);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
