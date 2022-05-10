package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.zerodhaLogin;
import POM.zerodhaSignup;
import Pojo.Browser;

public class zerodhaSignupTest {
	WebDriver driver;
	@BeforeMethod
	public void callurl()
	{
		driver=Browser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void EnterMobileNumber()
	{
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.clicksingup();
		zerodhalogin.Switchtosignup(driver);
		zerodhaSignup signUppage =new zerodhaSignup(driver);
		String actualTitle=signUppage.getPageTitle(driver);
		String expectedTitle="Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
		Assert.assertEquals(actualTitle, expectedTitle);//Hard assertion
		signUppage.enterMobileNumber("8788186496");
		Assert.assertTrue(signUppage.clickOnLogo());//it return boolean value 
		
	  //signUppage.clickonContinue();
		
	}
	@Test
	public void checkLogo()
	{
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.clicksingup();
		zerodhalogin.Switchtosignup(driver);
		zerodhaSignup signUppage =new zerodhaSignup(driver);
		SoftAssert softassert = new SoftAssert();
		String actualTitle=signUppage.getPageTitle(driver);
		String expectedTitle="Signup and open a Zerodha trading and demat account online and start investing – Zerodh";
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertFalse(signUppage.clickOnLogo());
		signUppage.enterMobileNumber("8788186496");
		softassert.assertAll();
	}
	

}
