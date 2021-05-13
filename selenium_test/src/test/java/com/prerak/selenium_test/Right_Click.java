package com.prerak.selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); 
	 	    driver.manage().window().maximize();
	 	    Actions action = new Actions(driver);
	 	  WebElement button=  driver.findElement(By.cssSelector("span.context-menu-one"));
	 	    action.contextClick(button).perform();
	 	    Thread.sleep(1000);
	 	    action.sendKeys(Keys.ARROW_DOWN).perform();
	 	    action.sendKeys(Keys.ARROW_DOWN).perform();
	 	    action.sendKeys(Keys.ARROW_DOWN).perform();
	 	   Thread.sleep(1000);
	 	    action.sendKeys(Keys.ENTER).perform();
	 	    Alert a =driver.switchTo().alert();
	 	    System.out.println(a.getText());
	 	    Thread.sleep(1000);
	 	    a.accept();
	 	
	}

}
