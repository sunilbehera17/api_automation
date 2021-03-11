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
import com.restassured.productPage.deleteFeatureSection;
import com.restassured.productPage.deleteFeatureSection;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deleteFeatureSection_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deleteFeatureSection deleteFeatureSection = new deleteFeatureSection();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deleteFeatureSection_Validation deleteFeatureSectionStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_valid_Inputs());
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
	public deleteFeatureSection_Validation deleteFeatureSectionIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deleteFeatureSection_Validation deleteFeatureSectionArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.updateCast_valid_Inputs());
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
	 /* public deleteFeatureSection_Validation deleteFeatureSectionJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_valid_Inputs());
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
	  public deleteFeatureSection_Validation deleteFeatureSectionKeyPresent()
	  {
		 String APIResponse = deleteFeatureSection.deleteFeatureSection_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteFeatureSection_Validation deleteFeatureSectionStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Feature section deleted successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deleteFeatureSection_Validation ResponseTimeVerification()
	  {
		 long time = deleteFeatureSection.deleteFeatureSectionResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deleteFeatureSection_Validation deleteFeatureSectionInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_invalid_Inputs());
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
	  
	  public deleteFeatureSection_Validation deleteFeatureSectionInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deleteFeatureSection_Validation deleteFeatureSectionInvalidKeyPresent()
	  {
		 String APIResponse = deleteFeatureSection.deleteFeatureSection_invalid_Inputs();
		  hash_Set = InsertValue("message","code","status");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  /*public deleteFeatureSection_Validation deleteFeatureSectionInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_invalid_Inputs());
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
	  public deleteFeatureSection_Validation deleteFeatureSectionInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteFeatureSection.deleteFeatureSection_invalid_Inputs());
		  hash_Set = InsertValue("code","message","status");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1323","Feature section Not deleted successfully","FAILURE");
			
			}
			return this;
	  }
	  
	 
}

