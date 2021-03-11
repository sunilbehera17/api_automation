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
import com.restassured.productPage.editPlaylist;
import com.restassured.productPage.editPlaylist;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class editPlaylist_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public editPlaylist editPlaylist = new editPlaylist();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public editPlaylist_Validation editPlaylistStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_valid_Inputs());
		  hash_Set = InsertValue("status","message","playlist_name","playlist_uuid");
		  
		  
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
	public editPlaylist_Validation editPlaylistIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_valid_Inputs());
		  hash_Set = InsertValue("code","account_type","playlist_size","playlist_type");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public editPlaylist_Validation editPlaylistArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_valid_Inputs());
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
	  public editPlaylist_Validation editPlaylistJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_valid_Inputs());
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
	  public editPlaylist_Validation editPlaylistKeyPresent()
	  {
		 String APIResponse = editPlaylist.editPlaylist_valid_Inputs();
		  hash_Set = InsertValue("status","message","playlist_name","account_type","playlist_size",
				  "code","playlist_uuid","playlist_type");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public editPlaylist_Validation editPlaylistStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Playlist updated successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public editPlaylist_Validation ResponseTimeVerification()
	  {
		 long time = editPlaylist.editPlaylistResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public editPlaylist_Validation editPlaylistInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_invalid_Inputs());
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
	  
	  public editPlaylist_Validation editPlaylistInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public editPlaylist_Validation editPlaylistInvalidKeyPresent()
	  {
		 String APIResponse = editPlaylist.editPlaylist_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public editPlaylist_Validation editPlaylistInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public editPlaylist_Validation editPlaylistInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(editPlaylist.editPlaylist_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"permalink cann't be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

