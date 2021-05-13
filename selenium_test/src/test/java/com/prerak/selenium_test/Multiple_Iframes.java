package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Iframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.dezlearn.com/iframe-example/"); 
	 	    driver.manage().window().maximize();
driver.switchTo().frame("iframe1");
driver.findElement(By.cssSelector("button#u_5_6")).click();

driver.switchTo().defaultContent();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");
driver.switchTo().frame(1);
driver.findElement(By.cssSelector("button#u_5_6")).click();

	}

}
