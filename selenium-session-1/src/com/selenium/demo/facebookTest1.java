package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class facebookTest1 {
	
	
	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		String placehldr = email.getAttribute("placeholder");
		
		System.out.println(placehldr);
		
		WebElement name=driver.findElement(By.className("_8eso"));
		System.out.println(name.getText());
		
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
        link.click();
	
	}

}
