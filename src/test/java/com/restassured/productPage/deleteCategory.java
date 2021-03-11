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

public class deleteCategory extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String deleteCategory_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	   
		  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"category_name\": \"My Choice \",\r\n" + 
		  		"    \"category_parent_uuid\" : \"0\",\r\n" + 
		  		"    \"category_uuid\" : \""+gettingCategoryid()+"\",\r\n" + 
		  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
		  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"	\r\n" + 
		  		"}");
	  
	  response =  deleteRequest("category/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  
	  public String gettingCategoryid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			 jsonparser("{\r\n" + 
				  		"    \"category_name\": \"Totting \",\r\n" + 
				  		"    \"category_parent_uuid\" : \"0\",\r\n" + 
				  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
				  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
				  		"	\r\n" + 
				  		"}");
			
			response = postRequest("category/add",token);
			ResponseData = response.jsonPath();
			System.out.println("Response token "+ResponseData.get("data.category_uuid"));
			
			return ResponseData.get("data.category_uuid");
			
		}


	public long deleteCategoryResponseTime()
	{ 
		  baseURI = ContentProperty.getURL();
		  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
			  		"    \"category_name\": \"My Choice \",\r\n" + 
			  		"    \"category_parent_uuid\" : \"0\",\r\n" + 
			  		"    \"category_uuid\" : \""+gettingCategoryid()+"\",\r\n" + 
			  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
			  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
			  		"	\r\n" + 
			  		"}");
	  response =  deleteRequest("category/delete", token);
	   long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	   return responsetime;
	    
	}
	  

	public String deleteCategory_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	   
		  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"category_name\": \"My Choice \",\r\n" + 
		  		"    \"category_parent_uuid\" : \"0\",\r\n" + 
		  		"    \"category_uuid\" : \"\",\r\n" + 
		  		"    \"app_token\"  : \"7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj\",\r\n" + 
		  		"    \"product_key\" : \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"	\r\n" + 
		  		"}");
	  
	  response =  deleteRequest("category/delete", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	 
	 
	
	

}
