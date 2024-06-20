package Bajaj.Bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bajaUtility.Base;

public class BajajPulsarNS extends Base 
{
	public WebDriver driver;
	public BajajMainPage bajajMainPage;
	public BajajPulsarNS(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//[text()='News & Media']")
	WebElement nsEnquire ;
//	@FindBy(xpath="")
	


	
	
	
}
