package Bajaj.Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bajaUtility.Base;

public class BajajPulsarNS extends Base 
{
	public WebDriver driver;
	public BajajPulsarNS bajajPulsarNS;

	public BajajPulsarNS(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//[text()='Key Features']")
	WebElement keyFeature;
	@FindBy(xpath="//div[@class='enquiryform enquirynow']/div/a")
	WebElement enquire;
	@FindBy(xpath="//div[@class='img-wrapper'][1]")
	WebElement tabone;
	@FindBy(xpath="//div[@class='img-wrapper'][2]")
	WebElement tabtwo;
	@FindBy(xpath="//div[@class='img-wrapper'][3]")
	WebElement tabthree;
	@FindBy(xpath="//ul[@class='exteriorColorPallet d-flex']/li[1]")
	WebElement black;
	@FindBy(xpath="//ul[@class='exteriorColorPallet d-flex']/li[2]")
	WebElement red;
	@FindBy(xpath="//ul[@class='exteriorColorPallet d-flex']/li[3]")
	WebElement white;
	@FindBy(xpath="//ul[@class='exteriorColorPallet d-flex']/li[4]")
	WebElement grey;
	
	
	public  void pulsarNs400() throws InterruptedException 
	{	
		driver.get((String) prop.get("BajajNS400"));
		enquire.click();
		Thread.sleep(2000);
		Base.moveTo(keyFeature, 1000,0);
		Thread.sleep(5000);
		Base.scrollwithJScript1500();
		Thread.sleep(2000);	
		Base.scrollwithJScript3000();
		
		
	}

	
	public void color() throws InterruptedException
	{
		black.click();
		Thread.sleep(2000);
		red.click();
		Thread.sleep(2000);
		white.click();
		Thread.sleep(2000);
		grey.click();
		Thread.sleep(2000);
	}
	
	
	
}
