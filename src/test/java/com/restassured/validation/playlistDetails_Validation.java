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
import com.restassured.productPage.playlistDetails;
import com.restassured.productPage.playlistDetails;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class playlistDetails_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public playlistDetails playlistDetails = new playlistDetails();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public playlistDetails_Validation playlistDetailsStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_valid_Inputs());
		  hash_Set = InsertValue("status","message","playlist_uuid","playlist_name",
				  "permalink","playlist_category_uuid");
		  
		  
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
	public playlistDetails_Validation playlistDetailsIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public playlistDetails_Validation playlistDetailsArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_valid_Inputs());
		  hash_Set = InsertValue("playlistDetails","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public playlistDetails_Validation playlistDetailsJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_valid_Inputs());
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
	  public playlistDetails_Validation playlistDetailsKeyPresent()
	  {
		 String APIResponse = playlistDetails.playlistDetails_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public playlistDetails_Validation playlistDetailsStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Fetched Successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public playlistDetails_Validation ResponseTimeVerification()
	  {
		 long time = playlistDetails.playlistDetailsResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public playlistDetails_Validation playlistDetailsInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_invalid_Inputs());
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
	  
	  public playlistDetails_Validation playlistDetailsInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public playlistDetails_Validation playlistDetailsInvalidKeyPresent()
	  {
		 String APIResponse = playlistDetails.playlistDetails_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public playlistDetails_Validation playlistDetailsInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_invalid_Inputs());
		  hash_Set = InsertValue("playlistDetails","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public playlistDetails_Validation playlistDetailsInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(playlistDetails.playlistDetails_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1317","No data associated with respective product key and app token","FAILED");
			
			}
			return this;
	  }
	  
	 
}

