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

public class saveAssetAudio extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String saveAssetAudio_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"file_type\": \"audio\",\r\n" + 
		  		"    \"entity_ag\": \"21c7b4b327e9142a278d69bc10852a34-2\",\r\n" + 
		  		"    \"file_url\": \"https://s3.amazonaws.com/muvi6-library-test/undefined/audio/Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"user_uuid\": \"17325ad1c482fa796bfbea34d7157\",\r\n" + 
		  		"    \"content_type\": \"audio/mp3\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"app_token\":\"1234\",\r\n" + 
		  		"    \"product_key\":\"5678\",\r\n" + 
		  		"    \"file_uuid\":\"ejbyetru344rer\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("save-asset", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long saveAssetAudioResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"file_type\": \"audio\",\r\n" + 
		  		"    \"entity_ag\": \"21c7b4b327e9142a278d69bc10852a34-2\",\r\n" + 
		  		"    \"file_url\": \"https://s3.amazonaws.com/muvi6-library-test/undefined/audio/Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"user_uuid\": \"17325ad1c482fa796bfbea34d7157\",\r\n" + 
		  		"    \"content_type\": \"audio/mp3\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"app_token\":\"1234\",\r\n" + 
		  		"    \"product_key\":\"5678\",\r\n" + 
		  		"    \"file_uuid\":\"ejbyetru344rer\"\r\n" + 
		  		"}");
	  response =  postRequest("save-asset", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String saveAssetAudio_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"file_type\": \"audio\",\r\n" + 
		  		"    \"entity_ag\": \"21c7b4b327e9142a278d69bc10852a34-2\",\r\n" + 
		  		"    \"file_url\": \"https://s3.amazonaws.com/muvi6-library-test/undefined/audio/Laung_Laachi_Title_Song_Mannat_Noor_Ammy_Virk__Neeru_Bajwa_Amberdeep_Latest_Punjabi_Movie_2.mp3\",\r\n" + 
		  		"    \"user_uuid\": \"17325ad1c482fa796bfbea34d7157\",\r\n" + 
		  		"    \"content_type\": \"audio/mp3\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"app_token\":\"1234\",\r\n" + 
		  		"    \"product_key\":\"5678\",\r\n" + 
		  		"    \"file_uuid\":\"\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("save-asset", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
