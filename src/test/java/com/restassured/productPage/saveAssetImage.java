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

public class saveAssetImage extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String saveAssetImage_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"img71-1611068679684.png\",\r\n" + 
		  		"    \"content_type\": \"image/png\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"39358A6B82AB49D195E7A53045736DDE\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/il/2F6132714594455B8E0FC7CA00B6EBF7/img71-1611068679684.png\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"image\",\r\n" + 
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
	  
	  public long saveAssetImageResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"img71-1611068679684.png\",\r\n" + 
		  		"    \"content_type\": \"image/png\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"39358A6B82AB49D195E7A53045736DDE\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/il/2F6132714594455B8E0FC7CA00B6EBF7/img71-1611068679684.png\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"image\",\r\n" + 
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
	 
	  public String saveAssetImage_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"img71-1611068679684.png\",\r\n" + 
		  		"    \"content_type\": \"image/png\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/il/2F6132714594455B8E0FC7CA00B6EBF7/img71-1611068679684.png\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"image\",\r\n" + 
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
