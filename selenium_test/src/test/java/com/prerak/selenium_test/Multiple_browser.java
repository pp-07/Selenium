package com.prerak.selenium_test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.amazon.in/"); 
	 	    driver.manage().window().maximize();
	 		Thread.sleep(1000);
	 		
	 		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	 		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung");
	 		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	 		driver.findElement(By.partialLinkText("Samsung Galaxy M02s")).click();
	 		String parentWindow=driver.getWindowHandle();
	 		Set<String> windows= driver.getWindowHandles();
	 		for (String window:windows) {
	 			if(!window.equals(parentWindow)) {
	 				driver.switchTo().window(window);
	 				
	 			}
	 		}
	 	
	 	String title=	driver.findElement(By.cssSelector("span#productTitle")).getText();
        String price =	 driver.findElement(By.id("priceblock_ourprice")).getText();
        System.out.println(price.replace("₹",""));
        System.out.println(title);
        driver.close();
        
        driver.switchTo().window(parentWindow);
        
        
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus ");
 		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	 		
	 	
	 		
	 		

	}

}
