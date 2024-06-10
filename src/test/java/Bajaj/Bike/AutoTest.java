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
	public void engineStart() throws IOException {

		Base.setupPro();
		driver = Base.browserStart();

	}

	@Test
	public void start() throws InterruptedException {

		bajajMainPage = new BajajMainPage(driver);
		Thread.sleep(5000);
		bajajMainPage.subsribeFrame();

	}

	@AfterTest
	public void browserStopTest() {

		base = new Base(driver);
		Base.browserStop();

	}

}
