package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelect_Dropbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();

	
		driver.get("https://in.linkedin.com/jobs/jobs-in-mumbai?trk=homepage-basic_intent-module-jobs&position=1&pageNum=0"); 
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-controls='COMPANY-dropdown']")).click();
	
		
		  Thread.sleep(1000); List <WebElement> companies
		  =driver.findElements(By.cssSelector("div#COMPANY-dropdown li"));
		  System.out.println(companies.size());  
		  for (WebElement company :companies ) {
			  System.out.println(company.getAttribute("Value"));
			  
		  if(company.getText().trim().contains("BookMyShow") || company.getText().trim().contains("Google") || company.getText().trim().contains("Citi")) { 
			  company.click();
		  }
		  }
		 	
		
		
		/*               AUTO SUGGESTION HANDLING 
		 * driver.findElement(By.cssSelector("div#COMPANY-dropdown input[name='value']")
		 * ).click();
		 * driver.findElement(By.cssSelector("div#COMPANY-dropdown input[name='value']")
		 * ).sendKeys("google d"); Thread.sleep(2000); List <WebElement> companies
		 * =driver.findElements(By.cssSelector("div.filter-list li"));
		 * System.out.println(companies.size());
		 * 
		 * for (WebElement company : companies ) {
		 * System.out.println(company.getText());
		 * if(company.getText().trim().contains("Google Developers")) { company.click();
		 * }
		 * 
		 * }
		 */
		        }
		
		
		
		
        	}
        
		
		
		
		
	


