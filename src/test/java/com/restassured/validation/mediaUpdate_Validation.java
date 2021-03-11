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
import com.restassured.productPage.mediaUpdatePage;
import com.restassured.property.Property;
import com.restassured.utils.ExtentReportListner;


public class mediaUpdate_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public mediaUpdatePage mediaUpdatePage = new mediaUpdatePage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public mediaUpdate_Validation mediaUpdateStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.mediaUpdate_valid_Inputs());
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
	  public mediaUpdate_Validation mediaUpdateIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.mediaUpdate_valid_Inputs());
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
	  public mediaUpdate_Validation mediaUpdateKeyPresent()
	  {
		 String APIResponse = mediaUpdatePage.mediaUpdate_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public mediaUpdate_Validation mediaUpdateStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.mediaUpdate_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200",Property.mediaUpdate,"SUCCESS");
			
			}
			return this;
	  }
	  
	  public mediaUpdate_Validation ResponseTimeVerification()
	  {
		 long time = mediaUpdatePage.mediaUpdateResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
	  
	  public mediaUpdate_Validation AddFormInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.mediaUpdate_valid_Inputs());
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
	  
	  public mediaUpdate_Validation AddFormInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.mediaUpdate_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public mediaUpdate_Validation AdformInvalidKeyPresent()
	  {
		 String APIResponse = mediaUpdatePage.mediaUpdate_valid_Inputs();
		  hash_Set = InsertValue("status","message","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public mediaUpdate_Validation AdformInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(mediaUpdatePage.addform_invalid_Inputs());
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
