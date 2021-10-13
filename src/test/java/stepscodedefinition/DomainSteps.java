package stepscodedefinition;

import io.cucumber.java.en.Then;

public class DomainSteps {
	StepscodeHelper	helper;
	public DomainSteps(StepscodeHelper	helper) {
		this.helper = helper;
	}
	////domain for vandors
	@Then("I complete registation form for a new user firstname {string} and lastname {string}")
	public void i_complete_registation_form_for_a_new_user_firstname_and_lastname(String firstName, String lastName) {
		helper.GetVandorsSignupPage().CreateAccountForNewUser(firstName, lastName);
	    
	}
	
	
	
	
	

}
