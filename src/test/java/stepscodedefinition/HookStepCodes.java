package stepscodedefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookStepCodes {

	StepscodeHelper	helper;
	
public HookStepCodes(StepscodeHelper	helper) {
	this.helper = helper;
}


@Before
public void Rampup() {
	
}


@After
public void TearDown() {
	//JavaWait(2000);
	
	helper.GetHomepage().JavaWait(2000);
	helper.GetBrowser().driver.close();
	
}




}
