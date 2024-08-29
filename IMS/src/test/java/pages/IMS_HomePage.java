package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMS_HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//span [text()='Incidents']")
	WebElement Incidents;
	
	@FindBy(xpath = "//span [text()='Pending Closure']")
	WebElement PendingClosure;
	
	@FindBy(xpath = "//span [text()='Help']")
	WebElement Help;
	
	@FindBy(xpath = "//span [text()='Manuals']")
	WebElement Manuals;
	
	@FindBy(xpath = "//span [text()='Manage Alerts']")
	WebElement ManageAlerts;
	
	@FindBy(xpath = "//span [text()='Update My Townships']")
	WebElement UpdateMyTownships;
	
	@FindBy(xpath = "//span [text()='Log Off']")
	WebElement LogOut;
	
	public IMS_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickIncidents() {
		this.Incidents.click();
	}
	
	public void clickPendingClosure() {
		this.PendingClosure.click();
	}
	
	public void clickHelp() {
		this.Help.click();
	}
	
	public void clickManuals() {
		this.Manuals.click();
	}
	
	public void clickManageAlerts() {
		this.ManageAlerts.click();
	}
	
	public void clickUpdateMyTownships() {
		this.UpdateMyTownships.click();
	}
	
	public void clickLogOut() {
		this.LogOut.click();
	}
}
