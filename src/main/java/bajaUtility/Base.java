package bajaUtility;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base extends Listeners
{

	public static WebDriver driver;
	public static Properties prop;
	public static Actions ac;
	public static WebDriverWait wait;
	public static ExtentReports reprt;
	public static ExtentSparkReporter report;

	public Base(WebDriver driver) {
		Base.driver = driver;
	}

	public static void setupPro() throws IOException {
		prop = new Properties();
		String path = "C:\\Users\\ymadh\\eclipse-workspace\\Bike\\src\\main\\java\\bajaUtility\\Bike.properties";
		FileReader read = new FileReader(path);
		prop.load(read);

	}

	public static ExtentReports report() {
		String reportPath = "C:\\Users\\ymadh\\eclipse-workspace\\Bike\\BajajReport\\BajajAuto.html";
//		String reportPath = System.getProperty("user.dir")+"//Report//Bajaj.html";
//		
		report = new ExtentSparkReporter(reportPath);
//		
		report.config().setDocumentTitle("Bajaj report");
		report.config().setReportName("TestIng NG report");

		reprt = new ExtentReports();
		reprt.attachReporter(report);
		reprt.setSystemInfo("Tester", "Madhu");

		System.out.println("Reporting is done ");
		
		return reprt;

	}

	public static WebDriver browserStart() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String url = prop.getProperty("url");
		driver.get(url);

		return driver;
	}

	public static void moveTo(WebElement ele) {
		ac = new Actions(driver);
		ac.moveToElement(ele).click().build().perform();
	}

	public static void moveTo(WebElement ele, int ne, int na) {
		ac = new Actions(driver);
		ac.moveToElement(ele, ne, na);
	}

	public static void scrollwithJScript1500() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)");
	}

	public static void scrollwithJScript3000() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000)");
	}

	public static void waiting(WebElement closeButton) {
		ac = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		System.out.println("test location ");
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));

	}

	public static void browserStop() {
		driver.quit();
	}

}
