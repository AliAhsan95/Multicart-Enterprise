package Browsers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
	WebDriver driver;
	Browsers browser;
	public void OpenMyBrowser(String browserName) {
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		} else if(browserName.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
		}
	}
	
	public void NavegettoWebpageUrl(String WebpageUrl) {
		driver.get(WebpageUrl);
		
	}
	
	

}