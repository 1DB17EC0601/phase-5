package com.selenium.demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args)
	{
		//set property for web driver
		System.setProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "http://www.google.co.in/";
		
		String expected="Google";
		
		//launch googlechrome and direct it to baseurl
		
		driver.get(baseurl);
		//get actual Title
		String actual=driver.getTitle();
		if(expected.equals(actual))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
		
		driver.close();
;	}

}
