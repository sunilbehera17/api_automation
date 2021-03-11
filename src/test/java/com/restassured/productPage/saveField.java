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

public class saveField extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	  public String saveField_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"field_name\":\"TestField\",\r\n" + 
		  		"   \"field_alias\": \"testfield\",\r\n" + 
		  		"   \"field_type_id\": 1,\r\n" + 
		  		"   \"field_isdefault\": 1,\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("field/save", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long saveFieldResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"field_name\":\"TestField\",\r\n" + 
		  		"   \"field_alias\": \"testfield\",\r\n" + 
		  		"   \"field_type_id\": 1,\r\n" + 
		  		"   \"field_isdefault\": 1,\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}");
	  response =  postRequest("field/save", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String saveField_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"field_name\":\"\",\r\n" + 
		  		"   \"field_alias\": \"director\",\r\n" + 
		  		"   \"field_type_id\": 1,\r\n" + 
		  		"   \"field_isdefault\": 1,\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("field/save", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
