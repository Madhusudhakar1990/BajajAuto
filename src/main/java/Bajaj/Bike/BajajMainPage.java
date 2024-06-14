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
	
	
	@FindBy(xpath="//a[@class='closebtn']") WebElement closeButton;
	@FindBy(xpath= "//a[text()='I Understand']") WebElement cookie;
	
	

public  void subsribeFrame() throws InterruptedException
{

//	this.driver = Base.browserStart();
//	bajajMainPage = new BajajMainPage(driver);
	
	driver.switchTo().frame("webpush-onsite");
	WebElement box  = driver.findElement(By.className("wrapper"));
	box.findElement(By.id("deny")).click();
	Thread.sleep(10000);
	

}
	
public void enquireBoard()
{
	System.out.println("driver got into enquiry :"+driver);
	closeButton.click();
	System.out.println("driver gotout of enquiry :"+driver);
}


public void cookieDisclaimer()
{
	cookie.click();
}

}
