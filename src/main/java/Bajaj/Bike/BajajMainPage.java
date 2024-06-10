package Bajaj.Bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bajaUtility.Base;

public class BajajMainPage extends Base
{
	public   WebDriver driver;
	public   BajajMainPage bajajMainPage;


	public BajajMainPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

public  void subsribeFrame() throws InterruptedException
{

//	this.driver = Base.browserStart();
//	bajajMainPage = new BajajMainPage(driver);
	
	driver.switchTo().frame("webpush-onsite");
	WebElement box  = driver.findElement(By.className("wrapper"));
	box.findElement(By.id("deny")).click();
	Thread.sleep(10000);
	

}
	
}
