package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/"); 
		Thread.sleep(1000);

		String one= driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).getCssValue("color");
		String two =driver.findElement(By.xpath("//a[@title='Home']/descendant::yt-formatted-string")).getCssValue("font-size");
		String three = driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).getCssValue("height");
		String four= driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).getCssValue("width");
		
		
		System.out.println("color         "  + one);
		System.out.println("font size     "  + two);
		System.out.println("height        "  + three);
		System.out.println("width         "  + four);
		driver.close();
		

		
		
	}

}
