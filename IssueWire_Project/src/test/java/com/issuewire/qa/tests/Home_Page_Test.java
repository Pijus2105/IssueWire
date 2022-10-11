package com.issuewire.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.issuewire.qa.base.Test_Base;
import com.issuewire.qa.pages.Home_Page;
import com.issuewire.qa.pages.Log_In;

public class Home_Page_Test extends Test_Base {
	
	Log_In Log;
	Home_Page homepage;
	
	public Home_Page_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	   Log = new Log_In();
	   homepage = Log.login(prop.getProperty("Email"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyHomePageTitle() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Dashboard | Issuewire", "Home page title not match");
	}

}
