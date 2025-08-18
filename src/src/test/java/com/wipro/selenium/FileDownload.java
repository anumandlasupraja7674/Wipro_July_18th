package com.wipro.selenium;





import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://the-internet.herokuapp.com/download");
		
		WebElement fileDown = driver.findElement(By.xpath("//a[@href='download/testfile.txt']"));
		fileDown.click();
	
		
		File f = new File("C://Users//Supraja//Downloads//testfile.txt");
		
		if (f.exists()) {
			System.out.println("The file present");
		}
		else {
			System.out.println("Not present");
		}
		
		
	}

}


