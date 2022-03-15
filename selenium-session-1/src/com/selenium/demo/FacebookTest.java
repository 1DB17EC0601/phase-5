package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	      WebElement email = driver.findElement(By.id("email"));
	        WebElement pass = driver.findElement(By.id("pass"));
	        
	        email.sendKeys("7090314017");
	        pass.sendKeys("Mallappa@1");
	        
	        WebElement login= driver.findElement(By.name("login"));
	        login.submit();
	}

}
