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
import com.restassured.productPage.campaignUpdatePage;
import com.restassured.productPage.getCampaignPage;
import com.restassured.utils.ExtentReportListner;


public class campaignUpdate_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public campaignUpdatePage campaignUpdatePage = new campaignUpdatePage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public campaignUpdate_Validation campaignUpdateStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.campaignUpdate_valid_Inputs());
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
	  public campaignUpdate_Validation campaignUpdateIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.campaignUpdate_valid_Inputs());
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
	  public campaignUpdate_Validation campaignUpdateKeyPresent()
	  {
		 String APIResponse = campaignUpdatePage.campaignUpdate_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public campaignUpdate_Validation campaignUpdateStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.campaignUpdate_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200",Property.campignUpdate,"SUCCESS");
			
			}
			return this;
	  }
	  
	  public campaignUpdate_Validation ResponseTimeVerification()
	  {
		 long time = campaignUpdatePage.CampaignUpdateResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
	  
	  public campaignUpdate_Validation AddFormInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.campaignUpdate_valid_Inputs());
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
	  
	  public campaignUpdate_Validation AddFormInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.campaignUpdate_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public campaignUpdate_Validation AdformInvalidKeyPresent()
	  {
		 String APIResponse = campaignUpdatePage.campaignUpdate_valid_Inputs();
		  hash_Set = InsertValue("status","message","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public campaignUpdate_Validation AdformInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(campaignUpdatePage.addform_invalid_Inputs());
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
