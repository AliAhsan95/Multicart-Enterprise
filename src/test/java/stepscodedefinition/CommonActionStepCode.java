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
	}
	

	


}
