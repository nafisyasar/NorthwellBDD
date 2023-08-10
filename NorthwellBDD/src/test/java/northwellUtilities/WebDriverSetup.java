package northwellUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetup {
	public static WebDriver driver;
	
	public static void SetUpChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void quitDriver() {
		driver.quit();
	}

}
