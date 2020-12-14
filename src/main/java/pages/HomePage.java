package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	public LoginPage clickLogout() {
		driver.findElementByClassName(prop.getProperty("HomePage.Logout.Classname")).click();
		
		return new LoginPage(driver,prop);
	}
	
	/*
	 * public MyHomePage clickCrmsfaLink() {
	 * driver.findElementByLinkText(prop.getProperty("HomePage.Crmsfa.LinkText")).
	 * click(); return new MyHomePage(driver,prop); }
	 */

}
