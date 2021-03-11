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
import com.restassured.productPage.editFeatureSection;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class editFeatureSection_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public editFeatureSection editFeatureSection = new editFeatureSection();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public editFeatureSection_Validation editFeatureSectionStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("status","message","app_token","feature_section_uuid",
				  "feature_section_name","created_date" ,"store_key");
		  
		  
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
	public editFeatureSection_Validation editFeatureSectionIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public editFeatureSection_Validation editFeatureSectionArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_valid_Inputs());
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
	  public editFeatureSection_Validation editFeatureSectionJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_valid_Inputs());
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
	  public editFeatureSection_Validation editFeatureSectionKeyPresent()
	  {
		 String APIResponse = editFeatureSection.editFeatureSection_valid_Inputs();
		  hash_Set = InsertValue("status","message","feature_content_limit","feature_section_type","view_more",
				  "app_token","code","feature_section_uuid","feature_section_name",
				  "created_date","updated_date","feature_content_type","store_key");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public editFeatureSection_Validation editFeatureSectionStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Feature section updated successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public editFeatureSection_Validation ResponseTimeVerification()
	  {
		 long time = editFeatureSection.editFeatureSectionResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public editFeatureSection_Validation editFeatureSectionInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_invalid_Inputs());
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
	  
	  public editFeatureSection_Validation editFeatureSectionInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public editFeatureSection_Validation editFeatureSectionInvalidKeyPresent()
	  {
		 String APIResponse = editFeatureSection.editFeatureSection_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public editFeatureSection_Validation editFeatureSectionInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public editFeatureSection_Validation editFeatureSectionInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(editFeatureSection.editFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1320","Feature section uuid can not be blank" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

