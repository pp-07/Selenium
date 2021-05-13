package com.prerak.selenium_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_List {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);  
		driver.findElement(By.cssSelector("select.nav-search-dropdown")).click();
		Thread.sleep(1000); 
	
		List <WebElement> items = driver.findElements(By.cssSelector("select.nav-search-dropdown>option"));
		
		for (WebElement item: items) {
			System.out.println(item.getText());
			
				if(item.getText().trim().contains("Video Games")){
					
					item.click();
				}
			}
			driver.close();
		}
		

	}


