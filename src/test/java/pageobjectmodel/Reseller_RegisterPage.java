package pageobjectmodel;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reseller_RegisterPage extends Parentpage {

	public Reseller_RegisterPage(WebDriver driver) {
		super(driver);
	}
    
	
	String resellerLink = "//a[text()='Resellers']";
	String resellerLoginText = "//h2[@class='text-center']";
	String rightSideheaderText ="//th[@colspan='3']";
	String leftSideResellerPlansPageOptions = "//div[@align='left']/a";
	String registrationPageHeaderText = "//h2[contains(text(),'Reseller Registration')]";
	String FreeResellerMembershipSelectButton = "//tbody//tr[3]/td/input";
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String GetActualResellerloginTitleText() {
		
		return GetTextFromWebElementByXpath(resellerLoginText);
	}




	public void ClickResellersLink() {
		
		ClickWebElementByXpath(resellerLink);
		
	}




	




	public List<String> GetLeftSideResellerPlansPageOptionsFromUI() {
		
		List<String> resultList = new ArrayList<String>();
		
		List<WebElement> actualList = GetWebElementsByXpath(leftSideResellerPlansPageOptions);
		for (int i = 0; i < actualList.size(); i++) {
			
			resultList.add(actualList.get(i).getText());
		}

		return resultList;
	}




	public String GetActualErrorRightSideHeaderText() {
		
		return GetTextFromWebElementByXpath(rightSideheaderText);
	}




	public String GetActualErroresellerRegistrationPageHeaderText() {
		
		return GetTextFromWebElementByXpath(registrationPageHeaderText);
	}




	public void ClickFreeResellerMembershipSelectButton() {
		
		ClickWebElementByXpath(FreeResellerMembershipSelectButton);
	}
	
	
	
	
	
	
}
