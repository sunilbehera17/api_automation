/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 28-08-2020
 */
package com.restassured.assertion;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.relevantcodes.extentreports.LogStatus;

import com.restassured.utils.ExtentReportListner;

public class JsonExtract extends ExtentReportListner
{

	public String Key;
	/*
	 * This method is used for fetching the value defined in else statement
	 * Here we will be getting json obejcet and from the json object we will fetch the value of that key so argument will be jsonobject and string key as input
	 * */
	public  void parseKeyDatatype(JSONObject json,String key,String Datatype)
	{
		//System.out.println(json.has(key));
		//System.out.println(json.get(key));
		String datatype = json.get(key).getClass().getName();
		boolean status = datatype.contains(Datatype);
		//System.out.println(datatype);
		
		  if(status==true) 
		  { 
			  System.out.println("Continue..."); 
			  //test.log(LogStatus.PASS, "Datatype Matched");
			  
		  } else 
		  {
			  getTest().log(LogStatus.FAIL, key+" datatype found "+json.get(key).getClass().getName()+" instead of "+Datatype);
		  }
		 
		
	}
	
	public String parseKeyValue(JSONObject json,String key)
	{
		String keyvalue = json.get(key).toString();
		return keyvalue;
	}
	
	public void parseKey(JSONObject json,String key)
	{
		Iterator<String> itr = json.keySet().iterator();
		//System.out.println(itr.next() == key);
		System.out.println("Iterator value = "+itr.next());
		System.out.println("Input value = "+key);
		
		
	}
	
	/*
	 * json will our Response data as Json obejct 
	 * key will be the value we want to get or parse
	 * */
	public  void getKeyDatatype(JSONObject json,String key,String Datatype)
	{
		//Here we are check the json value has this particular key present or not
		boolean exists = json.has(key);
		// ? Miscellaneous Operator we used because we do not know which type value we will ket from key value
		//We are storing all value in this iterator keys.
		Iterator<?> keys;
		//This will be used as next value which will be stored in here 'nextkeys'.
		String nextkeys;
		
		/*
		 * This if statement will work only when the value will be json not string value. Not primary values.
		 * if the key is not exists we will do some
		 * else we will fetch the value
		 * For fetching the value we have created "parseObject" method above
		 * */
		if(!exists)
		{
			//Storing all the values in the Iterator (keys).
			keys=json.keys();
			//Here we are iterating all the keys in this loop
			while(keys.hasNext())
			{
				//storing each key in a string variable by casting into String.
				nextkeys=(String)keys.next();
				try {
					
					/*
					 *  Here we are checking if the key is Json object or not
					 *  'instanceof' operator used to check whether the object is jsonarray type or jsonobject type
					 */
					if(json.get(nextkeys) instanceof JSONObject)
					{
						//Here we will check the Value we have requested is present or not
						//If the value is not present then we will again call 'getKey' method to start again
						if(exists == false)
						{
							//Here we are passing the jsonobject from input json we are passing and the key is which we looking for
							getKeyDatatype(json.getJSONObject(nextkeys), key,Datatype);
						}
					}
					//Here we are checking Key is JsonArray or not
					else if(json.get(nextkeys) instanceof JSONArray)
					{
						//coverting to json array to iterate inside the array and fetch all elements inside the array
						JSONArray jsonarray = json.getJSONArray(nextkeys);
						//using the for loop we are iterating all elements inside the array
						for(int i=0;i<jsonarray.length();i++)
						{
							//getting the 1st element present in the array
							String jsonarraystring = jsonarray.get(i).toString();
							
							//THE STRING VALUE WE HAVE TO CHECK THAT IT IS JSON OBJECT OR NOT, If it is string then we can print otherwise validate as Jsonobject
							//Converting to Jsonobject and string as innerJson.
							JSONObject innerJson = new JSONObject(jsonarraystring);
							
							//Inside innerJosn, verify our rewuired key (key) is present or not
							//If it is not there we will again call 'getkey' method with our required key inside innerJson.
							if(exists==false)
							{
								getKeyDatatype(innerJson, key,Datatype);
							}
						}
					}
				} catch (Exception e) {
					
				}
			}
			
		}
		//This else stament will work for the primary keys present in response like code,status.
		else
		{
			parseKeyDatatype(json, key,Datatype);
		}
		
	}
	

	public  String getKeyValue(JSONObject json,String key)
	{
		
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextkeys;
		
		if(!exists)
		{
			
			keys=json.keys();
			while(keys.hasNext())
			{
				nextkeys=(String)keys.next();
				try {
					if(json.get(nextkeys) instanceof JSONObject)
					{
						if(exists == false)
						{
							getKeyValue(json.getJSONObject(nextkeys), key);
						}
					}
					else if(json.get(nextkeys) instanceof JSONArray)
					{
						JSONArray jsonarray = json.getJSONArray(nextkeys);
						for(int i=0;i<jsonarray.length();i++)
						{
							String jsonarraystring = jsonarray.get(i).toString();
							JSONObject innerJson = new JSONObject(jsonarraystring);
							if(exists==false)
							{
								getKeyValue(innerJson, key);
							}
						}
					}
				} catch (Exception e) {
					
				}
			}
			
		}
		else
		{
			parseKeyValue(json, key);
			Key = parseKeyValue(json, key);
		}
		
	
		return Key;
	}
	
	public  String getKey(JSONObject json,String key)
	{
		
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextkeys;
		
		if(!exists)
		{
			
			keys=json.keys();
			while(keys.hasNext())
			{
				nextkeys=(String)keys.next();
				try {
					if(json.get(nextkeys) instanceof JSONObject)
					{
						if(exists == false)
						{
							getKey(json.getJSONObject(nextkeys), key);
						}
					}
					else if(json.get(nextkeys) instanceof JSONArray)
					{
						JSONArray jsonarray = json.getJSONArray(nextkeys);
						for(int i=0;i<jsonarray.length();i++)
						{
							String jsonarraystring = jsonarray.get(i).toString();
							JSONObject innerJson = new JSONObject(jsonarraystring);
							if(exists==false)
							{
								getKey(innerJson, key);
							}
						}
					}
				} catch (Exception e) {
					
				}
			}
			
		}
		else
		{
			parseKey(json, key);
			
		}
		
	
		return Key;
	}

}
