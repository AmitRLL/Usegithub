package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWait {
	public static WebElement fluent(WebDriver driver,WebElement fluentwait)
	{
	FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(3000));
	wait.pollingEvery(Duration.ofMillis(50));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(fluentwait));
	return fluentwait;
	}

}
