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

public class playList extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	public String playList_valid_Inputs() 
	{
		baseURI = ContentProperty.getURL();
		  
		  //request data (Json data) 
		jsonparser("{\"query\":\"{playlist(playlist_uuid: \\\"\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\"){playlist_type permalink playlist_name playlist_category_uuid playlist_description playlist_tags playlist_poster_uuid playlist_banner_uuid playlist_app_poster_uuid app_token product_key store_key playlist_uuid playlist_parent_uuid playlist_content_uuid playlist_created_date"
				+ " playlist_banner_details { image_uuid file_name file_url } playlist_app_poster_details { image_uuid file_name file_url } playlist_poster_details { image_uuid file_name file_url } categories { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } content_list { content_uuid content_name content_desc content_permalink content_search_tag content_category_uuid"
				+ " content_template_uuid content_parent_uuid content_asset_type content_asset_uuid content_trailer_uuid content_poster_uuid content_banner_uuid content_app_poster_uuid store_key app_token product_key content_user_uuid content_accessibility content_created_date content_updated_date content_created_by content_updated_by content_level tags is_encoded categories {category_uuid category_name }"
				+ " posters {website{file_uuid file_url file_name} } }}}\"}");
		  
		  response =  postRequest("content", token);
		  String resdata = response.getBody().asString();
		  System.out.println(resdata);
		  return resdata;
		
	} 

	  
	  public long playListResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\"query\":\"{playlist(playlist_uuid: \\\"\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\"){playlist_type permalink playlist_name playlist_category_uuid playlist_description playlist_tags playlist_poster_uuid playlist_banner_uuid playlist_app_poster_uuid app_token product_key store_key playlist_uuid playlist_parent_uuid playlist_content_uuid playlist_created_date"
					+ " playlist_banner_details { image_uuid file_name file_url } playlist_app_poster_details { image_uuid file_name file_url } playlist_poster_details { image_uuid file_name file_url } categories { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } content_list { content_uuid content_name content_desc content_permalink content_search_tag content_category_uuid"
					+ " content_template_uuid content_parent_uuid content_asset_type content_asset_uuid content_trailer_uuid content_poster_uuid content_banner_uuid content_app_poster_uuid store_key app_token product_key content_user_uuid content_accessibility content_created_date content_updated_date content_created_by content_updated_by content_level tags is_encoded categories {category_uuid category_name }"
					+ " posters {website{file_uuid file_url file_name} } }}}\"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	 
	  public String playList_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\"query\":\"{playlist(playlist_uuid: \\\"\\\", app_token:\\\":app_token\\\", product_key:\\\":product_key\\\"){playlist_type permalink playlist_name playlist_category_uuid playlist_description playlist_tags playlist_poster_uuid playlist_banner_uuid playlist_app_poster_uuid app_token product_key store_key playlist_uuid playlist_parent_uuid playlist_content_uuid playlist_created_date"
					+ " playlist_banner_details { image_uuid file_name file_url } playlist_app_poster_details { image_uuid file_name file_url } playlist_poster_details { image_uuid file_name file_url } categories { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } content_list { content_uuid content_name content_desc content_permalink content_search_tag content_category_uuid"
					+ " content_template_uuid content_parent_uuid content_asset_type content_asset_uuid content_trailer_uuid content_poster_uuid content_banner_uuid content_app_poster_uuid store_key app_token product_key content_user_uuid content_accessibility content_created_date content_updated_date content_created_by content_updated_by content_level tags is_encoded categories {category_uuid category_name }"
					+ " posters {website{file_uuid file_url file_name} } }}}\"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }


}
	
	 
	 
	
	


