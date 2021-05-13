package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Exercise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://www.pepperfry.com/?gclid=EAIaIQobChMIwcjG8-Sg7wIVWDErCh0mBgHgEAAYASAAEgJcY_D_BwE"); 
			//driver.get("https://www.pepperfry.com/furniture-sofas-loungers-sofas-one-seater-sofas-modern-1-seater-sofas.html?v=all");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@id='search' and @type='text']")).sendKeys("table");
			//driver.findElement(By.xpath("//*[@id=\"headerUserArea\"]/div[2]/div[1]/div[1]/child::*/form/input[1]")).sendKeys("aa");
			//driver.findElement(By.xpath("//*[@id=\"headerUserArea\"]/descendant::div[2]/div[1]/div[1]/div[1]/form/input[1]")).sendKeys("aa");
			//driver.findElement(By.xpath("//div[@class='header-Middle-menu-ext-wrap']/descendant::input[1]")).sendKeys("hello");
			
		 String a  =	driver.findElement(By.xpath("//div[@class='pf-col sm-11 md-10 pf-right']/preceding-sibling::div/a")).getTagName();
		System.out.println(a);
			//js.executeScript("window.scrollBy(0,300)");
			//driver.findElement(By.partialLinkText("Miami 1 Seater")).click();
		
			

	}

}
