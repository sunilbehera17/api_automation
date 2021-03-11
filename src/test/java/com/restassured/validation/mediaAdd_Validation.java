/*


 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 28-08-2020
 */
package com.restassured.validation;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.CommonPage;
import com.restassured.productPage.campaignAddPage;
import com.restassured.productPage.getCampaignPage;
import com.restassured.productPage.mediaAddPage;
import com.restassured.property.Property;
import com.restassured.utils.ExtentReportListner;


public class mediaAdd_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public mediaAddPage mediaAddPage = new mediaAddPage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public mediaAdd_Validation mediaAddStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.mediaAdd_valid_Inputs());
		  hash_Set = InsertValue("status","message");
		  
		  
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
	  public mediaAdd_Validation mediaAddIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.mediaAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	 
	  /*
		 * This method validate the  Key is being passed is present in the response
		 * If any of the Keys passing in this method not found in response it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in 'APIResponse' value.
		 * */
	  public mediaAdd_Validation mediaAddKeyPresent()
	  {
		 String APIResponse = mediaAddPage.mediaAdd_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public mediaAdd_Validation mediaAddStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.mediaAdd_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200",Property.mediaAdd,"SUCCESS");
			
			}
			return this;
	  }
	  
	  public mediaAdd_Validation ResponseTimeVerification()
	  {
		 long time = mediaAddPage.CampaignAddResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
	  
	  public mediaAdd_Validation AddFormInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.mediaAdd_valid_Inputs());
		  hash_Set = InsertValue("status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  public mediaAdd_Validation AddFormInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.mediaAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public mediaAdd_Validation AdformInvalidKeyPresent()
	  {
		 String APIResponse = mediaAddPage.mediaAdd_valid_Inputs();
		  hash_Set = InsertValue("status","message","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public mediaAdd_Validation AdformInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(mediaAddPage.addform_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1010","Wrong form name given","FAILURE");
			
			}
			return this;
	  }
	  
	
}
