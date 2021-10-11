package stepscodedefinition;

import Browsers.Browsers;
import pageobjectmodel.Homepage;

public class StepscodeHelper {

 StepscodeHelper	helper;
	Browsers browser;
	Homepage home;
	
	public Browsers GetBrowser() {
		if (browser == null) {
			browser= new Browsers();
		}
		
		return browser;
		
	}
	
	public Homepage GetHomepage() {
		if (home == null) {
			home= new Homepage(browser.driver);
		}
		
		return home;
		
	}


	
	

}
