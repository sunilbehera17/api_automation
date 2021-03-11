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
import com.restassured.productPage.featureSectionDetails;
import com.restassured.productPage.featureSectionDetails;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class featureSectionDetails_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public featureSectionDetails featureSectionDetails = new featureSectionDetails();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public featureSectionDetails_Validation featureSectionDetailsStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_valid_Inputs());
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
	public featureSectionDetails_Validation featureSectionDetailsIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public featureSectionDetails_Validation featureSectionDetailsArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.addform_valid_Inputs());
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
	  public featureSectionDetails_Validation featureSectionDetailsJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_valid_Inputs());
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
	  public featureSectionDetails_Validation featureSectionDetailsyKeyPresent()
	  {
		 String APIResponse = featureSectionDetails.featureSectionDetails_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public featureSectionDetails_Validation featureSectionDetailsStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_valid_Inputs());
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
	  
	  public featureSectionDetails_Validation ResponseTimeVerification()
	  {
		 long time = featureSectionDetails.featureSectionDetailsResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public featureSectionDetails_Validation featureSectionDetailsInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_invalid_Inputs());
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
	  
	  public featureSectionDetails_Validation featureSectionDetailsInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public featureSectionDetails_Validation featureSectionDetailsInvalidKeyPresent()
	  {
		 String APIResponse = featureSectionDetails.featureSectionDetails_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public featureSectionDetails_Validation featureSectionDetailsInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public featureSectionDetails_Validation featureSectionDetailsInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(featureSectionDetails.featureSectionDetails_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"Cast Bio cannot be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

