package com.issuewire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.issuewire.qa.base.Test_Base;

public class Sign_Up extends Test_Base {
	
	//Page Factory - Object Repository
	
	@FindBy(className="First Name")
	WebElement FirstName;

}
