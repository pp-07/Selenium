package com.prerak.selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.dezlearn.com/javascript-alerts/"); 
	 	    driver.manage().window().maximize();
	 	    
	 	    driver.findElement(By.id("s_alert1")).click(); 
	 	    Alert a =driver.switchTo().alert();
	 	    a.accept();
	 	    Thread.sleep(1000);
	 	    
	 	   driver.findElement(By.id("c_alert2")).click();
	 	    Alert b =driver.switchTo().alert();
	 	    System.out.println(b.getText());
	 	    b.dismiss();
	 	   Thread.sleep(1000);
	 	   
	 	  driver.findElement(By.id("p_alert3")).click();
	 	    Alert c =driver.switchTo().alert();
	 	    System.out.println(c.getText());
	 	    c.sendKeys("africa");
	 	    c.accept();
	 	   Thread.sleep(1000);
	 	    
	 	    
	 	    
	}

}
