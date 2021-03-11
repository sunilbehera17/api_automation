/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 25-08-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.baseURI;

import com.restassured.property.AdProperty;
import com.restassured.property.ContentProperty;
import io.restassured.response.Response;

public class CommonAPIs extends CommonPage
{
	
	
	public Response response; 
	public ContentProperty ContentProperty = new ContentProperty();
	public AdProperty AdProperty = new AdProperty();
	
	
	
	public String loginAPI(String email,String password,String ProductKey,String ProductToken)
	{
		baseURI = ContentProperty.getURL();
		
		
		//request data (Json data)
		jsonparser("{\"username\":\""+email+"\",\n" + 
			    "\"password\":\""+password+"\",\n" + 
			"\"product_key\":\""+ProductKey+"\"}");
		
		response = postRequest("user-login",null);
		ResponseData = response.jsonPath();
		System.out.println("Response token "+ResponseData.get("response."+ProductToken));
		
		return ResponseData.get("response."+ProductToken);
		
	}
	
	
	
	

}
