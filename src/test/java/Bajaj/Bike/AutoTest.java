package Bajaj.Bike;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bajaUtility.Base;

public class AutoTest {

	public WebDriver driver;;
	public BajajMainPage bajajMainPage;
	public static Base base;

	@BeforeTest
	public void engineStart() throws IOException 
	{

		Base.setupPro();
		driver = Base.browserStart();

	}

	@Test
	public void start() throws InterruptedException 
	{

		bajajMainPage = new BajajMainPage(driver);
		Thread.sleep(5000);
		bajajMainPage.subsribeFrame();

	}

	@Test(dependsOnMethods = { "start" })
	public void removeEnquiry() throws InterruptedException 
	{
		bajajMainPage = new BajajMainPage(driver);
		bajajMainPage.enquireBoard();
		Thread.sleep(5000);
	}

	@Test(dependsOnMethods = { "start", "removeEnquiry" })
	public void removeCookieDisclaimer() 
	{
		bajajMainPage = new BajajMainPage(driver);
		bajajMainPage.cookieDisclaimer();
	}

	@AfterTest
	public void browserStopTest() throws InterruptedException 
	{

		base = new Base(driver);
		Base.browserStop();

		Thread.sleep(0);

		// String name = new String();

	}

}
