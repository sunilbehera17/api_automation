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
import com.restassured.productPage.searchAdd;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class searchAdd_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public searchAdd searchAdd = new searchAdd();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public searchAdd_Validation searchAddStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_valid_Inputs());
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
	public searchAdd_Validation searchAddIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public searchAdd_Validation searchAddArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(searchAdd.addform_valid_Inputs());
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
	  public searchAdd_Validation searchAddJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_valid_Inputs());
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
	  public searchAdd_Validation searchAddyKeyPresent()
	  {
		 String APIResponse = searchAdd.searchAdd_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "content_uuid","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public searchAdd_Validation searchAddStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Content CREATED Successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public searchAdd_Validation ResponseTimeVerification()
	  {
		 long time = searchAdd.searchAddResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public searchAdd_Validation searchAddInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_invalid_Inputs());
		  hash_Set = InsertValue("status","message","data");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	  
	  public searchAdd_Validation searchAddInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public searchAdd_Validation searchAddInvalidKeyPresent()
	  {
		 String APIResponse = searchAdd.searchAdd_invalid_Inputs();
		  hash_Set = InsertValue("status","message","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public searchAdd_Validation searchAddInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public searchAdd_Validation searchAddInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(searchAdd.searchAdd_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","Index name must not contain Capital letters!" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

