package com.issuewire.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.issuewire.qa.base.Test_Base;
import com.issuewire.qa.pages.Log_In;

public class login_Test extends Test_Base {
	
	Log_In Log;
	
	public login_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	   Log = new Log_In();
	}
	
	@Test
	public void validateLoginPageTitle () {
		String title = Log.validateLoginPageTitle();
		Assert.assertEquals(title, "Press Release Distribution Services | Paid Press Release Distribution");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	

}
