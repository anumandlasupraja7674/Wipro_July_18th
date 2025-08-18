package com.wipro.selenium;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DateofbirthEx {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://ui.shadcn.com/docs/components/date-picker\r\n");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		WebElement dateBtn = driver.findElement(By.xpath("//button[@id='date']"));
		dateBtn.click();
		Thread.sleep(1000);
		
		WebElement date1 = driver.findElement(By.xpath("//button[@data-day='8/13/2025']"));
		date1.click();
		Thread.sleep(1000);
		
		dateBtn.click();
		Thread.sleep(1000);
		
		WebElement date2 = driver.findElement(By.xpath("//button[@data-day='8/22/2025']"));
		date2.click();
		Thread.sleep(1000);


		
		}
	}


