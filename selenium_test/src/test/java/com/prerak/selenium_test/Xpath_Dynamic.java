package com.prerak.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	/*
	 * driver.get("https://www.amazon.com"); driver.manage().window().maximize();
	 * driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys(
	 * "phones");
	 */
	//driver.get("https://m.facebook.com/"); 
	
	driver.get("https://www.facebook.com/"); 
	
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@id='m-logi' or @name='email']")).sendKeys("hii");
	//driver.findElement(By.xpath("//input[starts-with(@name,'em')]  ")).sendKeys("hello");
//driver.findElement(By.xpath("//input[@type='email' or @name='email']")).sendKeys("abcd");
//driver.findElement(By.xpath("//input[@name='email' and starts-with(@name,'em')]")).sendKeys("hhh");
  

//PARENT/CHILD ...................................................................................................
	driver.findElement(By.xpath("//*[@id=\"u_0_a_GO\"]/div[1]/child::*/input[1]")).sendKeys("SS");

driver.close();
	}

}
