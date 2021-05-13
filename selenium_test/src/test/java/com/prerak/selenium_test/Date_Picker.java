package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	         String expm= "January 2022";
	 		 String exd="8";
	
		driver.get("https://www.trivago.in/"); 
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@key='checkInButton']/span")).click();
		Thread.sleep(1000);
		String currm= driver.findElement(By.xpath("//div[@class='two-month-calendar']/descendant::table[1]/descendant::th/child::*")).getText();
		System.out.println(currm);
	    int c =0;
		while (!currm.contains(expm)) {
		
			driver.findElement(By.cssSelector("button.cal-btn-next")).click();;
			c++;
			Thread.sleep(1000);
			currm=driver.findElement(By.xpath("//div[@class='two-month-calendar']/descendant::table[1]/descendant::th/child::*")).getText();
			if(c==12) {
				break;
			}
			}
		
		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='two-month-calendar']/descendant::table[1]/descendant::td"));
		for(WebElement date:dates) {
			String x=date.getText().trim();
			if(x.equals(exd)) {
				date.click();			}
		}
		
		//div[@class='two-month-calendar']/descendant::table[1]/descendant::th/child::*
		//div[@class='two-month-calendar']/descendant::table[1]/descendant::td
		//button.cal-btn-next
	}

}
