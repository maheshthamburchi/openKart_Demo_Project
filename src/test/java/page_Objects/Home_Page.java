package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import base_Page.Base_Page;

public class Home_Page extends Base_Page{

	WebDriver driver;
	//Constructor
	 public Home_Page(WebDriver driver) 
	{
		super(driver);
		}
	
	//Web Elements Locators
	//https://demo.opencart.com/

@FindBy(xpath="//span[normalize-space()='My Account']") @CacheLookup private WebElement myAccount;
@FindBy(xpath="//a[normalize-space()='Register']") @CacheLookup private WebElement register;
@FindBy(xpath="//a[normalize-space()='Login']") @CacheLookup private WebElement login;
	
//Action methods
public void myAc_select()
{
	myAccount.click();
}
public void register_select()
{
	register.click();
}
public void login_select()
{
	login.click();
}
	
	
	
	
}
