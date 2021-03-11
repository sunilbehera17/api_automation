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
import com.restassured.productPage.addCategory;
import com.restassured.productPage.playList;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class playList_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public playList playList = new playList();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public playList_Validation playListStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playList.playList_valid_Inputs());
		  hash_Set = InsertValue("status","message","playlist_uuid","playlist_name",
				  "permalink","playlist_category_uuid","playlist_created_date");
		  
		  
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
	public playList_Validation playListIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playList.playList_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public playList_Validation playListArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playList.playList_valid_Inputs());
		  hash_Set = InsertValue("playList","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public playList_Validation playListJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playList.playList_valid_Inputs());
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
	  public playList_Validation playListKeyPresent()
	  {
		 String APIResponse = playList.playList_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public playList_Validation playListStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(playList.playList_valid_Inputs());
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
	  
	  public playList_Validation ResponseTimeVerification()
	  {
		 long time = playList.playListResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public playList_Validation playListInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playList.playList_invalid_Inputs());
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
	  
	  public playList_Validation playListInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(playList.playList_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public playList_Validation playListInvalidKeyPresent()
	  {
		 String APIResponse = playList.playList_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public playList_Validation playListInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(playList.playList_invalid_Inputs());
		  hash_Set = InsertValue("playList","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public playList_Validation playListInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(playList.playList_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","Named parameter not bound : categoryParentUuid; nested exception is org.hibernate.QueryException: Named parameter not bound : categoryParentUuid" ,"FAILED");
			
			}
			return this;
	  }
	  
	 
}

