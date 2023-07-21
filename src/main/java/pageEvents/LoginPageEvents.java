package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageObjects;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch el = new ElementFetch();
	public void verifyIfLoginPageisLoaded() {
		
		Assert.assertTrue(el.getWebElements("XPATH", LoginPageObjects.loginText).size()>0,"Element Present");
		
}
	public void enterCredentials() {
		
		el.getWebElement("XPATH", LoginPageObjects.email).sendKeys("mayank.nigam@gmail.com");
		el.getWebElement("XPATH", LoginPageObjects.password).sendKeys("mayank1234");
	}

}
