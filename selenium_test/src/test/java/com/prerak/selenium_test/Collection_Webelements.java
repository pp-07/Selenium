package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
		
		List<WebElement> links = driver.findElements(By.cssSelector("a.nav-a"));
		for(WebElement x : links) {
			String text=x.getText();
			if(!text.trim().isEmpty()) {
			System.out.println(x.getText());
			System.out.println(x.getAttribute("class"));
			System.out.println("------------------------------------------------------------------------");
			}
		}
		
		driver.close();
		

	}

}
