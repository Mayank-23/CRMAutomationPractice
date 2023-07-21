package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageObjects.HomePageObjects;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	
	ElementFetch el = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
  @Test
  public void sampleMethodforEnteringCredetials() {
	  
	  homePage.signInButton();
	  loginPage.verifyIfLoginPageisLoaded();
	  loginPage.enterCredentials();
	  
  }
}
