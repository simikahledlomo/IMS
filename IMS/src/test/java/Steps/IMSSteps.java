package Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IMS_HomePage;
import pages.IMS_LandingPage;
import pages.IMS_LoginPage;
import sharedServices.PublicFunctions;

public class IMSSteps {
	WebDriver driver;
	IMS_LandingPage land; 
	IMS_LoginPage login;
	IMS_HomePage ims;
	PublicFunctions publicFun;
	
	
	@Given("IMS baseURL {string} browser {string}")
	public void ims_base_url_browser(String baseURL, String browser) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get(baseURL);
	}

	@When("User clicks IMS login Link")
	public void user_clicks_ims_login_link() throws InterruptedException {
		land = new IMS_LandingPage(driver);
		Thread.sleep(500);
		land.clicksIMS_login();
		Thread.sleep(500);
	}

	@When("User enters valid username {string} and passwod {string} and click login button")
	public void user_enters_valid_username_mbuyiseni_msomi_and_passwod_crm101_and_click_login_button (String username, String password) throws InterruptedException {
		login = new IMS_LoginPage(driver);
		login.logIn(username, password);
		Thread.sleep(500);
	}

	@Then("User clicks incidents")
	public void user_clicks_incidents() {
		ims = new IMS_HomePage(driver);
	    ims.clickIncidents();
	}

	@Then("User clicks pending closure")
	public void user_clicks_pending_closure() throws InterruptedException {
		ims = new IMS_HomePage(driver);
		ims.clickPendingClosure();
		Thread.sleep(500);
	}

	@Then("User clicks help")
	public void user_clicks_help() {
		ims = new IMS_HomePage(driver);
		ims.clickHelp();
	}

	@Then("User clicks manuals")
	public void user_clicks_manuals() throws InterruptedException {
		ims = new IMS_HomePage(driver);
		ims.clickManuals();
		Thread.sleep(500);
	}

	@Then("User clicks manage alerts")
	public void user_clicks_manage_alerts() {
		ims = new IMS_HomePage(driver);
		ims.clickManageAlerts();
	}

	@Then("User clicks update my townships")
	public void user_clicks_update_my_townships() throws InterruptedException {
		ims = new IMS_HomePage(driver);
		ims.clickUpdateMyTownships();
		Thread.sleep(500);
	}

	@Then("User clicks log off")
	public void user_clicks_log_off() throws InterruptedException {
		ims = new IMS_HomePage(driver);
		ims.clickLogOut();
		Thread.sleep(500);
	}

	@Then("Good Bye browser")
	public void good_bye_browser() {
		driver.quit();
	}
}
