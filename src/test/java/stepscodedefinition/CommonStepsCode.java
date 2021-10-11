package stepscodedefinition;

import io.cucumber.java.en.Given;

public class CommonStepsCode {
	StepscodeHelper	helper;
	public CommonStepsCode(StepscodeHelper	helper) {
		this.helper = helper;
	}

	//Method for Opening Browser
	@Given("I open my {string} browser")
	public void i_open_my_browser(String browserName) {
	   helper.GetBrowser().OpenMyBrowser(browserName);
	}
    //Method for Opening WebPage
	@Given("I navigate to URL {string}")
	public void i_navigate_to_url(String webpageUrl) {
	    helper.GetBrowser().NavegettoWebpageUrl(webpageUrl);
	}
}
