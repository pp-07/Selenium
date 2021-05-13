package com.prerak.selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_Hover_Exercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		
		WebElement hover= driver.findElement(By.linkText("Contribute"));
		action.moveToElement(hover).perform();
		driver.findElement(By.linkText("Style Guides")).click();
		String a =driver.findElement(By.cssSelector("h1.entry-title")).getText();
		String b="jQuery’s Style Guides";
		if(a.equals(b)) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
		driver.close();
	}

}
