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
import com.restassured.productPage.deleteAsset;
import com.restassured.productPage.deleteAsset;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class deleteAsset_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public deleteAsset deleteAsset = new deleteAsset();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public deleteAsset_Validation deleteAssetStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_valid_Inputs());
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
	public deleteAsset_Validation deleteAssetIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public deleteAsset_Validation deleteAssetArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.updateCast_valid_Inputs());
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
	 /* public deleteAsset_Validation deleteAssetJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_valid_Inputs());
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
	  public deleteAsset_Validation deleteAssetKeyPresent()
	  {
		 String APIResponse = deleteAsset.deleteAsset_valid_Inputs();
		  hash_Set = InsertValue("status","data","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public deleteAsset_Validation deleteAssetStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Video has been deleted from s3 and asset library","SUCCESS");
			
			}
			return this;
	  }
	  
	  public deleteAsset_Validation ResponseTimeVerification()
	  {
		 long time = deleteAsset.deleteAssetResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public deleteAsset_Validation deleteAssetInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_invalid_Inputs());
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
	  
	  public deleteAsset_Validation deleteAssetInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public deleteAsset_Validation deleteAssetInvalidKeyPresent()
	  {
		 String APIResponse = deleteAsset.deleteAsset_invalid_Inputs();
		  hash_Set = InsertValue("message","status");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  /*public deleteAsset_Validation deleteAssetInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_invalid_Inputs());
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
	  public deleteAsset_Validation deleteAssetInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(deleteAsset.deleteAsset_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"404","No video found in the library with this videoUuid/Invalid input parameters","FAILURE");
			
			}
			return this;
	  }
	  
	 
}

