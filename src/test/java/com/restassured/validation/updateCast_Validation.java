/*


 * Copyright 2020 www.muvi.com

 */
/**

 * @author Shibanee <Shibanee@muvi.com> 

apiautomationframework com.restassured.productTest 14-09-2020
 */
package com.restassured.validation;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;


import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.addCast;
import com.restassured.productPage.updateCast;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class updateCast_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public updateCast updateCast = new updateCast();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public updateCast_Validation updateCastStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "cast_uuid","cast_name","cast_bio","created_date","updated_date",
				  "store_key","app_token","product_key");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	 
	  /*
		 * This method validate the Datatype of the Key is being passed is Integer or not
		 * If any of the Keys passing in this method found other than String it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
		 * */
	public updateCast_Validation updateCastIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public updateCast_Validation updateCastArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("templateList","template_trans","field_trans");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  */
	  public updateCast_Validation updateCastJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("data");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Object");
			
			}
			return this;
	  }
	 /* 
	  * This method validate the  Key is being passed is present in the response
		 * If any of the Keys passing in this method not found in response it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in 'APIResponse' value.
		 *
		 */
	  public updateCast_Validation updateCastKeyPresent()
	  {
		 String APIResponse = updateCast.updateCast_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "cast_uuid","cast_name","cast_bio","created_date","updated_date",
				  "store_key","app_token","product_key","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public updateCast_Validation updateCastStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Cast updated successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public updateCast_Validation ResponseTimeVerification()
	  {
		 long time = updateCast.updateCastResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public updateCast_Validation updateCastInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_invalid_Inputs());
		  hash_Set = InsertValue("status");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  public updateCast_Validation updateCastInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public updateCast_Validation updateCastInvalidKeyPresent()
	  {
		 String APIResponse = updateCast.updateCast_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public updateCast_Validation updateCastInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public updateCast_Validation updateCastInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateCast.updateCast_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","Cast Not Found" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

