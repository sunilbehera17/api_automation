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

public class editPlaylist extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String editPlaylist_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{   \r\n" + 
			  		"    \"playlist_name\": \"Red Red\",\r\n" + 
			  		"    \"playlist_type\": 1,\r\n" + 
			  		"    \"permalink\":\"rediacle\",\r\n" + 
			  		"    \"playlist_category_uuid\":1,\r\n" + 
			  		"    \"playlist_description\":\"Test Playlist\",\r\n" + 
			  		"    \"playlist_tags\":\"songs\",\r\n" + 
			  		"    \"playlist_items\":[\"content_uuid\"],\r\n" + 
			  		"    \"playlist_poster_uuid\":\"\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \":product_key\",\r\n" + 
			  		"    \"playlist_uuid\": \""+gettingPlaylistid()+"\"\r\n" + 
			  		"   }");
	  response =  putRequest("playlist/edit", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long editPlaylistResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
		  
		   
	  //request data (Json data) 
		  jsonparser("{   \r\n" + 
		  		"    \"playlist_name\": \"Red Red\",\r\n" + 
		  		"    \"playlist_type\": 1,\r\n" + 
		  		"    \"permalink\":\"rediacle\",\r\n" + 
		  		"    \"playlist_category_uuid\":1,\r\n" + 
		  		"    \"playlist_description\":\"Test Playlist\",\r\n" + 
		  		"    \"playlist_tags\":\"songs\",\r\n" + 
		  		"    \"playlist_items\":[\"content_uuid\"],\r\n" + 
		  		"    \"playlist_poster_uuid\":\"\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \":product_key\",\r\n" + 
		  		"    \"playlist_uuid\": \""+gettingPlaylistid()+"\"\r\n" + 
		  		"   }");
	  response =  putRequest("playlist/edit", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String editPlaylist_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{   \r\n" + 
		  		"    \"playlist_name\": \"Red Red\",\r\n" + 
		  		"    \"playlist_type\": 1,\r\n" + 
		  		"    \"permalink\":\"\",\r\n" + 
		  		"    \"playlist_category_uuid\":1,\r\n" + 
		  		"    \"playlist_description\":\"Test Playlist\",\r\n" + 
		  		"    \"playlist_tags\":\"songs\",\r\n" + 
		  		"    \"playlist_items\":[\"content_uuid\"],\r\n" + 
		  		"    \"playlist_poster_uuid\":\"\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \":product_key\",\r\n" + 
		  		"    \"playlist_uuid\": \"2673ca20b4ab45c1b1b59690e0b789e7\"\r\n" + 
		  		"   }");
	  response =  putRequest("playlist/edit", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  public String gettingPlaylistid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			 jsonparser("{   \r\n" + 
			 		"    \"playlist_name\": \"Rediacle\",\r\n" + 
			 		"    \"playlist_type\": \"1\",\r\n" + 
			 		"    \"permalink\":\"rediacle\",\r\n" + 
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
				System.out.println("Playlistid "+ResponseData.get("data.playlist_uuid"));
				
				return ResponseData.get("data.playlist_uuid");
			
		}
	  
	  
}
