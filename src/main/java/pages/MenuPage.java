package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage{

	public MenuPage(WebDriver pDriver) {
		super(pDriver);
	}
	
	@FindBy(className="lux-icon-vertical-hamburger")
	private WebElement menu;
	
	@FindBy(xpath = "\"//span[@class='fa fa-caret-left']\"")
	private WebElement menuExpand;
	
	@FindBy(className="lux-icon-configuration")
	private WebElement menuConfiguration;
	
	@FindBy(className="ng-tns-c1-5")
	private WebElement spanGeneral;
	
	@FindBy(xpath="//a[contains(.,'Details')]")
	private WebElement detailsOption;

	@FindBy(xpath="//i[@class='toolbar-action lux-icon-add']")
	private WebElement addDetailIcon;
	
	public MenuPage addNewDetail() {
		getWait().until(ExpectedConditions.visibilityOf(menuConfiguration));
		menuConfiguration.click();
		getWait().until(ExpectedConditions.visibilityOf(spanGeneral));
		spanGeneral.click();
		getWait().until(ExpectedConditions.visibilityOf(detailsOption));
		detailsOption.click();
		getWait().until(ExpectedConditions.visibilityOf(addDetailIcon));
		addDetailIcon.click();
		return this;
	}
	
}
