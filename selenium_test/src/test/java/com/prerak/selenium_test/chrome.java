package com.prerak.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();

		
	}

}
