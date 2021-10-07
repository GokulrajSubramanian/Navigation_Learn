package com.selenium.learn;
import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class HelloSelenium {
WebDriver driver;
String url = "https://www.linkedin.com/login";
 
@Before
public void setUp() {
//Set the key/value property according to the browser you are using.
System.setProperty("webdriver.chrome.driver","/home/gokulrajs/Documents/SELENIUM/chromedriver");

//Open browser instance
driver = new ChromeDriver();
//Maximize the browser window
driver.manage().window().maximize();
 
//Open the website link
driver.get(url);
}
 
@Test
public void test() throws InterruptedException {
//Fetch the page title
/*String pageTitle = driver.getTitle();
System.out.println("Page title: " + pageTitle);
 
//Hey Google
driver.findElement(By.name("q")).sendKeys("Hey World");
Thread.sleep(3000);
driver.findElement(By.name("btnK")).click();
Thread.sleep(5000);
 
}*/
	String U = driver.getCurrentUrl();
	
	if(U.equals("https://www.linkedin.com/login")){
		
		System.out.println("Test Case passed");
	
		WebElement username=driver.findElement(By.id("username")); 
		 
		Thread.sleep(500);
		  
		  WebElement password=driver.findElement(By.id("password")); 
		  
		  Thread.sleep(500);
		  
		  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));    
		  
		  Thread.sleep(500);
		  
		  username.sendKeys("gokul23raj06@gmail.com"); 
		  
		  Thread.sleep(500);
		  
		  password.sendKeys("1@subu2@gandhi"); 
		  
		  Thread.sleep(500);
		  
		  login.click(); String actualUrl="https://www.linkedin.com/feed/"; 
		  
		  Thread.sleep(500);
		  
		  String expectedUrl= driver.getCurrentUrl(); 
		  
		  Thread.sleep(500);
		  
		  Assert.assertEquals(expectedUrl,actualUrl);
		  
		  Thread.sleep(500);
		  
		  String news = driver.findElement(By.className("news-module__headline-bullet")).getText();
		  
		  System.out.println(news);
	
		  
		  WebElement notifications=driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[2]/a[1]/*[1]")); 
		  
		  notifications.click();
		  
		  Thread.sleep(500);
		  
		  WebElement me=driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[6]/div[1]/button[1]/span[1]/*[1]"));
		  
		  me.click();
		  
		  Thread.sleep(1000);
		  
		  Actions act=new Actions(driver);
		  
		 driver.findElement(By.linkText("Sign Out")).click();
		  
		  WebElement signOut = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		  
		  act.moveToElement(signOut).click().perform();
		  
		  
		  
		  
	
	}
	else {
		System.out.println("Test case failed");
	}
	  
	  
	  
}
 
/*@After
public void tearDown() {
//Close the browser
driver.close();
}*/
}
