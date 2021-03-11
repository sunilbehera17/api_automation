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
import com.restassured.productPage.addTemplate;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addTemplate_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addTemplate addTemplate = new addTemplate();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addTemplate_Validation addTemplateStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "template_name","template_heading","template_uuid",
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
	public addTemplate_Validation addTemplateIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_valid_Inputs());
		  hash_Set = InsertValue("code","id");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  /*public addTemplate_Validation addTemplateArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addform_valid_Inputs());
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
	  public addTemplate_Validation addTemplateJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_valid_Inputs());
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
	  public addTemplate_Validation addTemplateyKeyPresent()
	  {
		 String APIResponse = addTemplate.addTemplate_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "content_type","template_name","template_heading","template_uuid",
				  "template_code","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addTemplate_Validation addTemplateStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Template Added Successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addTemplate_Validation ResponseTimeVerification()
	  {
		 long time = addTemplate.addTemplateResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  

	  public addTemplate_Validation addTemplateInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_invalid_Inputs());
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
	  
	  public addTemplate_Validation addTemplateInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addTemplate_Validation addTemplateInvalidKeyPresent()
	  {
		 String APIResponse = addTemplate.addTemplate_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addTemplate_Validation addTemplateInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addTemplate_Validation addTemplateInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addTemplate.addTemplate_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"1301","Template code is required" ,"FAILURE");
			
			}
			return this;
	  }
	  
	 
}

