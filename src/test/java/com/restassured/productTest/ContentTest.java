package com.restassured.productTest;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.restassured.validation.addCast_Validation;
import com.restassured.validation.addCategory_Validation;
import com.restassured.validation.addContent_Validation;
import com.restassured.validation.addFeatureSection_Validation;
import com.restassured.validation.addPlaylist_Validation;
import com.restassured.validation.addRelatedContent_Validation;
import com.restassured.validation.addSubCategory_Validation;
import com.restassured.validation.addTemplateTrans_Validation;
import com.restassured.validation.addTemplate_Validation;
import com.restassured.validation.castDetails_Validation;
import com.restassured.validation.castList_Validation; 
import com.restassured.validation.categoryList_Validation;
import com.restassured.validation.contentDetails_Validation;
import com.restassured.validation.contentList_Validation;
import com.restassured.validation.deleteAsset_Validation;
import com.restassured.validation.deleteCast_Validation;
import com.restassured.validation.deleteCategory_Validation;
import com.restassured.validation.deleteContent_Validation;
import com.restassured.validation.deleteFeatureSection_Validation;
import com.restassured.validation.deletePlaylist_Validation;
import com.restassured.validation.deleteRelatedContent_Validation;
import com.restassured.validation.editContent_Validation;
import com.restassured.validation.editFeatureSection_Validation;
import com.restassured.validation.editPlaylist_Validation;
import com.restassured.validation.featureSectionDetails_Validation;
import com.restassured.validation.featureSectionList_Validation;
import com.restassured.validation.getAssetAudio_Validation;
import com.restassured.validation.getAssetDocument_Validation;
import com.restassured.validation.getAssetImage_Validation;
import com.restassured.validation.getAssetVideo_Validation;
import com.restassured.validation.getBucketInfo_Validation;
import com.restassured.validation.playList_Validation;
import com.restassured.validation.playlistDetails_Validation;
import com.restassured.validation.relatedContentList_Validation;
import com.restassured.validation.saveAssetAudio_Validation;
import com.restassured.validation.saveAssetImage_Validation;
import com.restassured.validation.saveAssetVideo_Validation;
import com.restassured.validation.saveField_Validation;
import com.restassured.validation.searchAdd_Validation;
import com.restassured.validation.templateList_Validation;
import com.restassured.validation.updateAssetVideo_Validation;
import com.restassured.validation.updateCast_Validation;
import com.restassured.validation.updateCategory_Validation;
import com.restassured.utils.ExtentReportListner;

import org.json.simple.parser.ParseException;

@Listeners(ExtentReportListner.class)
public class ContentTest extends ExtentReportListner
{
	
     @Test
	 public void addCategoryValidResponse() throws ParseException
	{
		new addCategory_Validation()
		.ResponseTimeVerification()
		.addCategoryStringVerification()
		.addCategoryIntegerVerification()
		.addCategoryJsonVerification()
		.addCategoryKeyPresent()
		.addCategoryStatuscode(); 	
	}
	
	@Test
	public void addCategoryInvalidResponse() throws ParseException
	{
		new addCategory_Validation()
		.addCategoryInvalidStringVerification()
		.addCategoryInvalidIntegerVerification()
		.addCategoryInvalidArrayVerification()
		.addCategoryInvalidKeyPresent()
		.addCategoryInvalidStatuscode();	
	}
	
	 
	@Test
	public void addSubCategoryValidResponse() throws ParseException
	{
		new addSubCategory_Validation()
		.addSubCategoryStringVerification()
		.addSubCategoryIntegerVerification()
		.addSubCategoryJsonVerification()
		.addSubCategoryKeyPresent()
		.addSubCategoryStatuscode()
		.ResponseTimeVerification();
	}
	
	@Test
	public void addSubCategoryInvalidResponse() throws ParseException
	{
		new addSubCategory_Validation()
		.addSubCategoryInvalidStringVerification()
		.addSubCategoryInvalidIntegerVerification()
		.addSubCategoryInvalidArrayVerification()
		.addSubCategoryInvalidKeyPresent()
		.addSubCategoryInvalidStatuscode();
		
	}
	
	@Test
	public void updateCategoryValidResponse() throws ParseException
	{
		new updateCategory_Validation()
		.ResponseTimeVerification()
		.updateCategoryStringVerification()
		.updateCategoryIntegerVerification()
		.updateCategoryJsonVerification()
		.updateCategoryKeyPresent()
		.updateCategoryStatuscode();
		
		
	}
	@Test
	public void updateCategoryInValidResponse() throws ParseException
	{
		new updateCategory_Validation()
		.updateCategoryInvalidStringVerification()
		.updateCategoryInvalidIntegerVerification()
		.updateCategoryInvalidKeyPresent()
		.updateCategoryInvalidStatuscode();
		
		
	}
	
	@Test
	public void deleteCategoryValidResponse() throws ParseException
	{
	   new deleteCategory_Validation()
	   .ResponseTimeVerification()
	   .deleteCategoryJsonVerification()
	   .deleteCategoryKeyPresent()
	   .deleteCategoryStatuscode();
		
		
	}
	
	@Test
	public void deleteCategoryInvalidResponse() throws ParseException
	{
		new deleteCategory_Validation()
		.ResponseTimeVerification()
		.deleteCategoryInvalidStringVerification()
		.deleteCategoryInvalidIntegerVerification()
		.deleteCategoryInvalidKeyPresent()
		.deleteCategoryInvalidStatuscode();
		
		
	}
	
	@Test
    public void categoryListValidResponse() throws ParseException
	{
		new categoryList_Validation()
		.ResponseTimeVerification()
		.categoryListIntegerVerification()
		.categoryListStringVerification()
		.categoryListJsonVerification()
		.categoryListArrayVerification()
		.categoryListKeyPresent()
		.categoryListStatuscode();
		
	
	}
	
	@Test
	public void categoryListInvalidResponse() throws ParseException
	{
		new categoryList_Validation()
		.ResponseTimeVerification()
		.categoryListInvalidStringVerification()
		.categoryListInvalidIntegerVerification()
		.categoryListInvalidArrayVerification()
		.categoryListInvalidKeyPresent()
		.categoryListInvalidStatuscode();
	}
	
	 @Test
	public void addCastValidResponse() throws ParseException
	{
		new addCast_Validation()
		.ResponseTimeVerification()
		.addCastIntegerVerification()
		.addCastJsonVerification()
		.addCastyKeyPresent()
		.addCastStatuscode();
		
	
	}
	
	@Test
	public void addCastInvalidResponse() throws ParseException
	{
		new addCast_Validation()
		.ResponseTimeVerification()
		.addCastInvalidIntegerVerification()
		.addCastInvalidStringVerification()
		.addCastInvalidArrayVerification()
		.addCastInvalidKeyPresent()
		.addCastInvalidStatuscode();
	
	}
	
	@Test
	public void updateCastValidResponse() throws ParseException
	{
		new updateCast_Validation()
		.ResponseTimeVerification()
		.updateCastStringVerification()
		.updateCastJsonVerification()
		.updateCastIntegerVerification()
		.updateCastKeyPresent()
		.updateCastStatuscode();
	}
	
	
	@Test
	public void updateCastInvalidResponse() throws ParseException
	{
      new updateCast_Validation()
      .ResponseTimeVerification()
      .updateCastInvalidIntegerVerification()
      .updateCastInvalidKeyPresent()
      .updateCastInvalidStringVerification()
      .updateCastInvalidStatuscode();
	}
	
	
	@Test
	public void deleteCastValidResponse() throws ParseException
	{
      new deleteCast_Validation()
      .ResponseTimeVerification()
      .deleteCastIntegerVerification()
      .deleteCastStringVerification()
      .deleteCastKeyPresent()
      .deleteCastStatuscode()
      ;
	}
	
	@Test
	public void deleteCastInvalidResponse() throws ParseException
	{
      new deleteCast_Validation()
      .ResponseTimeVerification()
      .deleteCastInvalidIntegerVerification()
      .deleteCastInvalidKeyPresent()
      .deleteCastInvalidStringVerification()
      .deleteCastInvalidStatuscode();
	}
	

	@Test
	public void castListValidResponse() throws ParseException
	{
	  new castList_Validation()
	  .ResponseTimeVerification()
	  .castListIntegerVerification()
	  .castListJsonVerification()
	  .castListStringVerification()
	  .castListyKeyPresent()
	  .castListStatuscode();
	}
	
	
	@Test
	public void CastDetailsValidResponse() throws ParseException
	{
		new castDetails_Validation()
		.ResponseTimeVerification()
		.castDetailsIntegerVerification()
		.castDetailsStringVerification()
		.castDetailsyKeyPresent()
		.castDetailsyKeyPresent()
		.castDetailsStatuscode();
	}
    
     @Test
	public void addContentInvalidResponse() throws ParseException
	{
		new addContent_Validation()
		.ResponseTimeVerification()
		.addContentInvalidIntegerVerification()
		.addContentInvalidArrayVerification()
		.addContentInvalidKeyPresent()
		.addContentInvalidStringVerification()
		.addContentInvalidStatuscode();
		
	}
	
	@Test
	public void addContentValidResponse() throws ParseException
	{
		new addContent_Validation()
		.ResponseTimeVerification()
		.addContentIntegerVerification()
		.addContentJsonVerification()
		.addContentKeyPresent()
		.addContentStringVerification()
		//.addContentBooleanVerification()
		.addContentStatuscode();
	}
	
	@Test
	public void editContentValidResponse() throws ParseException
	{
		new editContent_Validation()
		.ResponseTimeVerification()
		.editContentIntegerVerification()
		.editContentJsonVerification()
		.editContentStringVerification()
		.editContentKeyPresent()
		.editContentStatuscode();
	}
	
	@Test
	public void editContentInvalidResponse() throws ParseException
	{
		new editContent_Validation()
		.ResponseTimeVerification();
		
	}
	
	

	@Test
	public void deleteContentValidResponse() throws ParseException
	{
		new deleteContent_Validation()
		.ResponseTimeVerification()
		.deleteContentIntegerVerification()
		.deleteContentStringVerification()
		.deleteContentKeyPresent()
		.deleteContentStatuscode();	
	
	}
	
	
	@Test
	public void deleteContentInvalidResponse() throws ParseException
	{
		new deleteContent_Validation()
		.ResponseTimeVerification()
		.deleteContentInvalidIntegerVerification()
		.deleteContentInvalidStringVerification()
		.deleteContentInvalidKeyPresent()
		.deleteContentInvalidStatuscode();
	}
	
	
	@Test
	public void contentListValidResponse() throws ParseException
	{
		new contentList_Validation()
		.ResponseTimeVerification()
		.contentListIntegerVerification()
		.contentListJsonVerification()
		.contentListStringVerification()
		.contentListyKeyPresent()
		.contentListStatuscode();	
	}
	
	@Test
	public void contentDetailsInvalidResponse() throws ParseException
	{
		new contentDetails_Validation()
		.ResponseTimeVerification()
		.contentDetailsInvalidIntegerVerification()
		.contentDetailsInvalidStringVerification()
		.contentDetailsInvalidKeyPresent()
		.contentDetailsInvalidStatuscode();
	}
	
	@Test
	public void contentDetailsValidResponse() throws ParseException
	{
		new contentDetails_Validation()
		.ResponseTimeVerification()
		.contentDetailsIntegerVerification()
		.contentDetailsStringVerification()
		.contentDetailsJsonVerification()
		.contentDetailsyKeyPresent()
		.contentDetailsStatuscode();
	}
	
	
     @Test
     public void addRelatedContentValidResponse() throws ParseException
     {
    	 new addRelatedContent_Validation()
    	 .ResponseTimeVerification()
    	 .addRelatedContentIntegerVerification()
    	 .addRelatedContentStringVerification()
    	 .addRelatedContentJsonVerification()
    	 .addRelatedContentArrayVerification()
    	 .addRelatedContentyKeyPresent()
    	 .addRelatedContentStatuscode();
    	 
     } 
     
     @Test
     public void addRelatedContentInvalidResponse() throws ParseException
     {
        new addRelatedContent_Validation()
        .ResponseTimeVerification()
        .addRelatedContentInvalidIntegerVerification()
        .addRelatedContentInvalidStringVerification()
        .addRelatedContentInvalidKeyPresent()
        .addRelatedContentInvalidStatuscode();
     }
      
	@Test
	public void relatedContentListValidResponse() throws ParseException
	{
		new relatedContentList_Validation()
		.ResponseTimeVerification()
		.relatedContentListIntegerVerification()
		.relatedContentListJsonVerification()
		.relatedContentListStringVerification()
		.relatedContentListyKeyPresent()
		.relatedContentListStatuscode();	
	}
	
	@Test
	public void deleteRelatedContentInvalidResponse() throws ParseException
	{
		new deleteRelatedContent_Validation()
		.ResponseTimeVerification()
		.deleteRelatedContentInvalidIntegerVerification()
		.deleteRelatedContentInvalidKeyPresent()
		.deleteRelatedContentInvalidStringVerification()
		.deleteRelatedContentInvalidStatuscode();
		
	}
	
	@Test
	public void deleteRelatedContentValidResponse() throws ParseException
	{
		new deleteRelatedContent_Validation()
		.ResponseTimeVerification()
		.deleteRelatedContentIntegerVerification()
		.deleteRelatedContentStringVerification()
		.deleteRelatedContentKeyPresent()
		.deleteRelatedContentStatuscode();
	}
	
	@Test
	public void getAssetVideoValidResponse() throws ParseException
	{
		new getAssetVideo_Validation()
		.ResponseTimeVerification()
		.getAssetVideoIntegerVerification()
		.getAssetVideoStringVerification()
		.getAssetVideoJsonVerification()
		.getAssetVideoyKeyPresent()
		.getAssetVideoStatuscode();
	}
	
	@Test
	public void getAssetAudioValidResponse() throws ParseException
	{
		new getAssetAudio_Validation()
		.ResponseTimeVerification()
		.getAssetAudioIntegerVerification()
		.getAssetAudioStringVerification()
		.getAssetAudioJsonVerification()
		.getAssetAudioyKeyPresent()
		.getAssetAudioStatuscode();
	}
	
	@Test
	public void getAssetImageValidResponse() throws ParseException
	{
		new getAssetImage_Validation()
		.ResponseTimeVerification()
		.getAssetImageIntegerVerification()
		.getAssetImageStringVerification()
		.getAssetImageJsonVerification()
		.getAssetImageKeyPresent()
		.getAssetImageStatuscode();
	}
	
	@Test
	public void getAssetDocumentValidResponse() throws ParseException
	{
		new getAssetDocument_Validation()
		.ResponseTimeVerification()
		.getAssetDocumentIntegerVerification()
		.getAssetDocumentStringVerification()
		.getAssetDocumentJsonVerification()
		.getAssetDocumentyKeyPresent()
		.getAssetDocumentStatuscode();
	}
	
	
	@Test
	public void getBucketInfoValidResponse() throws ParseException
	{
		new getBucketInfo_Validation()
		.ResponseTimeVerification()
		.getBucketInfoIntegerVerification()
		.getBucketInfoStringVerification()
		.getBucketInfoJsonVerification()
		.getBucketInfoKeyPresent()
		.getBucketInfoStatuscode();
	}
	
	@Test
	public void getBucketInfoInvalidResponse() throws ParseException
	{
		new getBucketInfo_Validation()
		.ResponseTimeVerification()
		.getBucketInfoInvalidIntegerVerification()
		.getBucketInfoInvalidStringVerification()
		.getBucketInfoInvalidKeyPresent()
		.getBucketInfoInvalidStatuscode();
	}
	
	
	@Test
	public void addFeatureSectionValidResponse() throws ParseException
	{
		new addFeatureSection_Validation()
		.ResponseTimeVerification()
		.addFeatureSectionIntegerVerification()
		.addFeatureSectionStringVerification()
		.addFeatureSectionJsonVerification()
		.addFeatureSectionKeyPresent()
		.addFeatureSectionStatuscode();
	}
	
	@Test
	public void addFeatureSectionInvalidResponse() throws ParseException
	{
		new addFeatureSection_Validation()
		.ResponseTimeVerification()
		.addFeatureSectionInvalidIntegerVerification()
		.addFeatureSectionInvalidStringVerification()
		.addFeatureSectionInvalidKeyPresent()
		.addFeatureSectionStatuscode();
	}
	
	@Test
	public void editFeatureSectionValidResponse() throws ParseException
	{
		new editFeatureSection_Validation()
		.ResponseTimeVerification()
		//.editFeatureSectionIntegerVerification()
		//.editFeatureSectionStringVerification()
		//.editFeatureSectionJsonVerification()
		//.editFeatureSectionKeyPresent()
		//.editFeatureSectionStatuscode()
		;
	}
	
	@Test
	public void editFeatureSectionInvalidResponse() throws ParseException
	{
		new editFeatureSection_Validation()
		.ResponseTimeVerification()
		.editFeatureSectionInvalidIntegerVerification()
		.editFeatureSectionInvalidStringVerification()
		.editFeatureSectionInvalidKeyPresent()
		.editFeatureSectionInvalidStatuscode();
	}
	
	@Test
	public void deleteFeatureSectionValidResponse() throws ParseException
	{
		new deleteFeatureSection_Validation()
		.ResponseTimeVerification()
		.deleteFeatureSectionIntegerVerification()
		.deleteFeatureSectionStringVerification()
		.deleteFeatureSectionKeyPresent()
		.deleteFeatureSectionStatuscode();
	}
	
	@Test
	public void deleteFeatureSectionInvalidResponse() throws ParseException
	{
		new deleteFeatureSection_Validation()
		.ResponseTimeVerification()
		.deleteFeatureSectionInvalidIntegerVerification()
		.deleteFeatureSectionInvalidStringVerification()
		.deleteFeatureSectionInvalidKeyPresent()
		.deleteFeatureSectionInvalidStatuscode();
	}
	
	@Test
	public void featureSectionListValidResponse() throws ParseException
	{
		new featureSectionList_Validation()
		.ResponseTimeVerification()
		.featureSectionListIntegerVerification()
		.featureSectionListStringVerification()
		.featureSectionListyKeyPresent()
		.featureSectionListStatuscode();
	}
	
	@Test
	public void featureSectionDetailsValidResponse() throws ParseException
	{
		new featureSectionDetails_Validation()
		.ResponseTimeVerification()
		.featureSectionDetailsIntegerVerification()
		.featureSectionDetailsJsonVerification()
		.featureSectionDetailsStringVerification()
		.featureSectionDetailsyKeyPresent()
		.featureSectionDetailsStatuscode();
	}
	
	@Test
	public void addPlaylistValidResponse() throws ParseException
	{
		new addPlaylist_Validation()
		.ResponseTimeVerification()
		.addPlaylistIntegerVerification()
		.addPlaylistStringVerification()
		.addPlaylistJsonVerification()
		.addPlaylistKeyPresent()
		.addPlaylistStatuscode();
	}
	
	@Test
	public void addPlaylistInvalidResponse() throws ParseException
	{
		new addPlaylist_Validation()
		.addPlaylistInvalidIntegerVerification()
		.addPlaylistInvalidStringVerification()
		.addPlaylistInvalidArrayVerification()
		.addPlaylistInvalidKeyPresent()
		.addPlaylistInvalidStatuscode();
	}
	
	@Test
	public void deletePlaylistValidResponse() throws ParseException
	{
		new deletePlaylist_Validation()
		.ResponseTimeVerification()
		.deletePlaylistIntegerVerification()
		.deletePlaylistStringVerification()
		.deletePlaylistKeyPresent()
		.deletePlaylistStatuscode();
	}
	
	@Test
	public void deletePlaylistInvalidResponse() throws ParseException
	{
		new deletePlaylist_Validation()
		.ResponseTimeVerification()
		.deletePlaylistInvalidIntegerVerification()
		.deletePlaylistInvalidStringVerification()
		.deletePlaylistInvalidKeyPresent()
		.deletePlaylistInvalidStatuscode();
	}
	
	
	@Test
	public void editPlaylistValidResponse() throws ParseException
	{
		new editPlaylist_Validation()
		.ResponseTimeVerification()
		.editPlaylistIntegerVerification()
		.editPlaylistStringVerification()
		.editPlaylistJsonVerification()
		.editPlaylistKeyPresent()
		.editPlaylistStatuscode();
	}
	@Test
	public void editPlaylistInvalidResponse() throws ParseException
	{
		new editPlaylist_Validation()
		.editPlaylistInvalidIntegerVerification()
		.editPlaylistInvalidStringVerification()
		.editPlaylistInvalidKeyPresent()
		.editPlaylistInvalidStatuscode();
	}
	
	
	@Test
	public void playListValidResponse() throws ParseException
	{
		new playList_Validation()
		.ResponseTimeVerification()
		.playListIntegerVerification()
		.playListStringVerification()
		.playListJsonVerification()
		.playListKeyPresent()
		.playListStatuscode();
	}
	
	@Test
	public void playlistDetailsValidResponse() throws ParseException
	{
		new playlistDetails_Validation()
		.ResponseTimeVerification()
		.playlistDetailsIntegerVerification()
		.playlistDetailsStringVerification()
		.playlistDetailsArrayVerification()
		.playlistDetailsJsonVerification()
		.playlistDetailsKeyPresent()
		.playlistDetailsStatuscode();
		
	}
	
	@Test
	public void playlistDetailsInvalidResponse() throws ParseException
	{
		new playlistDetails_Validation()
		.ResponseTimeVerification()
		.playlistDetailsInvalidIntegerVerification()
		.playlistDetailsInvalidArrayVerification()
		.playlistDetailsJsonVerification()
		.playlistDetailsInvalidKeyPresent()
		.playlistDetailsInvalidStatuscode();
	}
	
	@Test
	public void saveFieldValidResponse() throws ParseException
	{
		new saveField_Validation()
		.ResponseTimeVerification()
		.saveFieldIntegerVerification()
		.saveFieldStringVerification()
		.saveFieldJsonVerification()
		.saveFieldyKeyPresent()
		.saveFieldStatuscode();
	}
	
	@Test
	public void saveFieldInvalidResponse() throws ParseException
	{
		new saveField_Validation()
		.ResponseTimeVerification()
		.saveFieldInvalidIntegerVerification()
		.saveFieldInvalidStringVerification()
		.saveFieldInvalidKeyPresent()
		.saveFieldInvalidStatuscode();
	}
	
	@Test
	public void addTemplateValidResponse() throws ParseException
	{
		new addTemplate_Validation()
		.ResponseTimeVerification()
		.addTemplateIntegerVerification()
		.addTemplateStringVerification()
		.addTemplateJsonVerification()
		.addTemplateyKeyPresent()
		.addTemplateStatuscode();
	}
	
	@Test
	public void addTemplateInvalidResponse() throws ParseException
	{
		new addTemplate_Validation()
		.ResponseTimeVerification()
		.addTemplateInvalidIntegerVerification()
		.addTemplateInvalidStringVerification()
		.addTemplateInvalidKeyPresent()
		.addTemplateInvalidStatuscode();
	}
	
	@Test
	public void addTemplateTransValidResponse() throws ParseException
	{
		new addTemplateTrans_Validation()
		.ResponseTimeVerification()
		.addTemplateTransIntegerVerification()
		.addTemplateTransStringVerification()
		.addTemplateTransJsonVerification()
		.addTemplateTransyKeyPresent()
		.addTemplateTransStatuscode();
	}
	
	@Test
	public void addTemplateTransInvalidResponse() throws ParseException
	{
		new addTemplateTrans_Validation()
		.ResponseTimeVerification()
		.addTemplateTransInvalidIntegerVerification()
		.addTemplateTransInvalidStringVerification()
		.addTemplateTransInvalidKeyPresent()
		.addTemplateTransInvalidStatuscode();
	}
	
	@Test
	public void templateListValidResponse() throws ParseException
	{
		new templateList_Validation()
		.ResponseTimeVerification()
		.templateListIntegerVerification()
		.templateListStringVerification()
		.templateListJsonVerification()
		.templateListyKeyPresent()
		.templateListStatuscode();
	}
	
	@Test
	public void templateListInvalidResponse() throws ParseException
	{
		new templateList_Validation()
		.ResponseTimeVerification()
		.templateListInvalidIntegerVerification()
		.templateListInvalidStringVerification()
		.templateListInvalidKeyPresent()
		.templateListInvalidStatuscode();
	}
	
	@Test
	public void saveAssetAudioValidResponse() throws ParseException
	{
		new saveAssetAudio_Validation()
		.ResponseTimeVerification()
		.saveAssetAudioIntegerVerification()
		.saveAssetAudioStringVerification()
		.saveAssetAudioJsonVerification()
		.saveAssetAudioyKeyPresent()
		.saveAssetAudioStatuscode();
	}
	
	@Test
	public void saveAssetAudioInvalidResponse() throws ParseException
	{
		new saveAssetAudio_Validation()
		.ResponseTimeVerification()
		.saveAssetAudioInvalidIntegerVerification()
		.saveAssetAudioInvalidStringVerification()
		.saveAssetAudioInvalidKeyPresent()
		.saveAssetAudioInvalidStatuscode();
	}
	
	@Test
	public void saveAssetVideoValidResponse() throws ParseException
	{
		new saveAssetVideo_Validation()
	    .ResponseTimeVerification()
	    .saveAssetVideoIntegerVerification()
	    .saveAssetVideoStringVerification()
	    .saveAssetVideoJsonVerification()
	    .saveAssetVideoyKeyPresent()
	    .saveAssetVideoStatuscode();
	}
	
	@Test
	public void saveAssetVideoInvalidResponse() throws ParseException
	{
		new saveAssetVideo_Validation()
		.ResponseTimeVerification()
		.saveAssetVideoInvalidIntegerVerification()
		.saveAssetVideoInvalidStringVerification()
		.saveAssetVideoInvalidKeyPresent()
		.saveAssetVideoInvalidStatuscode();
	}
	
	@Test
	public void saveAssetImageValidResponse() throws ParseException
	{
		new saveAssetImage_Validation()
		.ResponseTimeVerification()
		.saveAssetImageIntegerVerification()
		.saveAssetImageJsonVerification()
		.saveAssetImageStringVerification()
		.saveAssetImageStatuscode()
		.saveAssetImageyKeyPresent();
	}
	
	@Test
	public void saveAssetImageInvalidResponse() throws ParseException
	{
		new saveAssetImage_Validation()
		.ResponseTimeVerification()
		.saveAssetImageInvalidIntegerVerification()
		.saveAssetImageInvalidStringVerification()
		.saveAssetImageInvalidKeyPresent()
		.saveAssetImageInvalidStatuscode();
	}
	
	@Test
	public void updateAssetVideoValidResponse() throws ParseException
	{
		new updateAssetVideo_Validation()
		.ResponseTimeVerification()
		.updateAssetVideoIntegerVerification()
		.updateAssetVideoJsonVerification()
		.updateAssetVideoStringVerification()
		.updateAssetVideoyKeyPresent()
		.updateAssetVideoStatuscode();
	}
	
	@Test
	public void updateAssetVideoInvalidResponse() throws ParseException
	{
		new updateAssetVideo_Validation()
		.ResponseTimeVerification()
		.updateAssetVideoInvalidIntegerVerification()
		.updateAssetVideoInvalidStringVerification()
		.updateAssetVideoInvalidKeyPresent()
		.updateAssetVideoInvalidStatuscode();
	}
	
	
	@Test
	public void deleteAssetValidResponse() throws ParseException
	{
		new deleteAsset_Validation()
		.ResponseTimeVerification()
		.deleteAssetIntegerVerification()
		.deleteAssetStringVerification()
		.deleteAssetKeyPresent()
		.deleteAssetStatuscode();
	}
	
	@Test
	public void deleteAssetInvalidResponse() throws ParseException
	{
		new deleteAsset_Validation()
		.ResponseTimeVerification()
		.deleteAssetInvalidIntegerVerification()
		.deleteAssetInvalidStringVerification()
		.deleteAssetInvalidKeyPresent()
		.deleteAssetInvalidStatuscode();
	}
	
	
	//SearchService APIs 
	@Test
	public void searchAddValidResponse() throws ParseException
	{
		new searchAdd_Validation()
		.ResponseTimeVerification()
		.searchAddIntegerVerification()
		.searchAddStringVerification()
		.searchAddJsonVerification()
		.searchAddyKeyPresent()
		.searchAddStatuscode();
	}
	
	@Test
	public void searchAddInvalidResponse() throws ParseException
	{
		new searchAdd_Validation()
		.ResponseTimeVerification()
		.searchAddInvalidIntegerVerification()
		.searchAddInvalidStringVerification()
		.searchAddInvalidKeyPresent()
		.searchAddInvalidStatuscode();
	}
	
	
	
	
}	


