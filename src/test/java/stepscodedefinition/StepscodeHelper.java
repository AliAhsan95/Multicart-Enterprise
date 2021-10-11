package stepscodedefinition;

import Browsers.Browsers;

public class StepscodeHelper {

 StepscodeHelper	helper;
	Browsers browser;
	
	
	public Browsers GetBrowser() {
		if (browser == null) {
			browser= new Browsers();
		}
		
		return browser;
		
	}
	



}
