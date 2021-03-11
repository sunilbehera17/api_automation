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
import com.restassured.productPage.deleteContent;
import com.restassured.productPage.deleteContent;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deleteContent_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deleteContent deleteContent = new deleteContent();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deleteContent_Validation deleteContentStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_valid_Inputs());
		  hash_Set = InsertValue("status","data");
		  
		  
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
	public deleteContent_Validation deleteContentIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deleteContent_Validation deleteContentArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteContent.updateCast_valid_Inputs());
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
	 /* public deleteContent_Validation deleteContentJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_valid_Inputs());
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
	  public deleteContent_Validation deleteContentKeyPresent()
	  {
		 String APIResponse = deleteContent.deleteContent_valid_Inputs();
		  hash_Set = InsertValue("status","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteContent_Validation deleteContentStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Content deleted successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deleteContent_Validation ResponseTimeVerification()
	  {
		 long time = deleteContent.deleteContentResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deleteContent_Validation deleteContentInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_invalid_Inputs());
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
	  
	  public deleteContent_Validation deleteContentInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deleteContent_Validation deleteContentInvalidKeyPresent()
	  {
		 String APIResponse = deleteContent.deleteContent_invalid_Inputs();
		  hash_Set = InsertValue("message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  /*public deleteContent_Validation deleteContentInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_invalid_Inputs());
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
	  public deleteContent_Validation deleteContentInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteContent.deleteContent_invalid_Inputs());
		  hash_Set = InsertValue("code","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1302","Content UUID can't be blank.","");
			
			}
			return this;
	  }
	  
	 
}

