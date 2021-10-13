package pageobjectmodel;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class VandorsSignupPage extends Parentpage{

	public VandorsSignupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String vandorlink = "//i[@class='fa fa-user icn-fo']";
	String vandorpage = "//h2[@class='text-center']";
	String registerlink ="//a[@class='textlink2']";
	String selectbutton ="//input[@type='button']";
	
	String usernamefield="//input[@type='text']";
	
	
	
	
	
	
	String ramdomelastname;
	String username;
	String password;
	String cpassword;
	String firstName;
	String lastName;
	String addressline1;
	String addressline2;
	String city;
	String unitedstate;
	String sellectstate;
	String zip;
	String company;
	String website;
	String phone;
	String email;
	
	
	
	
	

	public void CreateAccountForNewUser(String firstName, String lastName) {
		// TODO Auto-generated method stub
		lastName=lastName.toLowerCase().trim();
		if(lastName.contains("generateNew".toLowerCase().trim())) {
			String timeStamp= new SimpleDateFormat("YYYY.MM.dd.HH.ss").format(new Date());
			ramdomelastname = timeStamp;
			username = firstName+ramdomelastname;
			password="password";
			cpassword = "password";
			lastName="example";
			addressline1="690 E38st";
			addressline2="628 Foster av";
			city="brooklyn";
			unitedstate="america";
			sellectstate="new york";
			zip="11210";
			company="soho news";
			website="www.sohonews.com";
			phone="2023023136";
			email="sohonews@gmail.com";
			
			
			
		}
		
		
		
		EnterValueOnWebElementByXpath(usernamefield,username);
		
		
		
	}
	
	
	
	
	
	
	public void ClickVndorLink() {
		// TODO Auto-generated method stub
		ClickWebElementByXpath(vandorlink);
		
	}




	public String GetActualVandorsTitleText() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementByXpath(vandorpage);
	}




	public void ClickVndorRegisterLink() {
		// TODO Auto-generated method stub
		ClickWebElementByXpath(registerlink);
	}

	public void ClickSlectButton() {
		// TODO Auto-generated method stub
		ClickWebElementByXpath(selectbutton);
		
	}




	
	
	
	
	
	
	

}
