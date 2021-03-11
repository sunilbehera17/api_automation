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

public class deleteAsset extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	
	  public String deleteAsset_valid_Inputs() 
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"        \"file_type\":\"video\",\r\n" + 
		  		"        \"file_uuid\":\"92C4B74EEEBC4363BF442B96219916F0\"\r\n" + 
		  		"} ");
	  
	  response =  deleteRequest("asset/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  
	 


	public long deleteAssetResponseTime()
	{

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"        \"file_type\":\"video\",\r\n" + 
		  		"        \"file_uuid\":\"92C4B74EEEBC4363BF442B96219916F0\"\r\n" + 
		  		"}");
	  response =  deleteRequest("asset/delete", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	  

	public String deleteAsset_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"        \"file_type\":\"video\",\r\n" + 
		  		"        \"file_uuid\":\"ejbyetru344rer\"\r\n" + 
		  		"}");
	  
	  response =  deleteRequest("asset/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	 
	 
	
	

}
