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

public class castDetails extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String castDetails_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"\"query\":\"{castList(cast_uuid: \\\"fda244002ce34595bc73502d58e142b4\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
			  		+ "{cast_uuid app_token product_key cast_name cast_bio cast_image_uuid "
			  		+ "cast_image_details{file_url file_name image_uuid}}}\" \r\n" + 
			  		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long castDetailsResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"\"query\":\"{castList(cast_uuid: \\\"fda244002ce34595bc73502d58e142b4\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
			  		+ "{cast_uuid app_token product_key cast_name cast_bio cast_image_uuid "
			  		+ "cast_image_details{file_url file_name image_uuid}}}\" \r\n" + 
			  		"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String castDetails_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"\"query\":\"{castList(cast_uuid: \\\"\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
			  		+ "{cast_uuid app_token product_key cast_name cast_bio cast_image_uuid "
			  		+ "cast_image_details{file_url file_name image_uuid}}}\" \r\n" + 
			  		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
