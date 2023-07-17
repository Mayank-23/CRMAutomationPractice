package pageEvents;

import pageObjects.HomePageObjects;
import utils.ElementFetch;

public class HomePageEvents {
	
	ElementFetch el = new ElementFetch();
	public void signInButton() {
		el.getWebElement("XPATH", HomePageObjects.signInButtonText).click();
	}

}
