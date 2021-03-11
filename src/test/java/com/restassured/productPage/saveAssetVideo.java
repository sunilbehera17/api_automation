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

public class saveAssetVideo extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String saveAssetVideo_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"Ek_Hasina_Thi_Theatrical_A_first_look-1611060853847.mp4\",\r\n" + 
		  		"    \"content_type\": \"video/mp4\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"146490FC6025483CB4128E80B2BC3539\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/vl/3E99B276E9CC4A3795345C40AAB4BC6F/Ek_Hasina_Thi_Theatrical_A_first_look-1611060853847.mp4\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"video\",\r\n" + 
		  		"    \"is_encode_required\": \"0\",\r\n" + 
		  		"    \"user_uuid\": \":me\",\r\n" + 
		  		"    \"store_key\": \":store_key\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("save-asset", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long saveAssetVideoResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"file_name\": \"Ek_Hasina_Thi_Theatrical_A_first_look-1611060853847.mp4\",\r\n" + 
			  		"    \"content_type\": \"video/mp4\",\r\n" + 
			  		"    \"file_size\": \"\",\r\n" + 
			  		"    \"file_uuid\":\"146490FC6025483CB4128E80B2BC3539\",\r\n" + 
			  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
			  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/vl/3E99B276E9CC4A3795345C40AAB4BC6F/Ek_Hasina_Thi_Theatrical_A_first_look-1611060853847.mp4\",\r\n" + 
			  		"    \"media_url\": \"\",\r\n" + 
			  		"    \"file_type\": \"video\",\r\n" + 
			  		"    \"is_encode_required\": \"0\",\r\n" + 
			  		"    \"user_uuid\": \":me\",\r\n" + 
			  		"    \"store_key\": \":store_key\",\r\n" + 
			  		"    \"app_token\": \":app_token\",\r\n" + 
			  		"    \"product_key\": \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
			  		"}");
	  response =  postRequest("save-asset", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String saveAssetVideo_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"Beautiful_Love_Song_Video_Animated-1602691222738.mp4\",\r\n" + 
		  		"    \"content_type\": \"video/mp4\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/xPMcugrITuUMeHM2av8zoEyFlVtBkB0I/B05C552148D643158A8AD703B26331CC/vl/64B16D1C390045C6ABC32DDCF4B9C94D/Beautiful_Love_Song_Video_Animated-1602691222738.mp4\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"video\",\r\n" + 
		  		"    \"is_encode_required\": \"0\",\r\n" + 
		  		"    \"user_uuid\": \":me\",\r\n" + 
		  		"    \"store_key\": \":store_key\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("save-asset", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
