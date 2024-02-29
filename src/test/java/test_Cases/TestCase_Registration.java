package test_Cases;

import org.testng.annotations.Test;

import base_test.Base_Test_Class;
import page_Objects.Home_Page;
import page_Objects.Registration_Page;

public class TestCase_Registration extends Base_Test_Class{
		
	
	@Test
	public void test_Registration() throws InterruptedException
	{
		try {
					
		logger.info("****** Registration test case has started successfully ******");
		Home_Page hp = new Home_Page(driver);
		hp.myAc_select();
		logger.info("Clicked on my account");
		hp.register_select();
		logger.info("Clicked on register");
		
		Registration_Page regpage = new Registration_Page(driver);
		Thread.sleep(5000);
		logger.info("Registration form filling started");
		regpage.set_First_name(randomeString());
		regpage.set_Last_name(randomeString());
		regpage.set_email(randomeString()+"@gmail.com");
		regpage.set_telephoneNo(randomeNumber());
		String password = randomAlphaNumeric();
		regpage.set_Password(password);
		Thread.sleep(2000);
		regpage.set_ConfirmPassword(password);
		Thread.sleep(2000);
		regpage.select_newsletter("Yes");
		Thread.sleep(2000);
		regpage.select_Agree_CheckBox();
		Thread.sleep(2000);
		logger.info("Registration form completed");
		regpage.continue_Button();
		Thread.sleep(2000);
		logger.info("Clicked on continue button");
		regpage.ac_validation();
		logger.info("Validation completed");
		} 
		catch (Exception e) {
			logger.info("program not successfully executed");
			System.out.println(e);
		}
			
		
		
		
	}
	
}

