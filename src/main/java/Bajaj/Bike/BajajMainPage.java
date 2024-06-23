package Bajaj.Bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bajaUtility.Base;

public class BajajMainPage extends Base 
{
	public WebDriver driver;
	public BajajMainPage bajajMainPage;
	
	public BajajMainPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='closebtn']")
	WebElement closeButton;
	@FindBy(xpath = "//a[text()='I Understand']")
	WebElement cookie;
	@FindBy(xpath = "//span[@class='disclaimer']")
	WebElement disclaimer;
	@FindBy(xpath = "//div[text()='News & Media']")
	WebElement newsMedia;
	@FindBy(xpath="//span[@class='cascade-slider_arrow cascade-slider_arrow-right']")
	WebElement rightArrow;
	@FindBy(xpath="//span[@class='cascade-slider_arrow cascade-slider_arrow-left']")
	WebElement leftArrow;
	@FindBy(xpath="//div[@class='carousel-caption']/p[1]")
	WebElement bikeName;
	@FindBy(xpath="//div[@class='carousel-caption']/a")
	WebElement explore;
	

	public void subsribeFrame() throws InterruptedException {
		driver.switchTo().frame("webpush-onsite");
		WebElement box = driver.findElement(By.className("wrapper"));
		box.findElement(By.id("deny")).click();
		Thread.sleep(10000);
	}

	public void cookieDisclaimer() {
		cookie.click();
	}

	public void enquireBoard() {
		closeButton.click();
	}

	public void move() throws InterruptedException {
		Base.moveTo(disclaimer);
		ac.moveToElement(newsMedia).build().perform();
		Thread.sleep(5000);
	}

	public void searchBike() throws InterruptedException {

		rightArrow.click();
		Thread.sleep(500);
		rightArrow.click();
		Thread.sleep(500);
		leftArrow.click();
		Thread.sleep(500);
		rightArrow.click();
		Thread.sleep(500);
		rightArrow.click();
		Thread.sleep(500);
		leftArrow.click();
		
	}



}
