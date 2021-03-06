package stepscodedefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonActionStepCode {
	StepscodeHelper	helper;
	
	public CommonActionStepCode(StepscodeHelper	helper) {
		this.helper = helper;
	}

	
	
	
    //Method for Click Anything 
	@When("I Click {string}")
	public void i_click(String elementName) {
	  elementName= elementName.toLowerCase().trim();
	  
	  // For Clicking Affiliates link 
	  if (elementName.equals("Affiliates link".toLowerCase())) {
		  
	  }
	  /// for vendors link
	  else if(elementName.equals("VENDORS link".toLowerCase().trim())) {
		  helper.GetVandorsSignupPage().ClickVndorLink();
	  ///  
	  }else if(elementName.equals("Register now link".toLowerCase().trim())) {
		  helper.GetVandorsSignupPage().ClickVndorRegisterLink();
	  }else if(elementName.equals("Select button".toLowerCase().trim())) {
		  helper.GetVandorsSignupPage().ClickSlectButton();
	  }else if (elementName.equals("Resellers Link".toLowerCase().trim())) {
		  helper.GetReseller_RegisterPage().ClickResellersLink();
	  }else if (elementName.equals("Free Reseller Membership Select Button".trim().toLowerCase())) {
		  helper.GetReseller_RegisterPage().ClickFreeResellerMembershipSelectButton();
	  }
	
	
	
	}

}
