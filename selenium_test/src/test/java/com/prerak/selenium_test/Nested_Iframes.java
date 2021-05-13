package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.dezlearn.com/nested-iframes-example/"); 
	 	    driver.manage().window().maximize();
	 	    driver.switchTo().frame("parent_iframe");
	 	    driver.switchTo().frame("iframe1");
	 	    driver.findElement(By.cssSelector("button#u_5_6")).click();
	 	    Thread.sleep(1000);
	 	    driver.switchTo().defaultContent();
	 	   driver.switchTo().frame("parent_iframe");
	 	    Thread.sleep(1000);
	 	  driver.findElement(By.cssSelector("button#u_5_5")).click();
	 	  

	}

}
