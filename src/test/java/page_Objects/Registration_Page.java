package page_Objects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import base_Page.Base_Page;

public class Registration_Page extends Base_Page {
	
	WebDriver driver;
	//Constructor
	public Registration_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	//Web Elements Locators
	@FindBy(xpath="//input[@id='input-firstname']") @CacheLookup private WebElement firstName;
	@FindBy(xpath="//input[@id='input-lastname']") @CacheLookup private WebElement lastName;
	@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement eMail;
	@FindBy(xpath="//input[@id='input-telephone']") @CacheLookup private WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']") @CacheLookup private WebElement passwordConfirm;
	@FindBy(xpath="//label[normalize-space()='Yes']") @CacheLookup private WebElement radio_yes;
	@FindBy(xpath="//input[@value='0']") @CacheLookup private WebElement radio_no;
	@FindBy(xpath="//input[@name='agree']") @CacheLookup private WebElement chkbx_agree;
	@FindBy(xpath ="//input[@value='Continue']") @CacheLookup private WebElement btn_continue;
	@FindBy(xpath = "//div[@id='content']/h1") @CacheLookup private WebElement account_Validation;
	//@FindBy(xpath="//input[@name='agree']") @CacheLookup private WebElement chkbx_agree;
	@FindBy(xpath = "//label[@class='radio-inline']")@CacheLookup private List<WebElement> yes_or_no;

	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", table);
	
	//Action methods
	public void set_First_name(String fname)
	{
		firstName.sendKeys(fname);
	}
	public void set_Last_name(String lname)
	{
		lastName.sendKeys(lname);
	}
	public void set_email(String email)
	{
		eMail.sendKeys(email);
	}
	public void set_telephoneNo(String tel_no)
	{
		telephone.sendKeys(tel_no);
	}
	public void set_Password(String pword)
	{
		password.sendKeys(pword);
	}
	public void set_ConfirmPassword(String cp)
	{
		passwordConfirm.sendKeys(cp);
	}
	public void select_Agree_CheckBox()
	{
		chkbx_agree.click();
		
		//js.executeScript("arguments[0].click();", chkbx_agree);
	}
	public void continue_Button()
	{
		assertEquals(btn_continue.isDisplayed(), true);
		btn_continue.click();
		//js.executeScript("arguments[0].click();", btn_continue);
		
	}
	public void select_newsletter(String radio)
	{
		for(WebElement ys:yes_or_no)
		{
			String yN =ys.getText();
			System.out.println(yN);
			if(yN.equals(radio))
			{
				ys.click();
				break;
			}
			else {System.out.println("program error");
			break;}
		}
	}
	public void select_yes_letter ()
	{
		radio_yes.click();
	}
	public void select_no_letter()
	{
		radio_no.click();
	}
	public void ac_validation()
	{
		if(account_Validation.getText().equals("Your Account Has Been Created!"))
		{
			System.out.println(account_Validation.getText());
		}
		else {System.out.println("Account not created");}
	}
	
}
