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

import com.restassured.property.ContentProperty;;

public class addCast extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	
	  public String addCast_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"cast_name\": \"Akashya Kumar\",\r\n" + 
		  		"    \"cast_bio\" : \"Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\",\r\n" + 
		  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
		  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"	\r\n" + 
		  		"}");
	  
	  response =  postRequest("cast/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long addCastResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"cast_name\": \"Akashya Kumar\",\r\n" + 
			  		"    \"cast_bio\" : \"Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\",\r\n" + 
			  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
			  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
			  		"	\r\n" + 
			  		"}");
	  response =  postRequest("cast/add", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String addCast_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"cast_name\": \"TEST\",\r\n" + 
			  		"    \"cast_bio\" : \" \",\r\n" + 
			  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
			  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
			  		"	\r\n" + 
			  		"}");
	  
	  response =  postRequest("cast/add", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  /*public String gettingCategoryid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			 jsonparser("{\r\n" + 
				  		"    \"cast_name\": \"Akashya Kumar\",\r\n" + 
				  		"    \"cast_bio\" : \"Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\",\r\n" + 
				  		"    \"app_token\"  : \"jIfhe4BZEaDDFXr0Vpsc6xyq74RvPPuV\",\r\n" + 
				  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
				  		"	\r\n" + 
				  		"}");
			
			response = postRequest("cast/add", token);
			ResponseData = response.jsonPath();
			System.out.println("Response token "+ResponseData.get("data.cast_uuid"));
			
			return ResponseData.get("data.cast_uuid");
			
		}*/
	  
	  
}
