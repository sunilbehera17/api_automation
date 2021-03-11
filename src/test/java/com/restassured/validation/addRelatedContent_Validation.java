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
import com.restassured.productPage.addRelatedContent;
import com.restassured.productPage.addRelatedContent;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addRelatedContent_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addRelatedContent addRelatedContent = new addRelatedContent();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addRelatedContent_Validation addRelatedContentStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "content_uuid","bundle_uuid","created_date",
				  "parent_uuid","app_token","product_key");
		  
		  
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
	public addRelatedContent_Validation addRelatedContentIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addRelatedContent_Validation addRelatedContentArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("data");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addRelatedContent_Validation addRelatedContentJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("");
		  
		  
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
	  public addRelatedContent_Validation addRelatedContentyKeyPresent()
	  {
		 String APIResponse = addRelatedContent.addRelatedContent_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "content_uuid","bundle_uuid","created_date",
				  "parent_uuid","app_token","product_key");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addRelatedContent_Validation addRelatedContentStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Related content added successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addRelatedContent_Validation ResponseTimeVerification()
	  {
		 long time = addRelatedContent.addRelatedContentResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addRelatedContent_Validation addRelatedContentInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_invalid_Inputs());
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
	  
	  public addRelatedContent_Validation addRelatedContentInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addRelatedContent_Validation addRelatedContentInvalidKeyPresent()
	  {
		 String APIResponse = addRelatedContent.addRelatedContent_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addRelatedContent_Validation addRelatedContentInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addRelatedContent_Validation addRelatedContentInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addRelatedContent.addRelatedContent_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"content uuid cannot be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

