package bajaUtility;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base(WebDriver driver) 
	{
			Base.driver = driver ;
			

	}

	public static void setupPro() throws IOException {
		prop = new Properties();
		String path = "C:\\Users\\ymadh\\eclipse-workspace\\Bike\\src\\main\\java\\bajaUtility\\Bike.properties";
		FileReader read = new FileReader(path);
		prop.load(read);

	}

	public static WebDriver  browserStart() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String url = prop.getProperty("url");
		driver.get(url);
	
		return driver;

	}

	public static void browserStop() {
		
	
		driver.quit();
	
		

	}
}