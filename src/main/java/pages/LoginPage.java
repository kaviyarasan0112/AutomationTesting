package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	//action+elementname
	public LoginPage enterUsername(String username) throws InterruptedException {
		driver.findElementById(prop.getProperty("LoginPage.username.id")).sendKeys(username);
		//Thread.sleep(5000);
		return this;

	}
	
	public LoginPage enterPassword(String password) {
		
		driver.findElementById(prop.getProperty("LoginPage.password.id")).sendKeys(password);
		
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName(prop.getProperty("LoginPage.Login.Classname")).click();
		
		return new HomePage(driver,prop);

	}

}
