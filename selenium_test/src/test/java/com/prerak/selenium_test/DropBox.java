package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();

	
		driver.get("https://www.facebook.com/"); 
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(1000);
		List <WebElement> years = driver.findElements(By.cssSelector("select#year>option"));
		System.out.println(years.size());
		
		for(WebElement year: years) {
			System.out.println(year.getAttribute("value"));
			
			}
		
		
		for(WebElement year: years) {
			if(year.getText().trim().equals("1996")){
				year.click();
			break;
			}
		}
	
		
	
		

	}

}
