package com.selenium.demo2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginByXPath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyPracticePrograms\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	        
	        
	        // By Xpath
//	        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//	        WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//	        
//	        email.sendKeys("7090314017");
//	        pass.sendKeys("Mallappa@1");
//	        
//	        
//	        WebElement login1= driver.findElement(By.xpath("//*[@id=\"u_0_d_gi\"]"));
//	        login1.submit();
	        
	        //By ccsSelector
		
		  WebElement email= driver.findElement(By.cssSelector("input[id*='mail']"));
          System.out.println(email.getAttribute("placeholder"));
          email.sendKeys("7090314017");
          
    	  WebElement pass= driver.findElement(By.cssSelector("input[id*='pass']"));
    	  System.out.println(pass.getAttribute("placeholder"));
    	  pass.sendKeys("Mallappa@1");
    	  
        WebElement button= driver.findElement(By.cssSelector("button[value='Log In'][type='button']"));
        button.submit();
        System.out.println(button.getAttribute("data-sigil"));
        driver.close();
	}

}