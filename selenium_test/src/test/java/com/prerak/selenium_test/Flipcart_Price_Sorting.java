package com.prerak.selenium_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Price_Sorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("button._2doB4z")).click();

		By search = By.xpath("//input[@type='text']");
		WebElement k = driver.findElement(search);
		k.click();
		k.sendKeys("sony");
		k.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='_5THWM1']/child::div[3]")).click();
		Thread.sleep(2000);

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		List<WebElement> prices = driver.findElements(By.cssSelector("div._30jeq3"));
		System.out.println(prices.size());
		
int c= 0;  //using counter to get limited no of elemnets from the list 
int a =0;


		for (WebElement x : prices) {
			
c++;
if(c==5) {
	break;
}
			String price = x.getText().replace("₹", "").replace(",", "");
			Integer p1 = Integer.parseInt(price);

			list.add(p1);
		}
//belew list is just for comparing with the sorted list 
		List<WebElement> temp = driver.findElements(By.cssSelector("div._30jeq3"));
		System.out.println(prices.size());

		for (WebElement x1 : temp) {
			a++;
			if(a==5) {
				break;
			}
			String p3 = x1.getText().replace("₹", "").replace(",", "");
			Integer p2 = Integer.parseInt(p3);

			list2.add(p2);
		}

		System.out.println(list);
		System.out.println(list2);

		//Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list2.get(0));
		System.out.println(list.equals(list2));

		driver.close();

	}

}
