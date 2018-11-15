package pages;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddDetailPage extends BasePage {

	Actions mouseOver;
	
	public AddDetailPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="detailCode")
	private WebElement txtCode;
	
	@FindBy(id = "description")
	private WebElement txtDescription;
	
	@FindBy(id = "detailType")
	private WebElement selectdetailType;
	
	@FindBy(xpath="//*[@id=\"detailType\"]/option[2]")
	private WebElement optionHistorical;
	
	@FindBy(id="isDataEditable5")
	private WebElement cbxIsEditable;
	
	@FindBy(xpath="//a[@class='ng-star-inserted']")
	private WebElement iconAddNew;
	
	@FindBy(id="detailColumnCode")
	private WebElement txtdetailColumnCode;
	
	@FindBy(id="dataType")
	private WebElement selectdataType;
	
	@FindBy(xpath="//*[@id=\"dataType\"]/option[4]")
	private WebElement optionDatetime;
	
	@FindBy(xpath="/html/body/modal-container/div/div/transcend-dynamic-form-modal/div[3]/button[1]")
	private WebElement btnSaveDetailColumn;

	@FindBy(how = How.CSS, using=".actions > li:nth-child(1)")
//	@FindBy(xpath="//span[contains(.,'Save')]")
//	@FindBy(how = How.CSS, using="span.btn.btn-primary")
	private WebElement btnSaveDetail;
	
	public AddDetailPage addNewDetail() {
		Date date = new Date();
		getWait().until(ExpectedConditions.visibilityOf(txtCode));
		txtCode.sendKeys("test" + date.getHours() + date.getMinutes() + date.getYear()+ date.getMonth()+ date.getDay());
		getWait().until(ExpectedConditions.visibilityOf(txtDescription));
		txtDescription.sendKeys("test");
		getWait().until(ExpectedConditions.visibilityOf(iconAddNew));
		iconAddNew.click();
		addNewDetailColum();
		Actions clickSave = new Actions(getDriver());
//		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		getWait().until(ExpectedConditions.visibilityOf(btnSaveDetail));
		clickSave.moveToElement(btnSaveDetail).click().build().perform();
//		getWait().until(ExpectedConditions.visibilityOf(btnSaveDetail));
//		btnSaveDetail.click();
		return this;
	}
	
	public AddDetailPage addNewDetailColum() {
		getWait().until(ExpectedConditions.visibilityOf(txtdetailColumnCode));
		txtdetailColumnCode.sendKeys("Date");
		getWait().until(ExpectedConditions.visibilityOf(selectdataType));
		selectdataType.click();
		getWait().until(ExpectedConditions.visibilityOf(optionDatetime));
		mouseOver = new Actions(getDriver());
		mouseOver.moveToElement(optionDatetime).perform();
		optionDatetime.click();
		getWait().until(ExpectedConditions.visibilityOf(btnSaveDetailColumn));
		btnSaveDetailColumn.click();
		return this;
	}
}
