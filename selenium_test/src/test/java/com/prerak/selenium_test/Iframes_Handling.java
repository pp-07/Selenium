package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.w3schools.com/html/html_iframe.asp"); 
	 	    driver.manage().window().maximize();
	 		Thread.sleep(1000);
	 		WebElement frame1 = driver.findElement(By.cssSelector("iframe[title='W3Schools HTML Tutorial']"));
	 		driver.switchTo().frame(frame1);
	 		driver.findElement(By.cssSelector("a[title='CSS Tutorial']")).click();
	 		driver.switchTo().defaultContent();
	 		
	 	
	 		
	 		
	}

}
