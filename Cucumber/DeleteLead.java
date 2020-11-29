package steps;

import cucumber.api.java.en.When;

public class DeleteLead extends BaseClass{
	
	@When ("Click on the button delete")
	public void clickOnTheButtonDelete() {
		driver.findElementByLinkText("Delete").click();
	}
	@When("Give the LeadID as (.*)")
	public void giveTheLeadID(String Leadid) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(Leadid);
	}
	
	

}
