package stepscodedefinition;

import java.util.List;

import org.junit.Assert;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Then;

public class ValidationStepCode {
	StepscodeHelper	helper;
	public ValidationStepCode(StepscodeHelper	helper) {
		this.helper = helper;
	}
    //Landing any Page 
	@Then("I Land on {string} and expect Title text as {string}")
	public void i_land_on_and_expect_title_text_as(String pageName, String ExpectedTitleText) {
		pageName =pageName.toLowerCase().trim();
		///for vandors
		if(pageName.equals("Vendors signup page".toLowerCase())) {
			String actualTitleText = helper.GetVandorsSignupPage().GetActualVandorsTitleText();
			Assert.assertEquals(ExpectedTitleText.toLowerCase(), actualTitleText.toLowerCase());
		}else if(pageName.equals("login page".toLowerCase().trim())) {
			String actualTitleText = helper.GetVandorsSignupPage().GetActualVandorstitleText();
			Assert.assertEquals(ExpectedTitleText.toLowerCase(), actualTitleText.toLowerCase());
		}
		
	    
	}		
	
	
	/////arrey for vandors

	
@Then("I expect options text on the left side as")
public void i_expect_options_text_on_the_left_side_as(DataTable dataTable) {
	List<String>expectedGetToKnowUsOptions =  dataTable.asList(String.class);
	   List<String>actualGetToKnowUsOptions= helper.GetVandorsSignupPage().GetToKnowUsOptionsFromUi();
//	   System.out.println(expectedGetToKnowUsOptions);
//	   System.out.println(actualGetToKnowUsOptions);
	   
	   Assert.assertEquals(expectedGetToKnowUsOptions,actualGetToKnowUsOptions);
   

}

//	@Then("I expect all Get to know us option links are displayed in footer")
//	public void i_expect_all_get_to_know_us_option_links_are_displayed_in_(DataTable getToKnowUsDataTable) {
//		List<String> expectedGetToKnowUsOptions = getToKnowUsDataTable.asList(String.class);
//		 
//		//Get text from webelements
//		List<String> actualGetToKnowUsOptions = helper.GetFooterSection().GetToKnowUsOptionsFromUI();
//		//Compare both table
//		Assert.assertEquals(expectedGetToKnowUsOptions, actualGetToKnowUsOptions);
//	  
//	}
	
	
	

	
	
	
}
