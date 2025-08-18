package com.wipro.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			ChromeOptions co=new ChromeOptions();
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver(co);
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(Frame); //by giving element
			
			//driver.switchTo().frame(0); //by giving index
			
			Thread.sleep(4000);
			
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(drag, drop).perform();
			
		

	}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally {
			driver.close();
			
		}
}
}

