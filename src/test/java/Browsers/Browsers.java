package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public WebDriver driver;
	

	public void OpenMyBrowser(String browserName) {
		browserName.toLowerCase();
		if (browserName.equals("chrome".toLowerCase())) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox".toLowerCase())) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	public void NavegettoWebpageUrl(String WebpageUrl) {
		driver.get(WebpageUrl);

	}

}