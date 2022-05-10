package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.fluentWait;

public class zerodhaLogin {
	@FindBy(xpath ="//input[@id='userid']")private WebElement userName;
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement clickLogin;
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitpin;
	@FindBy(xpath="//a[@class='text-light']")private WebElement clicksign;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotpassword;
	@FindBy(xpath="//a[@class='text-light']")private WebElement ifdonthaveaccountsingup;
	//constructor to use to call @FindBy Elements.
	public zerodhaLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterusername(String user)
	{
		userName.sendKeys(user);
    }
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickonlogin()
	{
		clickLogin.click();
	}
	public void enterpin(String pinnumber,WebDriver driver)
	{
	//	waiteExplecit.explecit(driver,pin);//explecit wait using instend og Thread.sleep
		fluentWait.fluent(driver, pin);//using fluentwait instend of Thread.sleep it is advance version.
		pin.sendKeys(pinnumber);
	}
	public void clicksubmitpin()
	{
		submitpin.click();
	}
	public void clickForgotpassword()
	{
		forgotpassword.click();
	}
	public void clicksingup()
	{
		ifdonthaveaccountsingup.click();
	}
	public void Switchtosignup(WebDriver driver)
	{
		Set address = driver.getWindowHandles();
		ArrayList<String>list = new ArrayList(address);
		driver.switchTo().window(list.get(1));
		//zerodhaSignup signUppage =new zerodhaSignup(driver);
	
	}


}
