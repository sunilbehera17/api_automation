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
import com.restassured.productPage.saveAssetImage;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class saveAssetImage_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public saveAssetImage saveAssetImage = new saveAssetImage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public saveAssetImage_Validation saveAssetImageStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_valid_Inputs());
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
	public saveAssetImage_Validation saveAssetImageIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_valid_Inputs());
		  hash_Set = InsertValue("code","id");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public saveAssetImage_Validation saveAssetImageArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.addform_valid_Inputs());
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
	  public saveAssetImage_Validation saveAssetImageJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_valid_Inputs());
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
	  public saveAssetImage_Validation saveAssetImageyKeyPresent()
	  {
		 String APIResponse = saveAssetImage.saveAssetImage_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "file_uuid","file_name","file_type","file_size","duration",
				  "video_bitrate","audio_bitrate","bitRate","frame_rate","resolution",
				  "thumbnail_images","user_uuid","created_date","file_url","reference_uuid",
				  "encoding_status","is_embeded_url","media_url","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveAssetImage_Validation saveAssetImageStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","File uploaded successfully","SUCCESS");
			
			}
			return this;
	  }
	  
	  public saveAssetImage_Validation ResponseTimeVerification()
	  {
		 long time = saveAssetImage.saveAssetImageResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public saveAssetImage_Validation saveAssetImageInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_invalid_Inputs());
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
	  
	  public saveAssetImage_Validation saveAssetImageInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public saveAssetImage_Validation saveAssetImageInvalidKeyPresent()
	  {
		 String APIResponse = saveAssetImage.saveAssetImage_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public saveAssetImage_Validation saveAssetImageInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public saveAssetImage_Validation saveAssetImageInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(saveAssetImage.saveAssetImage_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"107","File uuid shouldn't be null or empty" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

