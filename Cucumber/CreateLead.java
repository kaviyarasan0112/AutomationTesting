package steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("click on crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

	}
	@Then("MyHome page should be displayed")
	public void verifyMyHomePage() {
		 String ActualTitle = driver.getTitle();
		 String ExpectedTitle="My Home | opentaps CRM";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@When("click on the leads link")
	public void clickOnTheLeadsLink() {
		driver.findElementByLinkText("Leads").click();    
	}

	@Then("My Leads should be displayed")
	public void myLeadsShouldBeDisplayed() {
		 String ActualTitle = driver.getTitle();
		 String ExpectedTitle="My Leads | opentaps CRM";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	@When("click on the create lead link")
	public void clickOnTheCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Then("CreateLead Page should be displayed")
	public void createleadPageShouldBeDisplayed() {
		 String ActualTitle = driver.getTitle();
		 String ExpectedTitle="Create Lead | opentaps CRM";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	   
	}
	@Given("Enter the companyname as (.*)")
	public void enterTheCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}
	@And("Enter the firstname as (.*)")
	public void enterTheFirstname(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	}
	@And("Enter the lastname as (.*)")
	public void enterTheLastname(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	}
	@When("Click on the link Create Lead")
	public void clickOnTheCreateLead() {
		driver.findElementByName("submitButton").click();
	}
	@Then("View Lead Page should be displayed")
	public void viewLeadPageDisplayed() {
		String ActualTitle = driver.getTitle();
		 String ExpectedTitle="View Lead | opentaps CRM";
		 Assert.assertEquals(ActualTitle, ExpectedTitle);	
	}	
}
