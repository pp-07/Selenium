package com.prerak.selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip_Text {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/tooltip.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Actions action= new Actions(driver);
 
WebElement hover = driver.findElement(By.xpath("//a[@id='download_now']"));
action.moveToElement(hover).perform();
Thread.sleep(1000);
String expected = "What's new in 3.2";
String Actual = driver.findElement(By.linkText("What's new in 3.2")).getText();

if (Actual.equals(expected)) {
	System.out.println("Test Case passed");
}else {
	System.out.println("Test case fail ");
}
Thread.sleep(1000);
driver.findElement(By.linkText("What's new in 3.2")).click();
Thread.sleep(1000);
	driver.close();

	}

}
