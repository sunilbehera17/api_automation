/*

 * Copyright 2020 www.muvi.com

 */
/**

 * @author Shibanee <shibanee@muvi.com> 

apiautomationframework com.restassured.productTest 14-09-2020
 */

package com.restassured.productPage;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.json.JSONTokener;

import com.restassured.property.ContentProperty;;

public class updateAssetVideo extends CommonPage
{
	
	public String URL = "https://apigateway-staging.allthingsott.com/";
	//
	public CommonAPIs commonapis = new CommonAPIs();
	public ContentProperty ContentProperty = new ContentProperty();
	public String token = commonapis.loginAPI(ContentProperty.getEmail(),ContentProperty.getPassword(),ContentProperty.getProductkey(),ContentProperty.getProducttoken());
	
	
	  public String updateAssetVideo_valid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"tujhe_kitna_chahne_lage_hum_whatsapp_status___kabir_singh_tujhe_kitna_chahne_lage_hum_status-1611065908087.mov\",\r\n" + 
		  		"    \"content_type\": \"video/mp4\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"EA765D172A3847CF958C66105B926AA0\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/vl/6CDE39FA45FC4DBB86B3F6CD8E1CA333/tujhe_kitna_chahne_lage_hum_whatsapp_status___kabir_singh_tujhe_kitna_chahne_lage_hum_status-1611065908087.mov\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"video\",\r\n" + 
		  		"    \"is_encode_required\": \"0\",\r\n" + 
		  		"    \"user_uuid\": \":me\",\r\n" + 
		  		"    \"store_key\": \":store_key\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"}");
	  
	  response =  putRequest("asset/update", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  }
	  
	  public long updateAssetVideoResponseTime()
	  {

		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"tujhe_kitna_chahne_lage_hum_whatsapp_status___kabir_singh_tujhe_kitna_chahne_lage_hum_status-1611065908087.mov\",\r\n" + 
		  		"    \"content_type\": \"video/mp4\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"EA765D172A3847CF958C66105B926AA0\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/7XnYlMxTDczs9TdRnYpgiiUK4WALEHWj/B05C552148D643158A8AD703B26331CC/vl/6CDE39FA45FC4DBB86B3F6CD8E1CA333/tujhe_kitna_chahne_lage_hum_whatsapp_status___kabir_singh_tujhe_kitna_chahne_lage_hum_status-1611065908087.mov\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"video\",\r\n" + 
		  		"    \"is_encode_required\": \"0\",\r\n" + 
		  		"    \"user_uuid\": \":me\",\r\n" + 
		  		"    \"store_key\": \":store_key\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \"B05C552148D643158A8AD703B26331CC\"\r\n" + 
		  		"}");
	  response =  putRequest("asset/update", token);
	  long responsetime = response.getTimeIn(TimeUnit.MILLISECONDS);
	  return responsetime; 
	  
	  }
	 
	  public String updateAssetVideo_invalid_Inputs() 
	  { 
		  baseURI = ContentProperty.getURL();
	  
	  //request data (Json data) 
		  jsonparser("{\r\n" + 
		  		"    \"file_name\": \"VID-20150822-WA0015-1602692142065.mp4\",\r\n" + 
		  		"    \"content_type\": \"video/mp4\",\r\n" + 
		  		"    \"file_size\": \"\",\r\n" + 
		  		"    \"file_uuid\":\"CFD6B8308876493992BB3C2E0BA49978\",\r\n" + 
		  		"    \"entity_tag\": \"f34b6baf465f0c09cc3aff88c141c0e0\",\r\n" + 
		  		"    \"file_url\": \"https://d250n7duzgh7t2.cloudfront.net/xPMcugrITuUMeHM2av8zoEyFlVtBkB0I/B05C552148D643158A8AD703B26331CC/vl/A04120CEE11A4E3383E7550F469E7B04/VID-20150822-WA0015-1602692142065.mp4\",\r\n" + 
		  		"    \"media_url\": \"\",\r\n" + 
		  		"    \"file_type\": \"\",\r\n" + 
		  		"    \"is_encode_required\": \"0\",\r\n" + 
		  		"    \"user_uuid\": \":me\",\r\n" + 
		  		"    \"store_key\": \":store_key\",\r\n" + 
		  		"    \"app_token\": \":app_token\",\r\n" + 
		  		"    \"product_key\": \":product_key\"\r\n" + 
		  		"}");
	  
	  response =  putRequest("asset/update", token);
	  String resdata = response.getBody().asString();
	  System.out.println(resdata);
	  return resdata;
	  
	  } 
	  
	  
	  
	  
	  
}
