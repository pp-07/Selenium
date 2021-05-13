package com.prerak.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_inside_Webelement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button._2KpZ6l")).click();
		driver.findElement(By.xpath("//input[@name='q']")).click();
		//driver.findElement(By.xpath("//input[@name='q']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("men shoes");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		Thread.sleep(5000);
		
		List<WebElement> items = driver.findElements(By.cssSelector("div._373qXS"));
		System.out.println(items.size());
		
		for(WebElement item: items ) 
		{
			String p1 = item.findElement(By.cssSelector("div._30jeq3")).getText().trim();
			String p2= p1.replace("₹","").replace(" ", "").replace(",","");
			double p3 = Double.parseDouble(p2);
			
			if(p3<300 || p3> 500)
			{
				String title = item.findElement(By.cssSelector("div._2WkVRV")).getText();
				System.out.println(title);
				WebElement link =item.findElement(By.cssSelector("a.IRpwTa"));
				System.out.println(link.getText());
				System.out.println(p3);
				System.out.println(link.getAttribute("href"));
				System.out.println("-------------------------------------------------------------------------");
				
			
				
			}
		}
		
		driver.close();

	}

}
