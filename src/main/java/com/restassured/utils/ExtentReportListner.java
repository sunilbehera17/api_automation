/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Sambit <sambit@muvi.com> 

apiautomationframework com.restassured.productTest 01-09-2020
 */
package com.restassured.utils;

import java.awt.event.ItemEvent;
import java.io.File;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportListner implements ITestListener
{
	
	protected static ExtentReports reports;
	private static ExtentTest test;

	private static String resultpath = getResultPath();
	
	public static void deleteDirectory(File directory) {
		if (directory.exists()) {
			File[] files = directory.listFiles();
			if (null != files) {
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i].getName());
					if (files[i].isDirectory()) {
						deleteDirectory(files[i]);
					} else {
						files[i].delete();
					}
				}
			}
		}
	}

	private static String getResultPath() {

		resultpath = "test";//new SimpleDateFormat("yyyy-MM-dd hh-mm.ss").format(new Date());
		if (!new File(resultpath).isDirectory()) {
			new File(resultpath);
		}
		return resultpath;
	}
	
	String ReportLocation = "test-output/Report/" + resultpath + "/";

	public void onTestStart(ITestResult result) {

		setTest(reports.startTest(result.getMethod().getMethodName()));
		getTest().log(LogStatus.INFO, result.getMethod().getMethodName());
		System.out.println(result.getTestClass().getTestName());
		System.out.println(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result) {
		getTest().log(LogStatus.PASS, "Test is pass");

	}

	public void onTestFailure(ITestResult result) {
		getTest().log(LogStatus.FAIL, "Test is fail");

	}

	public void onTestSkipped(ITestResult result) {
		getTest().log(LogStatus.SKIP, "Test is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println(ReportLocation + "  ReportLocation");
		reports = new ExtentReports(ReportLocation + "ExtentReport.html");
		setTest(reports.startTest(""));

	}

	public void onFinish(ITestContext context) {
		reports.endTest(getTest());
		reports.flush();

	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static ExtentTest getTest() {
		return test;
	}

	public static void setTest(ExtentTest test) {
		ExtentReportListner.test = test;
	}


}
