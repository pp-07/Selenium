package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_height_Width {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();

	
		driver.get("https://agiletestingalliance.org/#"); 
		driver.manage().window().maximize();
		List <WebElement> images = driver.findElements(By.xpath("//img"));
		System.out.println(images.size());
		for(WebElement image:images ) {
			System.out.println(image.getSize().height + " "+ image.getSize().getWidth());
		}

	}

}
