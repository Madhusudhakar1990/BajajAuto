package Bajaj.Bike;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import bajaUtility.Base;

public class BajajTest 
{
	public WebDriver driver;;
	public BajajMainPage bajajMainPage;
	public static Base base;

//	@BeforeTest
//	public void engineStart() throws IOException 
//	{
//		Base.setupPro();
//		driver = Base.browserStart();
//	}

	@Test(dependsOnMethods={"start"})
	public void pulsarNs400() throws InterruptedException 
	{
		System.out.println("bajaj test");
	}
	
	
	

//	@AfterTest
//	public void browserStopTest() throws InterruptedException 
//	{
//		base = new Base(driver);
//		Base.browserStop();
//		Thread.sleep(0);
//
//	}

}
