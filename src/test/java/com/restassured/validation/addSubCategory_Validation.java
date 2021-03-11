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
import com.restassured.productPage.addCategory;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class addSubCategory_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public addCategory addCategory = new addCategory();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public addSubCategory_Validation addSubCategoryStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "category_uuid","category_name","category_image_uuid",
				  "category_parent_uuid","category_permalink","created_date",
				  "created_by","updated_date","updated_by","store_key","app_token","product_key",
				  "user_uuid","created_ip","updated_ip","sub_category","category_image_details");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
				//JE.getKey(inputJSONObject, itr.next());
			
			}	
		return this;
	  }
	 
	  public addSubCategory_Validation addSubCategoryIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_valid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  /*public addSubCategory_Validation addSubCategoryArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_valid_Inputs());
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
	  
	  public addSubCategory_Validation addSubCategoryJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_valid_Inputs());
		  hash_Set = InsertValue("data");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Object");
			
			}
			return this;
	  }

	  public addSubCategory_Validation addSubCategoryKeyPresent()
	  {
		 String APIResponse = addCategory.addSubCategory_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "category_uuid","category_name","category_image_uuid",
				  "category_parent_uuid","category_permalink","created_date",
				  "created_by","updated_date","updated_by","store_key","app_token","product_key",
				  "user_uuid","created_ip","updated_ip","sub_category","category_image_details","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addSubCategory_Validation addSubCategoryStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Subcategory added successfully.","SUCCESS");
			
			}
			return this;
	  }
	  
	  public addSubCategory_Validation ResponseTimeVerification()
	  {
		 long time = addCategory.addSubCategoryResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 //ResponseTimeVerification(time);
		  return this;
	  }


	  public addSubCategory_Validation addSubCategoryInvalidStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_invalid_Inputs());
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
	  
	  public addSubCategory_Validation addSubCategoryInvalidIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_invalid_Inputs());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public addSubCategory_Validation addSubCategoryInvalidKeyPresent()
	  {
		 String APIResponse = addCategory.addSubCategory_invalid_Inputs();
		  hash_Set = InsertValue("status","message","code");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public addSubCategory_Validation addSubCategoryInvalidArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_invalid_Inputs());
		  hash_Set = InsertValue("message");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public addSubCategory_Validation addSubCategoryInvalidStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(addCategory.addSubCategory_invalid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"400","[\"category name can not be blank\"]" ,"FAILURE");
			
			}
			return this;
	  }
	  






}
