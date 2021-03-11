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

public class featureSectionDetails extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String featureSectionDetails_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		 jsonparser("{\"query\":\"{ featureContentList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\", feature_section_uuid:\\\"826f2c9cc6a94b9ebc090b07ecf8927a\\\"){feature_section_type feature_section_name feature_section_uuid created_date content_list{ content_uuid content_name posters{website{file_uuid file_url file_name}} } }}\"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long featureSectionDetailsResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\"query\":\"{ featureContentList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\", feature_section_uuid:\\\"826f2c9cc6a94b9ebc090b07ecf8927a\\\"){feature_section_type feature_section_name feature_section_uuid created_date content_list{ content_uuid content_name posters{website{file_uuid file_url file_name}} } }}\"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String featureSectionDetails_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\"query\":\"{ featureContentList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\", feature_section_uuid:\\\"826f2c9cc6a94b9ebc090b07ecf8927a\\\"){feature_section_type feature_section_name feature_section_uuid created_date content_list{ content_uuid content_name posters{website{file_uuid file_url file_name}} } }}\"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
