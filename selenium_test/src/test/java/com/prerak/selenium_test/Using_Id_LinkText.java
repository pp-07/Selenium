package com.prerak.selenium_test;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_Id_LinkText {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("car");
		Thread.sleep(1000);

		driver.findElement(By.id("nav-search-submit-button")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.partialLinkText("Music Sync Car LED")).click();
		Thread.sleep(2000);
		  
	
		String x =driver.findElement(By.id("productTitle")).getText();
		String y =driver.findElement(By.id("priceblock_dealprice")).getText();
		
		System.out.println(x);
		System.out.println(y);
		driver.close();
		
		}

}
