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

public class featureSectionList extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	  public String featureSectionList_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		 jsonparser("\r\n" + 
		 		"{\"query\":\"{featureContentList(app_token:\\\":app_token\\\", product_key:\\\":product_key\\\", store_key:\\\":store_key\\\"){feature_section_name, feature_section_uuid, feature_section_type, "
		 		+ "content_list{content_uuid, content_name, content_desc, content_permalink, content_search_tag, content_parent_uuid, content_asset_type, is_parent, posters{website{file_uuid, file_name, file_url},"
		 		+ " mobile_apps{file_uuid, file_name, file_url}, tv_apps{file_uuid, file_name, file_url}}}}}\"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long featureSectionListResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("\r\n" + 
		  		"{\"query\":\"{featureContentList(app_token:\\\":app_token\\\", product_key:\\\":product_key\\\", store_key:\\\":store_key\\\"){feature_section_name, feature_section_uuid, feature_section_type, "
		  		+ "content_list{content_uuid, content_name, content_desc, content_permalink, content_search_tag, content_parent_uuid, content_asset_type, is_parent, posters{website{file_uuid, file_name, file_url}, "
		  		+ "mobile_apps{file_uuid, file_name, file_url}, tv_apps{file_uuid, file_name, file_url}}}}}\"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String featureSectionList_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("\r\n" + 
		  		"{\"query\":\"{featureContentList(app_token:\\\":app_token\\\", product_key:\\\":product_key\\\", store_key:\\\":store_key\\\"){feature_section_name, feature_section_uuid, "
		  		+ "feature_section_type, content_list{content_uuid, content_name, content_desc, content_permalink, content_search_tag, content_parent_uuid, content_asset_type, is_parent, posters{website{file_uuid, file_name, file_url}, "
		  		+ "mobile_apps{file_uuid, file_name, file_url}, tv_apps{file_uuid, file_name, file_url}}}}}\"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
