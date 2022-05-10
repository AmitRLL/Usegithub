package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.zerodhaHome;
import POM.zerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
import Utility.ScreenShot;
@Listeners(ListenerTest.class)
public class zerodhaHomeTest {
	WebDriver driver;
	@BeforeMethod
	public void callurl() throws EncryptedDocumentException, IOException
	{
		driver=Browser.openBrowser("https://kite.zerodha.com/");
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.enterusername(Excel.parametrization(0, 1, "Credential"));
		zerodhalogin.enterpassword(Excel.parametrization(1, 1, "Credential"));
		zerodhalogin.clickonlogin();
		zerodhalogin.enterpin(Excel.parametrization(2, 1, "Credential"), driver);
		zerodhalogin.clicksubmitpin();
		
	}
	@Test
	public void OpenHomePage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		zerodhaHome Home =new zerodhaHome(driver);
		Home.selectTatacoffee(driver);
		Home.clickBuy();
		
	}
	@Test
	public void SearchandBaystock() throws InterruptedException, IOException
	{
		zerodhaHome home = new zerodhaHome(driver);
		home.clickSearchbox("APOLLOTYER");
		home.clickSearchStock(driver,1);
		home.clickBuyStock();
		ScreenShot.takeScreenshot(driver, "Apollotyer");
		home.clickonCancel();
		
	}

}
