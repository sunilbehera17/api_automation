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

public class templateList extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String templateList_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\":\"{ templateList(template_code:\\\"AutoQATemp\\\", app_token:\\\":app_token\\\",product_key:\\\":product_key\\\"){template_name template_uuid content_types { content_type_name } template_trans{ template_trans_uuid template_trans_field_order template_trans_field_alias fields { field_uuid field_name field_alias field_isdefault field_type{ field_type_id field_type_name } field_trans { field_trans_uuid field_trans_option }} }}}\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  
	  response =  postRequest("content", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long templateListResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\":\"{ templateList(template_code:\\\"AutoQATemp\\\", app_token:\\\":app_token\\\",product_key:\\\":product_key\\\"){template_name template_uuid content_types { content_type_name } template_trans{ template_trans_uuid template_trans_field_order template_trans_field_alias fields { field_uuid field_name field_alias field_isdefault field_type{ field_type_id field_type_name } field_trans { field_trans_uuid field_trans_option }} }}}\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  response =  postRequest("content", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String templateList_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"query\":\"{ templateList(template_code:\\\"\\\", app_token:\\\":app_token\\\",product_key:\\\":product_key\\\"){template_name template_uuid content_types { content_type_name } template_trans{ template_trans_uuid template_trans_field_order template_trans_field_alias fields { field_uuid field_name field_alias field_isdefault field_type{ field_type_id field_type_name } field_trans { field_trans_uuid field_trans_option }} }}}\"\r\n" + 
		  		"}\r\n" + 
		  		"");
	  
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
