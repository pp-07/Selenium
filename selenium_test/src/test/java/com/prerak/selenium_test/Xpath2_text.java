package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2_text {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.get("https://www.actitime.com");
		driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		
	String x =	driver.findElement(By.xpath("//h2[text()='Fully functional 30-day online trial']")).getText();
	System.out.println(x);

	}

}
