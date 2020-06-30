package com.swetha.javatrials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {
	
	
	/*
	 *  	public static void main (String args[]) {
		* 
	 * String driverExecPath =
	 * "C:\\Users\\Swetha\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe";
	 * 
	 * System.setProperty("webdriver.chrome.driver", driverExecPath); // Create a
	 * new instance of the FireFox driver WebDriver driver = new ChromeDriver();
	 * 
	 * // Storing the Application Url in the String variable String url =
	 * "http://www.shop.demoqa.com"; //Launch the ToolsQA WebSite driver.get(url);
	 * 
	 * // Storing Title name in the String variable String title =
	 * driver.getTitle();
	 * 
	 * // Storing Title length in the Int variable int titleLength =
	 * driver.getTitle().length();
	 * 
	 * // Printing Title & Title length in the Console window
	 * System.out.println("Title of the page is : " + title);
	 * System.out.println("Length of the title is : "+ titleLength);
	 * 
	 * // Storing URL in String variable String actualUrl = driver.getCurrentUrl();
	 * 
	 * if (actualUrl.equals(url)){
	 * System.out.println("Verification Successful - The correct Url is opened."); }
	 * else {
	 * System.out.println("Verification Failed - An incorrect Url is opened.");
	 * 
	 * //In case of Fail, you like to print the actual and expected URL for the
	 * record purpose System.out.println("Actual URL is : " + actualUrl);
	 * System.out.println("Expected URL is : " + url); }
	 * 
	 * // Storing Page Source in String variable String pageSource =
	 * driver.getPageSource();
	 * 
	 * // Storing Page Source length in Int variable int pageSourceLength =
	 * pageSource.length();
	 * 
	 * // Printing length of the Page Source on console
	 * System.out.println("Total length of the Pgae Source is : " +
	 * pageSourceLength);
	 * 
	 * //Closing browser driver.quit(); }
	 */
	
public static void main (String args[]) {
	
	String driverExecPath = "C:\\Users\\Swetha\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", driverExecPath);
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 String appUrl = "http://www.demoqa.com";
	 driver.get(appUrl);
	 
	 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	 System.out.println("element clicked");
	 driver.navigate().back();
	 System.out.println("clicked on back");
	 driver.navigate().forward();
	 System.out.println("clicked forward");
	 driver.navigate().to(appUrl);
	 System.out.println("navigated to appurl");
	 
	 driver.navigate().refresh();
	 System.out.println("page refreshed");

	 driver.close();
	 System.out.println("out of the web page");

	 driver.quit();
	 
	 
}
	

}






