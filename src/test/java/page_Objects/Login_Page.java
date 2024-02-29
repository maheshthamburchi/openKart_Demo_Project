package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import base_Page.Base_Page;

public class Login_Page extends Base_Page {
	WebDriver driver;
	//constructor
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//Web Elements locators

	@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement login_password;
	@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement login_eMail;
	@FindBy(xpath="//input[@value='Login']") @CacheLookup private WebElement btn_login;

	//Action Methods
	
	public void enter_email(String mail)
	{
		login_eMail.sendKeys(mail);
	}

	public void enter_password(String pw)
	{
		login_password.sendKeys(pw);
	}
	
	public void login_Click()
	{
		btn_login.click();
	}
	
	
	
	
	
}
