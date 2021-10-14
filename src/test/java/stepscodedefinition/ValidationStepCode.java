package stepscodedefinition;

import java.util.List;

import org.junit.Assert;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidationStepCode {
	StepscodeHelper helper;

	public ValidationStepCode(StepscodeHelper helper) {
		this.helper = helper;
	}

	// Landing any Page
	@Then("I Land on {string} and expect Title text as {string}")
	public void i_land_on_and_expect_title_text_as(String pageName, String ExpectedTitleText) {
		pageName = pageName.toLowerCase().trim();

		/// for vandors
		if (pageName.equals("Vendors signup page".toLowerCase())) {

			String actualTitleText = helper.GetVandorsSignupPage().GetActualVandorsTitleText();
			Assert.assertEquals(ExpectedTitleText.toLowerCase(), actualTitleText.toLowerCase());
		} else if (pageName.equals("login page".toLowerCase().trim())) {
			String actualTitleText = helper.GetVandorsSignupPage().GetActualVandorstitleText();
			Assert.assertEquals(ExpectedTitleText.toLowerCase(), actualTitleText.toLowerCase());
		}

	}

	@Then("I expect options text on the left side as")
	public void i_expect_options_text_on_the_left_side_as(DataTable dataTable) {
		List<String> expectedGetToKnowUsOptions = dataTable.asList(String.class);
		List<String> actualGetToKnowUsOptions = helper.GetVandorsSignupPage().GetToKnowUsOptionsFromUi();
		// System.out.println(expectedGetToKnowUsOptions);
		// System.out.println(actualGetToKnowUsOptions);

		Assert.assertEquals(expectedGetToKnowUsOptions, actualGetToKnowUsOptions);

	}

	@Then("I Land in {string} Page and Expect Title Text as {string}")
	public void i_land_in_page_and_expect_title_text_as(String pageName, String expectedText) {
		pageName = pageName.toLowerCase().trim();

		if (pageName.equals("Reseller Login".toLowerCase())) {
			String actualTitleText = helper.GetReseller_RegisterPage().GetActualResellerloginTitleText();
			Assert.assertEquals(expectedText.toLowerCase(), actualTitleText.toLowerCase());
		} else if (pageName.equals("Reseller Plans".toLowerCase())) {
			String actualTitleText = helper.GetReseller_RegisterPage().GetActualErrorRightSideHeaderText();
			Assert.assertEquals(expectedText.toLowerCase(), actualTitleText.toLowerCase());
		} else if (pageName.equals("Reseller Registration".toLowerCase())) {
			String actualTitleText = helper.GetReseller_RegisterPage()
					.GetActualErroresellerRegistrationPageHeaderText();
			Assert.assertEquals(expectedText.toLowerCase(), actualTitleText.toLowerCase());
		}

	}

	@Then("I expect {string} options are available")
	public void i_expect_options_are_available(String string, io.cucumber.datatable.DataTable dataTable) {

		List<String> expectedLeftSideResellerPlansPageOptions = dataTable.asList(String.class);

		//// Get the List of Option From UI - Selenium
		List<String> actualLeftSideResellerPlansPageOptions = helper.GetReseller_RegisterPage()
				.GetLeftSideResellerPlansPageOptionsFromUI();
		///// Compare 2 List
		System.out.println(expectedLeftSideResellerPlansPageOptions);
		System.out.println(actualLeftSideResellerPlansPageOptions);

		Assert.assertEquals(actualLeftSideResellerPlansPageOptions, expectedLeftSideResellerPlansPageOptions);

	}

}
