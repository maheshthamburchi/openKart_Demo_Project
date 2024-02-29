package test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_test.Base_Test_Class;
import page_Objects.Home_Page;
import page_Objects.Login_Page;
import page_Objects.MyAcc_Page;

public class TC2_Login_Test extends Base_Test_Class{

	@Test
	public void login_Test()
	{
		Home_Page hp=new Home_Page(driver);
		hp.myAc_select();
		logger.info("clicked on my account");
		hp.login_select();		
		logger.info("clicked on my select");
		
		Login_Page lp=new Login_Page(driver);
		
		lp.enter_email(p.getProperty("EMAIL"));
		lp.enter_password(p.getProperty("PASSWORD"));
		lp.login_Click();
		logger.info("login details entered and clicked on login button");
		
		MyAcc_Page myAcc=new MyAcc_Page(driver);
		boolean result = myAcc.validate_AcLogin();
		if(result==true)
		{
			logger.info("login test passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("login test failed");
		Assert.fail();
		}
		
		
		myAcc.select_Logout_link();
	
	
	
	
	}
	
}
