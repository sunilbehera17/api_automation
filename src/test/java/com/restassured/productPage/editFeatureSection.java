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

public class editFeatureSection extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String editFeatureSection_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"  \"feature_section_name\": \"Feature Top\",\r\n" + 
		  		"  \"feature_section_type\": 1,\r\n" + 
		  		"  \"app_token\": \":app_token\",\r\n" + 
		  		"  \"store_key\": \":store_key\",\r\n" + 
		  		"  \"product_key\": \":product_key\",\r\n" + 
		  		"  \"feature_content_type\": \"2\",\r\n" + 
		  		"  \"feature_section_uuid\": \"fcc986fb8700457c80110d5d41afd842\",\r\n" + 
		  		"  \"content_uuid\":[\"a5482409fd7547349727e84b62055a92\"]\r\n" + 
		  		"}");
	  
	  response =  putRequest("content/edit", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long editFeatureSectionResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
		  
		   
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"  \"feature_section_name\": \"Feature Top\",\r\n" + 
			  		"  \"feature_section_type\": 1,\r\n" + 
			  		"  \"app_token\": \":app_token\",\r\n" + 
			  		"  \"store_key\": \":store_key\",\r\n" + 
			  		"  \"product_key\": \":product_key\",\r\n" + 
			  		"  \"feature_content_type\": \"2\",\r\n" + 
			  		"  \"feature_section_uuid\": \"fcc986fb8700457c80110d5d41afd842\",\r\n" + 
			  		"  \"content_uuid\":[\"a5482409fd7547349727e84b62055a92\"]\r\n" + 
			  		"}");
	  response =  putRequest("feature/edit", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String editFeatureSection_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"  \"feature_section_name\": \"Feature Top\",\r\n" + 
			  		"  \"feature_section_type\": 1,\r\n" + 
			  		"  \"app_token\": \":app_token\",\r\n" + 
			  		"  \"store_key\": \":store_key\",\r\n" + 
			  		"  \"product_key\": \":product_key\",\r\n" + 
			  		"  \"feature_content_type\": \"2\",\r\n" + 
			  		"  \"feature_section_uuid\": \"\",\r\n" + 
			  		"  \"content_uuid\":[\"a5482409fd7547349727e84b62055a92\"]\r\n" + 
			  		"}");
		  
	  response =  putRequest("feature/edit", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	 /* public String gettingfeaturesectionid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			 jsonparser("{\r\n" + 
			 		"  \"feature_section_name\": \"FeatureOne\",\r\n" + 
			 		"  \"feature_section_type\": 1,\r\n" + 
			 		"  \"app_token\": \":app_token\",\r\n" + 
			 		"  \"store_key\": \":store_key\",\r\n" + 
			 		"  \"product_key\": \":product_key\",\r\n" + 
			 		"  \"feature_content_type\": \"1\",\r\n" + 
			 		"  \"content_uuid\":[\"a5482409fd7547349727e84b62055a92\"]\r\n" + 
			 		"}");
			
			response = postRequest("feature/add", token);
			ResponseData = response.jsonPath();
			System.out.println("Feature Section Id is "+ResponseData.get("data.feature_section_uuid"));
			
			return ResponseData.get("data.feature_section_uuid");
			
		}
	  */
	  
}
