package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import base_Page.Base_Page;

public class MyAcc_Page extends Base_Page{
	WebDriver driver;
	//Constructor
	public MyAcc_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	//Web elements locators
	@FindBy(xpath="(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")
	@CacheLookup private WebElement link_logout;
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	@CacheLookup private WebElement validate_myAccount;
	
	
	//Action Methods
	public void select_Logout_link()
	{
		link_logout.click();
	}
	
	public boolean validate_AcLogin()
	{
		try 
		{
			return(validate_myAccount.isDisplayed());
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return false;
		}
		
		
	}
	
	
}
