package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaSignup {
	@FindBy(xpath ="//img[@class='logo-img']")private WebElement logo ;
	@FindBy(xpath="(//a[text()='Signup'])[1]")private WebElement signUP;
	@FindBy(xpath = "//a[text()='About']")private WebElement about;
	@FindBy(xpath="(//a[text()='Products'])[1]")private WebElement product;
	@FindBy(xpath="(//a[text()='Pricing'])[1]")private WebElement pricing;
	@FindBy(xpath="(//a[text()='Support'])[1]")private WebElement support;
	@FindBy(xpath="//div[@id='menu_btn']")private WebElement manu;
	@FindBy(xpath = "//input[@id='user_mobile']" )private WebElement mobileno;
	@FindBy(xpath ="//button[@id='open_account_proceed_form']")private WebElement continuebutton;
	
	public zerodhaSignup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	public boolean clickOnLogo()
	{
		return logo.isDisplayed();
	}
	public void clickOnSignup()
	{
		signUP.click();
	}
	public void clickcOnAbout() {
		about.click();
	}
	public void clickOnProduct()
	{
		product.click();
	}
	public void clickOnSupport()
	{
		support.click();
	}
	public void clickOnManu()
	{
		manu.click();
	}
	public void enterMobileNumber(String mobino)
	{
		mobileno.sendKeys(mobino);
	}
	public void clickonContinue()
	{
		continuebutton.click();
	}


}
