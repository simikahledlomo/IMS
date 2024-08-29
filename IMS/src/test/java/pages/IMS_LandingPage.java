package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMS_LandingPage {
WebDriver driver;
	
	@FindBy(xpath = ".//li[@class =' waves-effect']//span [text()='Login']")
	WebElement IMS_login;
	
	public IMS_LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicksIMS_login() {
		this.IMS_login.click();
	}
}
