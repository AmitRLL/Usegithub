package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.fluentWait;

public class zerodhaForgotpassword {
	@FindBy(xpath="//img[@alt='Kite']")private WebElement logo ;
	@FindBy(xpath="//label[@class='su-radio-label']")private WebElement rememberRadio ;
	@FindBy(xpath="//input[@id='radio-31']")private WebElement forgotRadio ;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan ;
	@FindBy(xpath="//input[@id='radio-36']")private WebElement emailRadio ;
	@FindBy(xpath="//input[@id='radio-64']")private WebElement smsRadio ;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement emailorsmstab ;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement resetbutton;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin ;
	
	
	public zerodhaForgotpassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean checkLogo(WebDriver driver)
	{
		fluentWait.fluent(driver,logo );
		return logo.isDisplayed();
	}
	public boolean clickonRememberRadio(WebDriver driver)
	{
		fluentWait.fluent(driver,rememberRadio );
		//rememberRadio.click();
		return rememberRadio.isSelected();
		
	}
	public void clickonForgotRadio(WebDriver driver)
	{
		fluentWait.fluent(driver,forgotRadio );
		forgotRadio.click();
	}
	public void sendUserID(String userId)
	{
		userid.sendKeys(userId);
	}
	public void sendPan(String panno)
	{
		pan.sendKeys(panno);
	}
	public void clickEmailradio()
	{
		emailRadio.click();
	}
	public void clickSmsradio()
	{
		smsRadio.click();
	}
	public void sendEmailorSMS(String email)
	{
		emailorsmstab.sendKeys(email);
	}
	public void clickBacktoLogin()
	{
		backtologin.click();
	}
	

}

