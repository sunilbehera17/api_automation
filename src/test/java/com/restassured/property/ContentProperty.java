package com.restassured.property;

public class ContentProperty 
{
	private static String URL="https://apigateway-staging.allthingsott.com/";
	private static String email="Muvi-Server-Test@yopmail.com";
	private static String password="shibanee@123";
	private static String productkey="B05C552148D643158A8AD703B26331CC";
	private static String producttoken="muvi-server_access_token";
	
	public static String getProducttoken() {
		return producttoken;
	}
	public static void setProducttoken(String producttoken) {
		ContentProperty.producttoken = producttoken;
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
