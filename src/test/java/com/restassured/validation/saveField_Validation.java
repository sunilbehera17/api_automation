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
import com.restassured.productPage.saveField;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class saveField_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public saveField saveField = new saveField();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public saveField_Validation saveFieldStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "fieldUuid","fieldName","fieldAlias","createdDate",
				  "store_key","app_token","product_key");
		  
		  
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
	public saveField_Validation saveFieldIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_valid_Inputs());
		  hash_Set = InsertValue("code","id");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public saveField_Validation saveFieldArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveField.addform_valid_Inputs());
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
	  public saveField_Validation saveFieldJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_valid_Inputs());
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
	  public saveField_Validation saveFieldyKeyPresent()
	  {
		 String APIResponse = saveField.saveField_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "fieldIsdefault","fieldName","fieldAlias","fieldUuid","createdDate",
				  "fieldTypeId","id","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveField_Validation saveFieldStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Field Added Successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public saveField_Validation ResponseTimeVerification()
	  {
		 long time = saveField.saveFieldResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public saveField_Validation saveFieldInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_invalid_Inputs());
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
	  
	  public saveField_Validation saveFieldInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public saveField_Validation saveFieldInvalidKeyPresent()
	  {
		 String APIResponse = saveField.saveField_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveField_Validation saveFieldInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public saveField_Validation saveFieldInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveField.saveField_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","Field name should not be blank" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

