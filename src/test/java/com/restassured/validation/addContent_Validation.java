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
import com.restassured.productPage.addContent;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addContent_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addContent addContent = new addContent();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addContent_Validation addContentStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
		  hash_Set = InsertValue("status","message","content_name","content_created_date",
				  "content_parent_uuid","content_mobileapp_poster_uuid","content_search_tag",
				  "content_template_uuid","content_permalink","content_accessibility",
				  "content_category_uuid","content_banner_uuid","content_uuid","content_trailer_uuid",
				  "content_mobileapp_banner_uuid","content_updated_by","content_desc","content_tvapp_poster_uuid",
				  "content_updated_date","content_app_poster_uuid","content_created_by","custom_attribute",
				  "content_asset_uuid","content_poster_uuid","content_tvapp_banner_uuid");
		  
		  
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
	public addContent_Validation addContentIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
		  hash_Set = InsertValue("code","is_parent","is_encoded","content_asset_type","serial_number","content_level");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	/*public addContent_Validation addContentBooleanVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
		  hash_Set = InsertValue("has_allowed");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Boolean");
			
			}
			return this;
		
	  }*/
	  /*public addContent_Validation addContentArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
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
	  public addContent_Validation addContentJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
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
	  public addContent_Validation addContentKeyPresent()
	  {
		 String APIResponse = addContent.addContent_valid_Inputs();
		  hash_Set = InsertValue("status","message","content_name","is_parent","content_created_date",
				  "content_parent_uuid","code","content_mobileapp_poster_uuid","content_search_tag",
				  "content_template_uuid","content_permalink","content_accessibility",
				  "content_category_uuid","content_banner_uuid","content_uuid","content_trailer_uuid",
				  "content_mobileapp_banner_uuid","content_updated_by","content_desc","content_tvapp_poster_uuid",
				  "content_updated_date","is_encoded","content_asset_type","content_app_poster_uuid",
				  "serial_number","content_level","content_created_by","custom_attribute",
				  "content_asset_uuid","content_poster_uuid","has_allowed","content_tvapp_banner_uuid");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addContent_Validation addContentStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Content Added Successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addContent_Validation ResponseTimeVerification()
	  {
		 long time = addContent.addContentResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addContent_Validation addContentInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_invalid_Inputs());
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
	  
	  public addContent_Validation addContentInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addContent_Validation addContentInvalidKeyPresent()
	  {
		 String APIResponse = addContent.addContent_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addContent_Validation addContentInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addContent_Validation addContentInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addContent.addContent_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"Content Name cannot be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

