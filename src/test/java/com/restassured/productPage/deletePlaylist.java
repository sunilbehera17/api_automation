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

public class deletePlaylist extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String deletePlaylist_valid_Inputs() 
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		" \"playlist_uuid\": \""+gettingplaylistid()+"\" \r\n" + 
			  		"}    ");
	  
	  response =  deleteRequest("playlist/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  
	  public String gettingplaylistid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			jsonparser("{   \r\n" + 
					"    \"playlist_name\": \"test\",\r\n" + 
					"    \"playlist_type\": \"1\",\r\n" + 
					"    \"permalink\":\"test\",\r\n" + 
					"    \"playlist_category_uuid\":\"5afcbd0d5cd94d73aec217348c36abee\",\r\n" + 
					"    \"playlist_description\":\"Test Playlist\",\r\n" + 
					"    \"playlist_tags\":\"videos\",\r\n" + 
					"    \"playlist_items\":[\"\"],\r\n" + 
					"    \"playlist_poster_uuid\":\"\",\r\n" + 
					"    \"playlist_banner_uuid\":\"\",\r\n" + 
					"    \"playlist_app_poster_uuid\":\"\",\r\n" + 
					"    \"account_type\":1,\r\n" + 
					"    \"app_token\": \":app_token\",\r\n" + 
					"    \"product_key\": \":product_key\"\r\n" + 
					" }");
			
			response = postRequest("playlist/add", token);
			ResponseData = response.jsonPath();
			System.out.println("Response token "+ResponseData.get("data.playlist_uuid"));
			
			return ResponseData.get("data.playlist_uuid");
			
		}
	  


	public long deletePlaylistResponseTime()
	{

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"playlist_uuid\": \""+gettingplaylistid()+"\" \r\n" + 
			  		"}    ");
	  response =  deleteRequest("playlist/delete", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	  

	public String deletePlaylist_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		" \"playlist_uuid\": \"\" \r\n" + 
			  		"}    ");
	  
	  response =  deleteRequest("playlist/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	 
	 
	
	

}
