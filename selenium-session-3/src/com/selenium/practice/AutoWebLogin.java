package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoWebLogin {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.oracle.com/mysso/signon.jsp");
		
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"sso_username\"]"));
		
		email.sendKeys("mallappabilhar77@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"ssopassword\"]"));
		
		pass.sendKeys("Mallappa@123");
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"signin_button\"]"));
		submit.click();
		
		
	}

}
