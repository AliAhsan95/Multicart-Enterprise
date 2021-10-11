package stepscodedefinition;

import io.cucumber.java.en.Then;

public class ValidationStepCode {
	StepscodeHelper	helper;
	public ValidationStepCode(StepscodeHelper	helper) {
		this.helper = helper;
	}
    //Landing any Page 
	@Then("I Land on {string} and expect Title text as {string}")
	public void i_land_on_and_expect_title_text_as(String pageName, String string2) {
	    
	}	
	
}
