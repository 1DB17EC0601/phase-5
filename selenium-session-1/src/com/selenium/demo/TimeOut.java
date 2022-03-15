package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//timeout
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		System.out.println("implicit wait completed successfully");
		//Script timeout
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.MILLISECONDS);
		System.out.println("script wait completed successfully");
		//page reload
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("page Reload wait completed successfully");
		driver.close();
		
	
		
		
	
	}

}
