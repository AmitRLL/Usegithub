package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.zerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
import Utility.Reports;
@Listeners(ListenerTest.class)//i am using listener only for failed test
public class zerodhaLoginTest extends BaseTest {
	ExtentReports report;
	ExtentTest test;//it is save report from ExtentReport in it
	@BeforeClass
	public void setReports(){
		 report=Reports.addReport();
	}
	@BeforeMethod
	public void callurl()
	{
		driver=Browser.openBrowser("https://kite.zerodha.com/");
	}
	@AfterMethod
	public void captureResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterClass
	public void fulshResult()
	{
		report.flush();
	}
	@Test
	public void loginwithValidCredential() throws EncryptedDocumentException, IOException
	{
		test=report.createTest("loginwithValidCredential");
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.enterusername(Excel.parametrization(0, 1, "Credential"));
		zerodhalogin.enterpassword(Excel.parametrization(1, 1, "Credential"));
		zerodhalogin.clickonlogin();
		zerodhalogin.enterpin(Excel.parametrization(2, 1, "Credential"), driver);
		zerodhalogin.clicksubmitpin();
		//Assert.assertTrue(false);
	}
	@Test
	public void loginwithInvalidCredential()
	{
		test=report.createTest("loginwithInvalidCredential");
		zerodhaLogin zerodhalogin = new zerodhaLogin(driver);
		zerodhalogin.enterusername("AEK465");
		zerodhalogin.enterpassword("fhaieja");
		zerodhalogin.clickonlogin();
	}
	@Test
	public void clickonForgotPassword()
	{
		test=report.createTest("clickonForgotPassword");
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.clickForgotpassword();
	}
	@Test
	public void clickonNewSingup()
	{
		test = report.createTest("clickonNewSingup");
		zerodhaLogin zerodhalogin =new zerodhaLogin(driver);
		zerodhalogin.clicksingup();
	}

}
