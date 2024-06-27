package Bajaj.Bike;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import bajaUtility.Base;

public class BajajTest {
	public WebDriver driver;;
	public BajajMainPage bajajMainPage;
	public BajajPulsarNS bajajPulsarNS;
	public Base base;
	
	@Test(dependsOnMethods = { "start" })
	public void engineStart() throws IOException 
	{
		Base.setupPro();
		Base.reprt.createTest("engineStart");
		driver = Base.browserStart();
		Base.reprt.flush();
	}

	@Test(dependsOnMethods = { "engineStart" })
	public void pulsarNs400() throws InterruptedException {

		Base.reprt.createTest("pulsarNs400");
		BajajPulsarNS bajajPulsarNS = new BajajPulsarNS(driver);
		bajajPulsarNS.pulsarNs400();
		Base.reprt.flush();

	}

	@Test(dependsOnMethods = { "pulsarNs400" })
	public void colorCheck() throws InterruptedException
	{
		Base.reprt.createTest("colorCheck");
		BajajPulsarNS bajajPulsarNS = new BajajPulsarNS(driver);
		bajajPulsarNS.color();
		Base.reprt.flush();

	}
	
}
