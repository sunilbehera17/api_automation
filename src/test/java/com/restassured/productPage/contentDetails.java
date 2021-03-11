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

public class contentDetails extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String contentDetails_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		 jsonparser("{\r\n" + 
		 		"    \"query\": \"{ contentList(content_uuid: \\\"60797a8cd14742cb82ebd16c327835d0\\\",app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
		 		+ "{ app_token product_key content_name content_permalink content_uuid content_parent_uuid content_desc content_asset_type content_asset_uuid content_level is_encoded categories{ category_name category_uuid } "
		 		+ "video_details {reference_uuid expected_duration encoding_status encoding_end_time file_name third_party_url } "
		 		+ "cast_details {cast_uuid cast_name cast_bio cast_image_uuid created_date cast_image_details {image_uuid file_name file_url } cast_type_details {cast_type_uuid cast_type_name } }}}\"\r\n" + 
		 		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long contentDetailsResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			 		"    \"query\": \"{ contentList(content_uuid: \\\"60797a8cd14742cb82ebd16c327835d0\\\",app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
			 		+ "{ app_token product_key content_name content_permalink content_uuid content_parent_uuid content_desc content_asset_type content_asset_uuid content_level is_encoded categories{ category_name category_uuid } "
			 		+ "video_details {reference_uuid expected_duration encoding_status encoding_end_time file_name third_party_url } "
			 		+ "cast_details {cast_uuid cast_name cast_bio cast_image_uuid created_date cast_image_details {image_uuid file_name file_url } cast_type_details {cast_type_uuid cast_type_name } }}}\"\r\n" + 
			 		"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String contentDetails_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			 		"    \"query\": \"{ contentList(content_uuid: \\\"LLL\\\",app_token:\\\":app_token\\\", product_key:\\\":product_key\\\")"
			 		+ "{ app_token product_key content_name content_permalink content_uuid content_parent_uuid content_desc content_asset_type content_asset_uuid content_level is_encoded categories{ category_name category_uuid } "
			 		+ "video_details {reference_uuid expected_duration encoding_status encoding_end_time file_name third_party_url } "
			 		+ "cast_details {cast_uuid cast_name cast_bio cast_image_uuid created_date cast_image_details {image_uuid file_name file_url } cast_type_details {cast_type_uuid cast_type_name } }}}\"\r\n" + 
			 		"}");
	  
	  response =  postRequest("content", token);
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
