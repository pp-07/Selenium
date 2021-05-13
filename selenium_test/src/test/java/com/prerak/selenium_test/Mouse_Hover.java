package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.dezlearn.com/javascript-alerts/"); 
	 	    driver.manage().window().maximize();
	 	    Actions action = new Actions(driver);
	 	WebElement test=    driver.findElement(By.linkText("Test Pages"));
	 	action.moveToElement(test).perform();
	 	Thread.sleep(2000);
	 	driver.findElement(By.linkText("iFrame Example")).click();
	 	    

	}

}
