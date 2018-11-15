package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddDetailPage;
import pages.LoginPage;
import pages.MenuPage;

public class LoginTests extends BaseTests{
	
	@DataProvider(name = "credentials")
	public Object[][] statusValidation() {
		return new Object[][] { 
				{ "nancy.melgoza@luxfts.com", "#NaNc&10." }};
	}
	
	@Test(dataProvider = "credentials")
	public void loginTest(String user, String password) {
		LoginPage login = new LoginPage(myDriver.getDriver());
		login.login(user, password);
		MenuPage menu = new MenuPage(myDriver.getDriver());
		menu.addNewDetail();
		AddDetailPage addDetailPage = new AddDetailPage(myDriver.getDriver());
		addDetailPage.addNewDetail();
	}
}
