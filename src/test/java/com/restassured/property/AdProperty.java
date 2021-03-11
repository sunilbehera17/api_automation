package com.restassured.property;

public class AdProperty 
{
	private static String URL="https://apigateway-staging.allthingsott.com/";
	private static String email="adautomation@yopmail.com";
	private static String password="player@1234";
	private static String productkey="8E4F8A19B07D4F22927CD4CB54672D27";
	private static String producttoken="ads-server_access_token";
	
	public static String getProducttoken() {
		return producttoken;
	}
	public static void setProducttoken(String producttoken) {
		AdProperty.producttoken = producttoken;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProductkey() {
		return productkey;
	}
	public void setProductkey(String productkey) {
		this.productkey = productkey;
	}
	

}
