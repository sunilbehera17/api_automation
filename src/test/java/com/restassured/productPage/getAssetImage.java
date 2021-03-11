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

public class getAssetImage extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String getAssetImage_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"image\\\")"
		  		+ "{image_uuid file_name file_type file_url resolution} }\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("library", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long getAssetImageResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"image\\\")"
		  		+ "{image_uuid file_name file_type file_url resolution} }\"\r\n" + 
		  		"}");
	  response =  postRequest("library", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String getAssetImage_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"image\\\")"
		  		+ "{audio_uuid file_name file_type file_url resolution} }\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("library", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
}
