package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileManagerPage extends BasePage{

	public FileManagerPage(WebDriver pDriver) {
		super(pDriver);
	}
	
	@FindBy(className="lux-icon-configuration")
	private WebElement menuConfiguration;
	
	@FindBy(xpath="//div[@class='header child item ng-tns-c1-12 ng-star-inserted']")
	private WebElement btnConfigurationAdmin;
	
	@FindBy(xpath="//a[contains(.,'File Manager')]")
	private WebElement btnFileManager;

	public FileManagerPage openFileManager() {
		getWait().until(ExpectedConditions.visibilityOf(menuConfiguration));
		menuConfiguration.click();
		getWait().until(ExpectedConditions.visibilityOf(btnConfigurationAdmin));
		btnConfigurationAdmin.click();
		getWait().until(ExpectedConditions.visibilityOf(btnFileManager));
		btnFileManager.click();
		return this;
	}
}
