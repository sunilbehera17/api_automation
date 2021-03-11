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
import com.restassured.productPage.addFeatureSection;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addFeatureSection_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addFeatureSection addFeatureSection = new addFeatureSection();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addFeatureSection_Validation addFeatureSectionStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
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
	public addFeatureSection_Validation addFeatureSectionIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code","view_more","feature_section_type","feature_content_limit","feature_content_type");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	/*public addFeatureSection_Validation addFeatureSectionBooleanVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("has_allowed");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Boolean");
			
			}
			return this;
		
	  }*/
	  /*public addFeatureSection_Validation addFeatureSectionArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
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
	  public addFeatureSection_Validation addFeatureSectionJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
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
	  public addFeatureSection_Validation addFeatureSectionKeyPresent()
	  {
		 String APIResponse = addFeatureSection.addFeatureSection_valid_Inputs();
		  hash_Set = InsertValue("status","message","feature_content_limit","feature_section_type","view_more",
				  "app_token","code","feature_section_uuid","feature_section_name",
				  "created_date","feature_content_type","store_key");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addFeatureSection_Validation addFeatureSectionStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Feature section added successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addFeatureSection_Validation ResponseTimeVerification()
	  {
		 long time = addFeatureSection.addFeatureSectionResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addFeatureSection_Validation addFeatureSectionInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_invalid_Inputs());
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
	  
	  public addFeatureSection_Validation addFeatureSectionInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addFeatureSection_Validation addFeatureSectionInvalidKeyPresent()
	  {
		 String APIResponse = addFeatureSection.addFeatureSection_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addFeatureSection_Validation addFeatureSectionInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addFeatureSection_Validation addFeatureSectionInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addFeatureSection.addFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1318","At least one content uuid is required" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

