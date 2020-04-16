package com.swetha.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.swetha.base.TestBase;

public class LoginTest extends TestBase {


	@Test
	public void loginAsBankManager() throws Exception {
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();

		Thread.sleep(3000);

	}

	@AfterSuite
	public void tearDown() {
		/*
		 * if(driver!=null) { driver.quit(); }
		 */
	}
}
