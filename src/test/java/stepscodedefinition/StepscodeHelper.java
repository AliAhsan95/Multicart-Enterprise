package stepscodedefinition;

import Browsers.Browsers;
import pageobjectmodel.Homepage;
import pageobjectmodel.VandorsSignupPage;

public class StepscodeHelper {

 StepscodeHelper	helper;
	Browsers browser;
	Homepage home;
	VandorsSignupPage vandor;
	
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
	public VandorsSignupPage GetVandorsSignupPage() {
		if(vandor==null) {
			vandor=new VandorsSignupPage(browser.driver);
		}
		return vandor;
	}
	


	
	

}
