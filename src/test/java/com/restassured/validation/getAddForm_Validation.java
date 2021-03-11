/*


 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 28-08-2020
 */
package com.restassured.validation;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import com.relevantcodes.extentreports.LogStatus;
import com.restassured.assertion.JsonExtract;
import com.restassured.productPage.getAddFormPage;
import com.restassured.productPage.CommonPage;

import com.restassured.utils.ExtentReportListner;


public class getAddForm_Validation extends CommonPage
{

	public ExtentReportListner report = new ExtentReportListner();
	public  Set<String> hash_Set;
	public getAddFormPage getAddFormPage = new getAddFormPage();
	public JsonExtract JE = new JsonExtract();
	
	
	/*
	 * This method validate the Datatype of the Key is being passed is String or not
	 * If any of the Keys passing in this method found other than String it will fail
	 * In this Function only pass the Key name in the 'hash_Set' and API function name in JSONObject argument.
	 * */
	  public getAddForm_Validation AddFormStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.addform_valid_Inputs());
		  hash_Set = InsertValue("status","message",
				  "template_uuid","template_name","field_uuid",
				  "field_name","field_alias","field_trans_uuid",
				  "field_trans_option","field_type_name");
		  
		  
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
	  public getAddForm_Validation AddFormIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.addform_valid_Inputs());
		  hash_Set = InsertValue("code","field_isdefault");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAddForm_Validation AddFormArrayVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.addform_valid_Inputs());
		  hash_Set = InsertValue("templateList","template_trans","field_trans");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Array");
			
			}
			return this;
	  }
	  
	  public getAddForm_Validation AddFormJsonVerification()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.addform_valid_Inputs());
		  hash_Set = InsertValue("data","fields","field_type");
		  
		  
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
		 * */
	  public getAddForm_Validation AdformKeyPresent()
	  {
		 String APIResponse = getAddFormPage.addform_valid_Inputs();
		  hash_Set = InsertValue("status","message",
				  "template_uuid","template_name","field_uuid",
				  "field_name","field_alias","field_trans_uuid",
				  "field_trans_option","field_type_name",
				  "data","fields","field_type","templateList","template_trans","field_trans",
				  "code","field_isdefault");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAddForm_Validation AdformStatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.addform_valid_Inputs());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,"200","Success","SUCCESS");
			
			}
			return this;
	  }
	  
	  public getAddForm_Validation ResponseTimeVerification()
	  {
		 long time = getAddFormPage.addformResponseTime();
		 API_assertion.ResponseTimeVerification(time);
		 
		 //ResponseTimeVerification(time);
		  return this;
	  }
	  
//_____---------_______----------___________--------_________-----WIth invalid request method-------_______----------__________------_________-----
	  
	  public getAddForm_Validation InvalidRequestMethodVerification()
	  {
		  
		  try {
			JSONObject inputJSONObject = new JSONObject(getAddFormPage.InvalidRequestMethod());
			  report.getTest().log(LogStatus.FAIL,"Invalid Request Method ");
			  hash_Set = InsertValue("status","message");
			  
			  Iterator<String> itr = hash_Set.iterator();
				while(itr.hasNext())
				{
					//System.out.println(itr.next());
					JE.getKeyDatatype(inputJSONObject,itr.next(),"String");
					//JE.getKey(inputJSONObject, itr.next());
				
				}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return this;
	  }
	 
//_____---------_______----------___________--------_________-----WIth invalid request method-------_______----------__________------_________-----  
	
	
//_____---------_______----------___________--------_________-----WIth invalid token method-------_______----------__________------_________-----

	  public getAddForm_Validation InvalidTokenStringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.invalid_token());
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
	  
	  public getAddForm_Validation InvalidTokenIntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.invalid_token());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAddForm_Validation InvalidTokenKeyPresent()
	  {
		 String APIResponse = getAddFormPage.invalid_token();
		  hash_Set = InsertValue("status","message",
				  "code","response");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAddForm_Validation InvalidTokenstatuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.invalid_token());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,Property.invalidTokenCode,Property.invalidTokenMessage,Property.invalid_Statue);
			
			}
			return this;
	  }
	  
	  public getAddForm_Validation InvalidTokenVerification()
	  {
		  InvalidTokenIntegerVerification()
		  .InvalidTokenStringVerification()
		  .InvalidTokenKeyPresent()
		  .InvalidTokenstatuscode();
		  return this;
	  }
	  
	  
//_____---------_______----------___________--------_________-----WIth invalid token method-------_______----------__________------_________-----

	  
//_____---------_______----------___________--------_________-----WIthout form name-------_______----------__________------_________-----


	  public getAddForm_Validation Without_Formname_StringVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.Without_FormName());
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
	  
	  public getAddForm_Validation Without_Formname_IntegerVerification()
	  {
		  
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.Without_FormName());
		  hash_Set = InsertValue("code");
		  
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				//System.out.println(itr.next());
				JE.getKeyDatatype(inputJSONObject,itr.next(),"Integer");
			
			}
			return this;
		
	  }
	  
	  public getAddForm_Validation Without_Formname_KeyPresent()
	  {
		 String APIResponse = getAddFormPage.Without_FormName();
		  hash_Set = InsertValue("status","message",
				  "code","data");
		  API_assertion.VerifyPresenceOfKey(hash_Set, APIResponse);
		  return this;
	 
	  }
	  
	  public getAddForm_Validation Without_Formname_statuscode()
	  {
		  JSONObject inputJSONObject = new JSONObject(getAddFormPage.Without_FormName());
		  hash_Set = InsertValue("code","status","message");
		  
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				
				String key = itr.next();
				String keyvalue = JE.getKeyValue(inputJSONObject,key);
				API_assertion.VerifyCodeStatus(key, keyvalue,Property.WithouFormName_Code,Property.WithouFormName_Message,Property.invalid_Statue);
			
			}
			return this;
	  }
	  
	  public getAddForm_Validation Without_Formname_Verification()
	  {
		  Without_Formname_StringVerification()
		  .Without_Formname_IntegerVerification()
		  .Without_Formname_KeyPresent()
		  .Without_Formname_statuscode();
		  return this;
	  }
	  
	  
//_____---------_______----------___________--------_________-----WIthout form name-------_______----------__________------_________-----
	  

}
