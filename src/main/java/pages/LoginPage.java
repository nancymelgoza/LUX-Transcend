package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://qa.luxtranscend.com");
	}
	//Login Elements
	@FindBy(id="i0116")
	private WebElement txtUser;
	
	@FindBy(id="i0118")
	private WebElement txtPassword;
	
	@FindBy(id="idSIButton9")
	private WebElement btnNext;
	
	@FindBy(id="idBtn_Back")
	private WebElement btnBack;
	
	@FindBy(id="idSIButton9")
	private WebElement btnSignIn;
	
	public LoginPage login(String user, String password) {
		getWait().until(ExpectedConditions.visibilityOf(txtUser));
		txtUser.sendKeys(user);
		getWait().until(ExpectedConditions.visibilityOf(btnNext));
		btnNext.click();
		getWait().until(ExpectedConditions.visibilityOf(txtPassword));
		txtPassword.sendKeys(password);
		getWait().until(ExpectedConditions.visibilityOf(btnSignIn));
		btnSignIn.click();
		return this;
	}
}
