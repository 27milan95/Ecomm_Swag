package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class CommonMethods extends BaseClass{
	
	public WebElement getElementByText(String text) {
		return browser.findElement(By.xpath("//*[text()='"+text+"']"));
	}
	
	public WebElement getElementByClass(String Class) {
		return browser.findElement(By.xpath("//*[@class='"+Class+"']"));
	}

}
