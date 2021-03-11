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

public class addTemplateTrans extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	  public String addTemplateTrans_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"\"template_trans_template_uuid\":\"9a38e80ba901436bbfaa6ad045f712cc\",\r\n" + 
		  		"\"template_trans_field_uuid\": \"87400f68bbc84693a32d0d86982203a1\",\r\n" + 
		  		"\"template_trans_field_order\": 1;\r\n" + 
		  		"\"template_trans_field_alias\": \"test\",\r\n" + 
		  		"\"template_trans_is_default_field\": \"\",\r\n" + 
		  		"\"app_token\":\":app_token\", \r\n" + 
		  		"\"product_key\":\":product_key\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("template/add-template-trans", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long addTemplateTransResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"\"template_trans_template_uuid\":\"9a38e80ba901436bbfaa6ad045f712cc\"   ,          \r\n" + 
		  		"\"template_trans_field_uuid\": \"87400f68bbc84693a32d0d86982203a1\",\r\n" + 
		  		"\"template_trans_field_order\": 1;\r\n" + 
		  		"\"template_trans_field_alias\": \"test\",\r\n" + 
		  		"\"template_trans_is_default_field\": \"\",\r\n" + 
		  		"\"app_token\":\":app_token\", \r\n" + 
		  		"\"product_key\":\":product_key\"\r\n" + 
		  		"}");
	  response =  postRequest("template/add-template-trans", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String addTemplateTrans_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"\"template_trans_template_uuid\":\"\"   ,          \r\n" + 
		  		"\"template_trans_field_uuid\": \"87400f68bbc84693a32d0d86982203a1\",\r\n" + 
		  		"\"template_trans_field_order\": 1;\r\n" + 
		  		"\"template_trans_field_alias\": \"test\",\r\n" + 
		  		"\"template_trans_is_default_field\": \"\",\r\n" + 
		  		"\"app_token\":\":app_token\", \r\n" + 
		  		"\"product_key\":\":product_key\"\r\n" + 
		  		"}");
	  
	  response =  postRequest("template/add-template-trans", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  /*public String gettingtemplateid()
	  {
			baseURI = ContentProperty.getURL();
			
			
			//request data (Json data)
			jsonparser("{\r\n" + 
					"   \"template_name\":\"TestTemplate123QA\"  ,          \r\n" + 
					"   \"template_code\": \"testtemplate123QA\",\r\n" + 
					"   \"content_type\": 1,\r\n" + 
					"   \"template_heading\": \"Test Template Form API\",\r\n" + 
					"   \"store_key\": \"\",\r\n" + 
					"   \"app_token\": \":app_token\",\r\n" + 
					"   \"product_key\": \":product_key\"\r\n" + 
					"}\r\n" + 
					"");
			
			response = postRequest("template/add", token);
			ResponseData = response.jsonPath();
			System.out.println("Templateid is "+ResponseData.get("data.template_uuid"));
			
			return ResponseData.get("data.template_uuid");
			
		}*/
	  
	  
}
