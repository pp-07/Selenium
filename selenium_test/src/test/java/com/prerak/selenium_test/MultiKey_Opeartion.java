package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiKey_Opeartion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://jqueryui.com/selectable/"); 
	 	    driver.manage().window().maximize();
	 	    Actions action = new Actions(driver);
	 	    driver.switchTo().frame(0);
	 	   WebElement first=driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
	 	   WebElement third=driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
	 	   WebElement fifth =driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
	 	   action.keyDown(Keys.CONTROL).perform();
	 	   action.click(first);
	 	   action.click(third);
	 	   action.click(fifth);
	 	   action.keyUp(Keys.CONTROL).perform();
	 	   
	 	      

	}

}
