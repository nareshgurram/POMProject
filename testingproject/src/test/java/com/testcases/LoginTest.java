package com.testcases;

import java.io.IOException;

import com.base.BaseControl;
import com.pages.LoinPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseControl {
	
	LoinPage loginpage;

	public LoginTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		intialization();
		loginpage = new LoinPage();
	}
	
	
	@Test
	public void loginpagevalidationTest(){
		String title =loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
	
	

}
