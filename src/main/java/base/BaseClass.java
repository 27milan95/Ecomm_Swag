package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver browser;
	
	public void OpenBrowser(String BrowserName, String URL) {
		if(BrowserName == "Chrome") {
			browser = new ChromeDriver();
		}	
		if(BrowserName == "FireFox") {
			browser = new FirefoxDriver();
		}	
		browser.manage().window().maximize();
		browser.get(URL);		
	}
	
	public void CloseBrowser() {
		browser.close();
	}
	

}
