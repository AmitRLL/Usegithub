package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver openBrowser(String url)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\velocity-java-eclipse\\Zerodha\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
