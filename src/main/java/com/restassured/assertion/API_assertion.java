/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 01-09-2020
 */
package com.restassured.assertion;

import java.util.Iterator;
import java.util.Set;

import com.relevantcodes.extentreports.LogStatus;

import com.restassured.utils.ExtentReportListner;

public class API_assertion 
{
	
	public ExtentReportListner report = new ExtentReportListner();
	
	public void ResponseTimeVerification(long time)
	{
		if(time<=1000)
		 {
			report.getTest().log(LogStatus.PASS,"API response time is "+time+"MS");
		 }
		 else {
			 report.getTest().log(LogStatus.FAIL,"Response time was expected between 1000 MS but found "+time+" MS");
		 }
	}
	
	public void VerifyCodeStatus(String key,String keyvalue,String codevalue,String messagevalue,String statusvalue)
	{
		
		if(key=="code")
		{
			if(keyvalue.equals(codevalue))
			{
				report.getTest().log(LogStatus.PASS,key+" value is "+keyvalue);
			}
			else
			{
				report.getTest().log(LogStatus.FAIL,key+" value was expected "+codevalue+" but found "+keyvalue);
			}
			
		}
		else if(key=="status")
		{
			if(keyvalue.equals(statusvalue))
			{
				report.getTest().log(LogStatus.PASS,key+" value is "+keyvalue);
			}
			else
			{
				report.getTest().log(LogStatus.FAIL,key+" value was expected "+statusvalue+" but found "+keyvalue);
			}
		}
		else if(key=="message")
		{
			if(keyvalue.equals(messagevalue))
			{
				report.getTest().log(LogStatus.PASS,key+" value is "+keyvalue);
			}
			else
			{
				report.getTest().log(LogStatus.FAIL,key+" value was expected "+messagevalue+" but found "+keyvalue);
			}
		}
		
	}
	
	public void VerifyPresenceOfKey(Set hash_Set,String APIResponse)
	{
		  String key;
		  Iterator<String> itr = hash_Set.iterator();
			while(itr.hasNext())
			{
				key=itr.next();
				//System.out.println(x.contains(itr.next()));
				if(APIResponse.contains('"'+key+'"'))
				{
					continue;
				}
				else {
					
					report.getTest().log(LogStatus.FAIL, key+" key is not found in reponse");
				}
			
			}
	}

}
