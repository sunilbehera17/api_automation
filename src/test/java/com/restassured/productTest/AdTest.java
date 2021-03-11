/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 21-08-2020
 */

package com.restassured.productTest;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.restassured.validation.campaignAdd_Validation;
import com.restassured.validation.campaignUpdate_Validation;
import com.restassured.validation.getAd_Validation;
import com.restassured.validation.getAddForm_Validation;
import com.restassured.validation.getCampaign_Validation;
import com.restassured.validation.mediaAdd_Validation;
import com.restassured.validation.mediaUpdate_Validation;
import com.restassured.utils.ExtentReportListner;

import org.json.simple.parser.ParseException;

@Listeners(ExtentReportListner.class)
public class AdTest extends ExtentReportListner
{
	
	
	@Test
	public void AddFormValidResponse() throws ParseException
	{
		new getAddForm_Validation()
		.ResponseTimeVerification()
		.AddFormStringVerification()
		.AdformStatuscode()
		.AdformKeyPresent()
		.AddFormIntegerVerification()
		.AddFormArrayVerification()
		.AddFormJsonVerification();
	}
	
	
	@Test
	public void AddFormInValidToken() throws ParseException
	{
		new getAddForm_Validation()
		.InvalidTokenVerification();
	}
	
	@Test
	public void Addform_Without_Formname()
	{
		new getAddForm_Validation()
		.Without_Formname_Verification();
	}
	
	@Test
	public void Addform_InValidRequestMethod() throws ParseException
	{
		new getCampaign_Validation()
		.InvalidRequestMethodVerification();
	}
	
	@Test
	public void GetAdValidResponse() throws ParseException
	{
		new getAd_Validation()
		.getadStringVerification()
		.GetAdIntegerVerification()
		.GetAdArrayVerification()
		.GetAdJsonVerification()
		.GetAdKeyPresent()
		.GetAdStatuscode()
		.ResponseTimeVerification();
	}
	
	@Test
	public void getAd_InValidToken() throws ParseException
	{
		new getAd_Validation()
		.InvalidTokenVerification();
	}
	
	@Test
	public void getAd_InValidRequestMethod() throws ParseException
	{
		new getAd_Validation()
		.InvalidRequestMethodVerification();
	}
	
	@Test
	public void getCampaign_ValidResponse() throws ParseException
	{
		new getCampaign_Validation()
		.getCampaignStringVerification()
		.getCampaignIntegerVerification()
		.getCampaignArrayVerification()
		.getCampaignJsonVerification()
		.getCampaignKeyPresent()
		.getCampaignStatuscode()
		.ResponseTimeVerification();
	}
	
	@Test
	public void getCampaign_InValidToken() throws ParseException
	{
		new getCampaign_Validation()
		.InvalidTokenVerification();
	}
	
	@Test
	public void getCampaign_InValidRequestMethod() throws ParseException
	{
		new getCampaign_Validation()
		.InvalidRequestMethodVerification();
	}
	
	@Test
	public void campaignAdd_ValidResponse()
	{
		new campaignAdd_Validation()
		.campaignAddStringVerification()
		.campaignAddIntegerVerification()
		.campaignAddKeyPresent()
		.campaignAddStatuscode()
		.ResponseTimeVerification();
	}
	
	@Test
	public void campignUpdate_ValidResponse()
	{
		new campaignUpdate_Validation()
		.campaignUpdateStringVerification()
		.campaignUpdateIntegerVerification()
		.ResponseTimeVerification()
		.campaignUpdateKeyPresent()
		.campaignUpdateStatuscode();
	
	}
	
	@Test
	public void mediaAdd_ValidResponse()
	{
		new mediaAdd_Validation()
		.mediaAddStringVerification()
		.mediaAddIntegerVerification()
		.mediaAddKeyPresent()
		.mediaAddStatuscode()
		.ResponseTimeVerification();
	}
	
	@Test
	public void mediaUpdate_ValidResponse()
	{
		new mediaUpdate_Validation()
		.mediaUpdateStringVerification()
		.mediaUpdateIntegerVerification()
		.mediaUpdateKeyPresent()
		.mediaUpdateStatuscode()
		.ResponseTimeVerification();
	}
	

}

