/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 25-08-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.given;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import com.restassured.assertion.API_assertion;
import com.restassured.property.Property;
import com.restassured.utils.ExtentReportListner;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonPage 
{
	public JSONObject job = new JSONObject();
	public Response response;
	public JsonPath ResponseData;
	public ExtentReportListner report = new ExtentReportListner();
	public API_assertion API_assertion = new API_assertion();
	public Property Property = new Property();

	
	/*
	 * This will parse the bodydata as JsonObeject
	 *Always put the body data in a string format
	*/
	public void jsonparser(String bodydata)
	{
		Object obj=JSONValue.parse(bodydata);  
		job = (JSONObject) obj; 
	}
	
	
	//this method use for post request 
	public Response postRequest(String APIName,String Token)
	{
		
		
		return given().
				header("Content-Type","application/json").
				header(new Header("Authorization", "Bearer "+Token)).
				contentType(ContentType.JSON).accept(ContentType.JSON).
				body(job.toJSONString()).
			when().
				post(APIName).
			then().contentType(ContentType.JSON).extract().response();
	}
	
	//this method use for put request 
	public Response putRequest(String APIName,String Token)
	{
		
		
		return given().
				header("Content-Type","application/json").
				header(new Header("Authorization", "Bearer "+Token)).
				contentType(ContentType.JSON).accept(ContentType.JSON).
				body(job.toJSONString()).
			when().
				put(APIName).
			then().contentType(ContentType.JSON).extract().response();
	}
	
	public Response deleteRequest(String APIName,String Token)
	{
		
		
		return given().
				header("Content-Type","application/json").
				header(new Header("Authorization", "Bearer "+Token)).
				contentType(ContentType.JSON).accept(ContentType.JSON).
				body(job.toJSONString()).
			when().
				delete(APIName).
			then().contentType(ContentType.JSON).extract().response();
	}
	
	
	public static Set InsertValue(String... args)
	{

		
		Set<String> hash_Set = new HashSet<String>();
		for (String arg : args) 
		{
			hash_Set.add(arg);
		}
		
		return hash_Set;
	   
	}
	
	 
	 /*
	  * author Sambit Ray
	  * This function will generate a random string
	  * */
	public String RandomString(int strengthOfString) 
	{
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < strengthOfString) 
        { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	/*
	  * author Sambit Ray
	  * This function will generate a random number
	  * */
	public String randomnumber()
	{
		String timeStamp = new SimpleDateFormat("YYYYMMddmmss").format(new Date());
		return timeStamp;
	}
	
	
	
	
	
	
	
}