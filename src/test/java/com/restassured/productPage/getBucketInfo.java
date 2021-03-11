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

public class getBucketInfo extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String getBucketInfo_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\": \"{getBucketInfo(app_token:\\\"12313ddsffdf\\\",product_key:\\\"abc\\\"){s3_details_uuid storage_type s3_bucket_uuid bucket_detail { bucket_name continent_code region_name drm_cloudfront_url signed_cloudfront_url unsigned_cloudfront_url s3_url} assets_path_structure {key_name folder_key s3_path} } }\"\r\n" + 
		  		"\r\n" + 
		  		"}");
	  
	  response =  postRequest("library", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long getBucketInfoResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\": \"{getBucketInfo(app_token:\\\"12313ddsffdf\\\",product_key:\\\"abc\\\"){s3_details_uuid storage_type s3_bucket_uuid bucket_detail { bucket_name continent_code region_name drm_cloudfront_url signed_cloudfront_url unsigned_cloudfront_url s3_url} assets_path_structure {key_name folder_key s3_path} } }\"\r\n" + 
		  		"\r\n" + 
		  		"}");
	  response =  postRequest("library", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String getBucketInfo_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\": \"{getBucketInfo(app_token:\\\"\\\",product_key:\\\"abc\\\"){s3_details_uuid storage_type s3_bucket_uuid bucket_detail { bucket_name continent_code region_name drm_cloudfront_url signed_cloudfront_url unsigned_cloudfront_url s3_url} assets_path_structure {key_name folder_key s3_path} } }\"\r\n" + 
		  		"\r\n" + 
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
