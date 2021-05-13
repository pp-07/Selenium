package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_webelements_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> links = driver.findElements(By.cssSelector("img[src$='jpg']"));
		System.out.println(links.size());
		for (WebElement x : links) {
			if (x.isDisplayed()) {
			System.out.println(x.isDisplayed());
			System.out.println(x.getAttribute("alt"));
			System.out.println(x.getAttribute("src"));
			System.out.println("------------------------------------------------------------------------");
			}}

	}
		
}
