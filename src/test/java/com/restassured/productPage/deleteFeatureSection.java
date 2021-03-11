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

public class deleteFeatureSection extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String deleteFeatureSection_valid_Inputs() 
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		" \"feature_section_uuid\": \""+gettingFeatureid()+"\" \r\n" + 
			  		"}    ");
	  
	  response =  deleteRequest("feature/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public String gettingFeatureid()
	  {
		  baseURI = ContentProperty.getURL();
		//request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"  \"feature_section_name\": \"FeatureOne\",\r\n" + 
		  		"  \"feature_section_type\": 1,\r\n" + 
		  		"  \"app_token\": \":app_token\",\r\n" + 
		  		"  \"store_key\": \":store_key\",\r\n" + 
		  		"  \"product_key\": \":product_key\",\r\n" + 
		  		"  \"feature_content_type\": \"1\",\r\n" + 
		  		"  \"content_uuid\":[\""+gettingContentid()+"\"]\r\n" + 
		  		"}");
		   response = postRequest("feature/add", token);
			ResponseData = response.jsonPath();
			System.out.println("Response token "+ResponseData.get("data.feature_section_uuid"));
			
			return ResponseData.get("data.feature_section_uuid");
		  
	  }
	  
	  
	  
	  
	  public String gettingContentid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			jsonparser("{     \r\n" + 
			  		"\"isuploading\":false,\r\n" + 
			  		"\"content_trans\":[],\r\n" + 
			  		"\"content_asset_type\":1,\r\n" + 
			  		"\"content_template_uuid\":\"1\",\r\n" + 
			  		"\"content_name\":\"Feature Content\",\r\n" + 
			  		"\"content_permalink\":\"feature-content\",\r\n" + 
			  		"\"content_accessibility\":\"2\",\r\n" + 
			  		"\"content_category_uuid\":\"\\\"5afcbd0d5cd94d73aec217348c36abee\\\"\",\r\n" + 
			  		"\"content_desc\":\"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\",\r\n" + 
			  		"\"tags\":\"[automation]\",\r\n" + 
			  		"\"store_key\":\":store_id\",\r\n" + 
			  		"\"app_token\":\":app_token\",\r\n" + 
			  		"\"content_level\":\"0\",\r\n" + 
			  		"\"content_season\":\"\",\r\n" + 
			  		"\"content_episode\":\"\",\r\n" + 
			  		"\"content_asset_uuid\":\"1448E76E853046428B049BD9D4B7C77E\",\r\n" + 
			  		"\"content_trailer_uuid\":\"\",\r\n" + 
			  		"\"content_poster_uuid\":\"\",\r\n" + 
			  		"\"content_banner_uuid\":\"\",\r\n" + 
			  		"\"content_app_poster_uuid\":\"\",\"cast_type\":\"1DBAEF123456EC3\",\r\n" + 
			  		"\"cast_type_input\":\"\",\r\n" + 
			  		"\"cast_items\":[\r\n" + 
			  		"        {\r\n" + 
			  		"                \"cast_trans_cast_uuid\":\"83ffa1f712b442a5996a77c204c0ad7c\",\r\n" + 
			  		"                \"cast_type_uuid\":\"1DBAEF123456EC3\"\r\n" + 
			  		"                \r\n" + 
			  		"        }\r\n" + 
			  		"                ]\r\n" + 
			  		"        \r\n" + 
			  		"}");
			
			response = postRequest("content/save", token);
			ResponseData = response.jsonPath();
			System.out.println("Response token "+ResponseData.get("data.content_uuid"));
			
			return ResponseData.get("data.content_uuid");
			
		}
	  


	public long deleteFeatureSectionResponseTime()
	{

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		" \"feature_section_uuid\": \""+gettingFeatureid()+"\"\r\n" + 
		  		"}");
	  response =  deleteRequest("feature/delete", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	  

	public String deleteFeatureSection_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		" \"feature_section_uuid\": \"\"\r\n" + 
		  		"}");
	  
	  response =  deleteRequest("feature/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	 
	 
	
	

}
