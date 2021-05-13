package com.prerak.selenium_test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	
		driver.get("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=5"); 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Boolean  a =driver.findElement(By.xpath("//*[@id=\"LH_TitleDesc\"]")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"LH_TitleDesc\"]")).click();
		Boolean  b  =driver.findElement(By.xpath("//*[@id=\"LH_TitleDesc\"]")).isSelected();
		System.out.println(a);
		System.out.println(b);
		
		
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		boolean c = driver.findElement(By.xpath("//*[@id=\"LH_PrefLocRadio\"]")).isEnabled();
		System.out.println(c);
	
		
		driver.close();
		
		
		
		
		
		
	}

}
