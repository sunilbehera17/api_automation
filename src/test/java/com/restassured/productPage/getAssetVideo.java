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

public class getAssetVideo extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String getAssetVideo_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"video\\\"){video_uuid file_name file_type file_url resolution video_width video_height} }\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("library", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long getAssetVideoResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"video\\\")"
		  		+ "{video_uuid file_name file_type file_url resolution video_width video_height} }\"\r\n" + 
		  		"}");
	  response =  postRequest("library", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String getAssetVideo_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"   \"query\": \"{getAssets(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",asset_uuid:\\\"\\\",store_key:\\\"\\\",file_type:\\\"video\\\")"
		  		+ "{video_uuid file_name file_type file_url resolution video_width video_height} }\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("library", token);
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
