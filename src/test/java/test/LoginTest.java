package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import junit.framework.Assert;
import pages.LoginPage;
import utilities.CommonMethods;

public class LoginTest extends BaseClass {
	
	LoginPage loginpage;
	CommonMethods commonmethod;
	
	@BeforeMethod
	public void initialseBrowser() {
		OpenBrowser("Chrome", "https://www.saucedemo.com/");		
		loginpage = new LoginPage();
		commonmethod = new CommonMethods();
	}
	
//	public void verifyUserNameTab() {
//		
//	}
//	
//	public void verifyPasswordTab() {
//		
//	}
//	
//	public void verifyloginButton() {
//		
//	}
	
	@Test
	public void verifyCorrectLoginCredentials() {
		loginpage.login("standard_user", "secret_sauce");
		String ActualTitle = commonmethod.getElementByClass("title").getText();
		//Assert.assertEquals(ActualTitle, "Products");
	}
	
//	public void verifyInCorrectLoginCredentials() {
//		
//	}
	@AfterMethod
	public void tearDownBrowser() {
		CloseBrowser();
	}
	
}
