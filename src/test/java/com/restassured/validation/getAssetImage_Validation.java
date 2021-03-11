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
import com.restassured.productPage.getAssetImage;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class getAssetImage_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public getAssetImage getAssetImage = new getAssetImage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public getAssetImage_Validation getAssetImageStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "image_uuid","file_name","file_type","file_url");
		  
		  
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
	public getAssetImage_Validation getAssetImageIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public getAssetImage_Validation getAssetImageArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.addform_valid_Inputs());
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
	  public getAssetImage_Validation getAssetImageJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_valid_Inputs());
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
	  public getAssetImage_Validation getAssetImageKeyPresent()
	  {
		 String APIResponse = getAssetImage.getAssetImage_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "image_uuid","file_name","file_type","file_url","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAssetImage_Validation getAssetImageStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_valid_Inputs());
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
	  
	  public getAssetImage_Validation ResponseTimeVerification()
	  {
		 long time = getAssetImage.getAssetImageResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public getAssetImage_Validation getAssetImageInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_invalid_Inputs());
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
	  
	  public getAssetImage_Validation getAssetImageInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAssetImage_Validation getAssetImageInvalidKeyPresent()
	  {
		 String APIResponse = getAssetImage.getAssetImage_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAssetImage_Validation getAssetImageInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public getAssetImage_Validation getAssetImageInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAssetImage.getAssetImage_invalid_Inputs());
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

