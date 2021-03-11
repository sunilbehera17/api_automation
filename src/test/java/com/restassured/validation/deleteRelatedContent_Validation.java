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
import com.restassured.productPage.deleteRelatedContent;
import com.restassured.productPage.deleteRelatedContent;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deleteRelatedContent_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deleteRelatedContent deleteRelatedContent = new deleteRelatedContent();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deleteRelatedContent_Validation deleteRelatedContentStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_valid_Inputs());
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
	public deleteRelatedContent_Validation deleteRelatedContentIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deleteRelatedContent_Validation deleteRelatedContentArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.updateCast_valid_Inputs());
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
	 /* public deleteRelatedContent_Validation deleteRelatedContentJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_valid_Inputs());
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
	  public deleteRelatedContent_Validation deleteRelatedContentKeyPresent()
	  {
		 String APIResponse = deleteRelatedContent.deleteRelatedContent_valid_Inputs();
		  hash_Set = InsertValue("status","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteRelatedContent_Validation deleteRelatedContentStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code","status","data");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Related content deleted successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deleteRelatedContent_Validation ResponseTimeVerification()
	  {
		 long time = deleteRelatedContent.deleteRelatedContentResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deleteRelatedContent_Validation deleteRelatedContentInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_invalid_Inputs());
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
	  
	  public deleteRelatedContent_Validation deleteRelatedContentInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deleteRelatedContent_Validation deleteRelatedContentInvalidKeyPresent()
	  {
		 String APIResponse = deleteRelatedContent.deleteRelatedContent_invalid_Inputs();
		  hash_Set = InsertValue("data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  /*public deleteRelatedContent_Validation deleteRelatedContentInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_invalid_Inputs());
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
	  public deleteRelatedContent_Validation deleteRelatedContentInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteRelatedContent.deleteRelatedContent_invalid_Inputs());
		  hash_Set = InsertValue("code","data","status");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"404","Related content does not exists","Not Found");
			
			}
			return this;
	  }
	  
	 
}

