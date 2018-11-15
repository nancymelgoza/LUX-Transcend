package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import driver.MyDriver;

public class BaseTests {
	
	MyDriver myDriver;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
	}
//	@AfterTest
	    public void afterTest () {
	        if (myDriver != null) {
	        	myDriver.getDriver().quit();
	        }
	}
}	
