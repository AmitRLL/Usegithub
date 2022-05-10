package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.zerodhaForgotpassword;
import POM.zerodhaLogin;
import Pojo.Browser;

public class zerodhaForgotpasswordTest {
	WebDriver driver;
	@BeforeMethod
	public void loginpage()
	{
		driver=Browser.openBrowser("https://kite.zerodha.com/");
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.clickForgotpassword();
	}
	@Test
	public void verifylogo()
	{
		zerodhaForgotpassword forgotpass = new zerodhaForgotpassword(driver);
		forgotpass.checkLogo(driver);
		
	}
	@Test
	public void emailradioa()
	{
		zerodhaForgotpassword forgotpass = new zerodhaForgotpassword(driver);
		forgotpass.sendUserID("AJS15646");
		forgotpass.sendPan("BAFHJFH54HD");
		forgotpass.sendEmailorSMS("afhhfua@gmail.com");
		forgotpass.clickBacktoLogin();
	}
}
