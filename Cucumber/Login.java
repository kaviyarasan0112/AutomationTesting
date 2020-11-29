package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass{
	
	/*
	 * @Given("Launch the chrome browser") public void launchTheChromeBrowser() {
	 * System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 * driver = new ChromeDriver(); driver.manage().window().maximize(); }
	 * 
	 * @Given("Load the application URL") public void loadTheApplicationURL() {
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
	 */

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String username) {
		driver.findElementById("username").sendKeys(username);
	    
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@When("Click on the login button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {
		 String ActualTitle = driver.getTitle();
		 String ExpectedTitle="Leaftaps - TestLeaf Automation Platform";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@But("Error Message should be displayed")
	public void ErrorMessageShouldBeDisplayed() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Leaftaps - TestLeaf Automation Platform";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	
		
}
