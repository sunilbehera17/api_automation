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

public class categoryList extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	public String categoryList_valid_Inputs() 
	{
		baseURI = ContentProperty.getURL();
		  
		  //request data (Json data) 
		jsonparser("{\r\n" + 
		  		"        \"query\":\"{ categoryList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",category_parent_uuid:\\\"0\\\") { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date sub_category { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } } }\"      \r\n" + 
		  		"}");
		  
		  response =  postRequest("content", token);
		  String resdata = response.getBody().asString();
		  System.out.println(resdata);
		  return resdata;
		
	} 

	  
	  public long categoryListResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"        \"query\":\"{ categoryList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",category_parent_uuid:\\\"0\\\") { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date sub_category { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } } }\"      \r\n" + 
		  		"}");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime;
	  
	  }
	 
	  public String categoryList_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"        \"query\":\"{ categoryList(app_token:\\\":app_token\\\",product_key:\\\":product_key\\\",category_parent_uuid:\\\"\\\") { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date sub_category { category_uuid category_name category_parent_uuid category_permalink category_image_uuid created_date } } }\"      \r\n" + 
			  		"}");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }


}
	
	 
	 
	
	


