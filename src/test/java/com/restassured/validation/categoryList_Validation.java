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
import com.restassured.productPage.categoryList;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class categoryList_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public categoryList categoryList = new categoryList();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public categoryList_Validation categoryListStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_valid_Inputs());
		  hash_Set = InsertValue("status","message","category_uuid","category_name","category_parent_uuid",
				  "category_permalink","category_image_uuid","created_date");
		  
		  
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
	public categoryList_Validation categoryListIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public categoryList_Validation categoryListArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_valid_Inputs());
		  hash_Set = InsertValue("categoryList","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public categoryList_Validation categoryListJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_valid_Inputs());
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
	  public categoryList_Validation categoryListKeyPresent()
	  {
		 String APIResponse = categoryList.categoryList_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public categoryList_Validation categoryListStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_valid_Inputs());
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
	  
	  public categoryList_Validation ResponseTimeVerification()
	  {
		 long time = categoryList.categoryListResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public categoryList_Validation categoryListInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_invalid_Inputs());
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
	  
	  public categoryList_Validation categoryListInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public categoryList_Validation categoryListInvalidKeyPresent()
	  {
		 String APIResponse = categoryList.categoryList_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public categoryList_Validation categoryListInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_invalid_Inputs());
		  hash_Set = InsertValue("categoryList","sub_category");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public categoryList_Validation categoryListInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(categoryList.categoryList_invalid_Inputs());
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

