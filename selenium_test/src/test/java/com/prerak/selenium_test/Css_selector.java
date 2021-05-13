package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/"); 
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Electronics")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Headphones")).click();
		Thread.sleep(1000);
        driver.findElement(By.partialLinkText("TOZO T10 Bluetooth 5.0 Wireless Earbuds")).click();
        Thread.sleep(1000);
        String x = driver.findElement(By.cssSelector("span#productTitle")).getText();
        System.out.println(x);
        if (x.contains("TOZO T10")) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
     driver.close();
        
        
        
	}

}
