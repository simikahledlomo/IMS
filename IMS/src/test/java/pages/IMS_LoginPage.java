package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMS_LoginPage {
	WebDriver driver;
	
	@FindBy(id = "UserName")
	WebElement UserName;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = ".//button[@type = 'submit']")
	WebElement signIn;
	
	public IMS_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		this.UserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickBtnSignIn() {
		this.signIn.click();
	}
	
	public void logIn(String username, String password) {
		this.UserName.sendKeys(username);
		this.password.sendKeys(password);
		this.signIn.click();
	}
}
