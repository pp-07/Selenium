package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); 
		Thread.sleep(1000);
		
		
		
		List<WebElement>  links = driver.findElements(By.cssSelector("a"));
		
		System.out.println(links.size());
		for (WebElement x : links) {
		String t=x.getText();
		
			//if (x.isDisplayed()) {
			System.out.println(x.isDisplayed());
			
			System.out.println(x.getAttribute("href"));
			System.out.println("------------------------------------------------------------------------");
			}

	}
		
}


