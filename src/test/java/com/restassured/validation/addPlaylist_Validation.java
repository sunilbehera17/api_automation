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
import com.restassured.productPage.addPlaylist;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addPlaylist_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addPlaylist addPlaylist = new addPlaylist();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addPlaylist_Validation addPlaylistStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_valid_Inputs());
		  hash_Set = InsertValue("status","message","app_token","playlist_uuid",
				  "playlist_name");
		  
		  
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
	public addPlaylist_Validation addPlaylistIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_valid_Inputs());
		  hash_Set = InsertValue("code","playlist_size","account_type","playlist_type");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	
	  /*public addPlaylist_Validation addPlaylistArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_valid_Inputs());
		  hash_Set = InsertValue("playlist");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  */
	  public addPlaylist_Validation addPlaylistJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_valid_Inputs());
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
	  public addPlaylist_Validation addPlaylistKeyPresent()
	  {
		 String APIResponse = addPlaylist.addPlaylist_valid_Inputs();
		  hash_Set = InsertValue("status","message","playlist_size","account_type","playlist_name",
				  "app_token","code","playlist_uuid","playlist_type","product_key");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addPlaylist_Validation addPlaylistStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Playlist added successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addPlaylist_Validation ResponseTimeVerification()
	  {
		 long time = addPlaylist.addPlaylistResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addPlaylist_Validation addPlaylistInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_invalid_Inputs());
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
	  
	  public addPlaylist_Validation addPlaylistInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addPlaylist_Validation addPlaylistInvalidKeyPresent()
	  {
		 String APIResponse = addPlaylist.addPlaylist_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addPlaylist_Validation addPlaylistInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addPlaylist_Validation addPlaylistInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addPlaylist.addPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"Playlist name cann't be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

