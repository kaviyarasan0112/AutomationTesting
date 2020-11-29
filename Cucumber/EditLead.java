package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends BaseClass{

	
	@When("click on the link find leads")
	public void clickOnTheLinkFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@Then("Find Lead page should be displayed")
	public void findLeadPageShouldBeDisplayed() {
	   
	}

	@When("Click on the link phone")
	public void clickOnTheLinkPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Given("Enter the phone number as (.*)")
	public void enterThePhoneNumberAs(String phoneNo) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNo);
	}
	@When("click on the button FindLeads")
	public void clickOnTheButtonFindLeads () throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@And("click on the first lead link from the displayed")
	public void clickOnTheFirstLeadLinkFromTheDisplayed() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@When("Click on the link Edit")
	public void clickOnTheLinkEdit() {
		driver.findElementByLinkText("Edit").click();
	}

	@Given("Edit the companyname as (.*)")
	public void editTheCompanynameAsTCS(String cname) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(cname);
	}	
	@When("Click on the submit button")
	public void clickOnTheSubmitButton() {
		driver.findElementByName("submitButton").click();
	}
}		

