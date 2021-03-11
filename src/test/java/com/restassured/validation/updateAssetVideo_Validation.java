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
import com.restassured.productPage.updateAssetVideo;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class updateAssetVideo_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public updateAssetVideo updateAssetVideo = new updateAssetVideo();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public updateAssetVideo_Validation updateAssetVideoStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_valid_Inputs());
		  hash_Set = InsertValue("status","message","app_token","product_key");
		  
		  
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
	public updateAssetVideo_Validation updateAssetVideoIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_valid_Inputs());
		  hash_Set = InsertValue("code","id");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public updateAssetVideo_Validation updateAssetVideoArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.addform_valid_Inputs());
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
	  public updateAssetVideo_Validation updateAssetVideoJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_valid_Inputs());
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
	  public updateAssetVideo_Validation updateAssetVideoyKeyPresent()
	  {
		 String APIResponse = updateAssetVideo.updateAssetVideo_valid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public updateAssetVideo_Validation updateAssetVideoStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Video encoded and updated successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public updateAssetVideo_Validation ResponseTimeVerification()
	  {
		 long time = updateAssetVideo.updateAssetVideoResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public updateAssetVideo_Validation updateAssetVideoInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_invalid_Inputs());
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
	  
	  public updateAssetVideo_Validation updateAssetVideoInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public updateAssetVideo_Validation updateAssetVideoInvalidKeyPresent()
	  {
		 String APIResponse = updateAssetVideo.updateAssetVideo_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public updateAssetVideo_Validation updateAssetVideoInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public updateAssetVideo_Validation updateAssetVideoInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(updateAssetVideo.updateAssetVideo_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"107","Please provide a proper value for input parameter fileType" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

