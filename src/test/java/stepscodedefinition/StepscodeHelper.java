package stepscodedefinition;

import Browsers.Browsers;
import pageobjectmodel.Homepage;
import pageobjectmodel.Reseller_RegisterPage;
import pageobjectmodel.VandorsSignupPage;

public class StepscodeHelper {

    StepscodeHelper	helper;
	Browsers browser;
	Homepage home;
	VandorsSignupPage vandor;
	Reseller_RegisterPage reseller;
	
	
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

	public Reseller_RegisterPage GetReseller_RegisterPage() {
		if(reseller==null) {
			reseller=new Reseller_RegisterPage(browser.driver);
		}
		return reseller;
	}
	
	


	
	

}
