package POM;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.fluentWait;

public class zerodhaHome {
	WebDriver driver;
	 WebElement Stocks;
	  @FindBy(xpath ="(//span[@class='tradingsymbol link-chart'])[1]")private WebElement nifty50;
	  @FindBy(xpath ="(//span[@class='tradingsymbol link-chart'])[2]")private WebElement sensex;
	  @FindBy(xpath ="//img[@alt='Kite logo']")private WebElement logo;
	  @FindBy(xpath ="//span[text()='Dashboard']")private WebElement dashboard;
	  @FindBy(xpath ="//span[text()='Orders']")private WebElement orders;
	  @FindBy(xpath ="//span[text()='Holdings']")private WebElement holding;
	  @FindBy(xpath ="Positions")private WebElement positions;
	  @FindBy(xpath ="//span[text()='Funds']")private WebElement fund;
	  @FindBy(xpath ="//span[text()='Apps']")private WebElement apps;
	  @FindBy(xpath ="//div[@id='avatar-43']")private WebElement login;
      @FindBy(xpath ="//span[text()='TATACOFFEE']")private WebElement tatacoffee ;//element of tatacoffee share.
	  @FindBy(xpath ="//button[@class='button-blue buy']")private WebElement buytatacoffee;//buy button of tatacoffee.
	  @FindBy(xpath ="//input[@placeholder='Search eg: infy bse, nifty fut weekly, gold mcx']")private WebElement searchbox ;
	  @FindBy(xpath ="//div[@class='marketwatch-sidebar marketwatch-wrap']//li//span//span")private List<WebElement> stock ;
	  @FindBy(xpath ="//button[@data-balloon='Buy']")private WebElement buy ;
	  @FindBy(xpath ="//button[@class='button-outline cancel']")private WebElement cancel;
	  //@Find(xpath ="")private WebElement ;
	  public zerodhaHome(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  public void clickNifty50icon()
	  {
		  nifty50.click();
	  }
	  public void clickSensexicon()
	  {
		  sensex.click();
	  }
	  public boolean clickLogoicon()
	  {
		 return logo.isDisplayed();
			 
	  }
	  public void clickDashbord()
	  {
		  dashboard.click();
	  }
	  public void clickOrders()
	  {
		  orders.click();
	  }
	  public void clickHolding()
	  {
		  holding.click();
	  }
	  public void clickPosition()
	  {
		  positions.click();
	  }
	  public void clickFund()
	  {
		  fund.click();
	  }
	  public void clickApps() 
	  {
		  apps.click();
	  }
	  public void clickLogin()
	  {
		  login.click();
	  }
	public void selectTatacoffee(WebDriver driver)//mouse action krne ke liye 
	{
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOf(tatacoffee));
		Actions action =new Actions(driver);
		action.moveToElement(tatacoffee).perform();;
	}
	public void clickBuy()
	{
		buytatacoffee.click();
	}
	public void clickSearchbox(String name) throws InterruptedException//search stock in search box.
	{
		Thread.sleep(1000);
		searchbox.sendKeys(name);
	}
	public void clickSearchStock(WebDriver driver,int i)//then perform mouse action on element which we search
	{
		WebDriverWait wait=new WebDriverWait(driver,3000);//this is explecit wait.
		wait.until(ExpectedConditions.visibilityOf(stock.get(i)));
		Actions action = new Actions(driver);
		action.moveToElement(stock.get(i)).perform();
		
	}
	public void clickBuyStock()//this is buy button found after performing search action
	{
		buy.click();//after searching stock perform buy action
	}
	public void clickonCancel()//perform action on hidden division popup
	{
		cancel.click();
	}
	
	
}
