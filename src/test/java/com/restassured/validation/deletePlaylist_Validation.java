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
import com.restassured.productPage.deletePlaylist;
import com.restassured.productPage.deletePlaylist;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deletePlaylist_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deletePlaylist deletePlaylist = new deletePlaylist();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deletePlaylist_Validation deletePlaylistStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_valid_Inputs());
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
	public deletePlaylist_Validation deletePlaylistIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deletePlaylist_Validation deletePlaylistArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.updateCast_valid_Inputs());
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
	 /* public deletePlaylist_Validation deletePlaylistJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_valid_Inputs());
		  hash_Set = InsertValue("data");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Object");
			
			}
			return this;
	  }*/
	 /* 
	  * This method validate the  Key is being passed is present in the response
		 * If any of the Keys passing in this method not found in response it will fail
		 * In this Function only pass the Key name in the 'hash_Set' and API function name in 'APIResponse' value.
		 *
		 */
	  public deletePlaylist_Validation deletePlaylistKeyPresent()
	  {
		 String APIResponse = deletePlaylist.deletePlaylist_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deletePlaylist_Validation deletePlaylistStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Playlist deleted successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deletePlaylist_Validation ResponseTimeVerification()
	  {
		 long time = deletePlaylist.deletePlaylistResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deletePlaylist_Validation deletePlaylistInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_invalid_Inputs());
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
	  
	  public deletePlaylist_Validation deletePlaylistInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deletePlaylist_Validation deletePlaylistInvalidKeyPresent()
	  {
		 String APIResponse = deletePlaylist.deletePlaylist_invalid_Inputs();
		  hash_Set = InsertValue("message","code","status");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  /*public deletePlaylist_Validation deletePlaylistInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  */
	  public deletePlaylist_Validation deletePlaylistInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deletePlaylist.deletePlaylist_invalid_Inputs());
		  hash_Set = InsertValue("code","message","status");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1327","Playlist uuid can not be blank","FAILURE");
			
			}
			return this;
	  }
	  
	 
}

