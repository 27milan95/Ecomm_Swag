package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	//WebDriver browser;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement UserNameTab;
	
	@FindBy(id = "password")
	private WebElement PasswordTab;
	
	@FindBy(id = "login-button")
	private WebElement LoginButton;
	
	public LoginPage() {
		PageFactory.initElements(browser, this);
	}
	
	public void enterUserName(String username) {
		UserNameTab.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PasswordTab.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LoginButton.click();
	}
	
	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
		
	}
}
