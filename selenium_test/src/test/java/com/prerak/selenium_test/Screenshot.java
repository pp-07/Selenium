package com.prerak.selenium_test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	         WebDriver driver = new ChromeDriver();
	     	driver.get("https://www.google.com"); 
	     	
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   By search = By.cssSelector("input.gLFyf");
	   WebElement k = driver.findElement(search);
	   k.sendKeys("Lion");
	   k.sendKeys(Keys.ENTER);
	   
	   driver.findElement(By.xpath("//div[@class='umyQi']/child::div[1]")).click();
	   
	   TakesScreenshot scrShot =((TakesScreenshot)driver);
	   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	 
	   FileUtils.copyFile(SrcFile, new File ("C:\\Users\\PRERAK PATEL\\eclipse-workspace\\selenium_test\\img2.png"));
	   
	   System.out.println("ss taken");
	   driver.close();
	  




}
}