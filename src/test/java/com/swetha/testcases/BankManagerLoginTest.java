package com.swetha.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.swetha.base.TestBase;

public class BankManagerLoginTest extends TestBase {


	@Test
	public void loginAsBankManager() throws Exception {
		log.debug("Inside login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))));
		Thread.sleep(3000);
		log.debug("Login successfully executed");
		
	}

	@AfterSuite
	public void tearDown() {
		
		  if(driver!=null) { driver.quit(); }
		 log.debug("Login execution completed and quit browser");
	}
}
