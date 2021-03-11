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

public class addTemplate extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	
	  public String addTemplate_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"template_name\":\"Automation Template\"  ,          \r\n" + 
		  		"   \"template_code\": \"auto-template\",\r\n" + 
		  		"   \"content_type\": 1,\r\n" + 
		  		"   \"template_heading\": \"Automation Template Form\",\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  
	  response =  postRequest("template/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long addTemplateResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"template_name\":\"TestTemplateQA\"  ,          \r\n" + 
		  		"   \"template_code\": \"testtemplateQA\",\r\n" + 
		  		"   \"content_type\": 1,\r\n" + 
		  		"   \"template_heading\": \"Test Template Form API\",\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  response =  postRequest("template/add", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String addTemplate_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"template_name\":\"TestTemplateQA\"  ,\r\n" + 
		  		"   \"template_code\": \"\",\r\n" + 
		  		"   \"content_type\": 1,\r\n" + 
		  		"   \"template_heading\": \"Test Template Form API\",\r\n" + 
		  		"   \"store_key\": \"\",\r\n" + 
		  		"   \"app_token\": \":app_token\",\r\n" + 
		  		"   \"product_key\": \":product_key\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  
	  response =  postRequest("template/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
