package Bajaj.Bike;

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
		Base.report();
		driver = Base.browserStart();
	}

	@Test
	public void start() throws InterruptedException 
	{
		Base.reprt.createTest("start ");
		bajajMainPage = new BajajMainPage(driver);
		Thread.sleep(5000);
		bajajMainPage.subsribeFrame();
		driver.navigate().refresh();
		bajajMainPage.cookieDisclaimer();
		driver.navigate().refresh();
		bajajMainPage.enquireBoard();
		bajajMainPage.move();
		Thread.sleep(5000);
		bajajMainPage.searchBike();
		Base.browserStop();
		Base.reprt.flush();
	}
	
//	Base.reprt.createTest("main url started ");
//	Base.reprt.flush();
	
	

//	@AfterTest
//	public void browserStopTest() throws InterruptedException 
//	{
//		base = new Base(driver);
//	//	Base.browserStop();
//	
//
//	}

}
