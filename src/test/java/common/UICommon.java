package common;

import core.config.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UICommon {
	protected WebDriver driver;

	@BeforeMethod()
	public void setUp()
	{
		driver = DriverSingleton.getDriver();
	}

	@AfterMethod(alwaysRun = true)
	public void stopBrowser()
	{
		DriverSingleton.closeDriver();
	}
}
