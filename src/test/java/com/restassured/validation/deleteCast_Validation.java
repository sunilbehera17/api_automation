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
import com.restassured.productPage.deleteCast;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deleteCast_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deleteCast deleteCast = new deleteCast();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deleteCast_Validation deleteCastStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_valid_Inputs());
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
	public deleteCast_Validation deleteCastIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deleteCast_Validation deleteCastArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteCast.updateCast_valid_Inputs());
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
	 /* public deleteCast_Validation deleteCastJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_valid_Inputs());
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
	  public deleteCast_Validation deleteCastKeyPresent()
	  {
		 String APIResponse = deleteCast.deleteCast_valid_Inputs();
		  hash_Set = InsertValue("status","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteCast_Validation deleteCastStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_valid_Inputs());
		  hash_Set = InsertValue("code","status","data");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Cast deleted successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deleteCast_Validation ResponseTimeVerification()
	  {
		 long time = deleteCast.deleteCastResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deleteCast_Validation deleteCastInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_invalid_Inputs());
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
	  
	  public deleteCast_Validation deleteCastInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deleteCast_Validation deleteCastInvalidKeyPresent()
	  {
		 String APIResponse = deleteCast.deleteCast_invalid_Inputs();
		  hash_Set = InsertValue("status","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteCast_Validation deleteCastInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public deleteCast_Validation deleteCastInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteCast.deleteCast_invalid_Inputs());
		  hash_Set = InsertValue("code","status","data");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","Cast does not exist" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

