package com.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fecebookLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement UN=driver.findElement(By.id("email"));
	UN.sendKeys("lana_kj@yahoo.com");
	Thread.sleep(2000);
	WebElement PW=driver.findElement(By.id("pass"));
	PW.sendKeys("password");
	Thread.sleep(2000);
	WebElement ST=driver.findElement(By.name("login"));
	ST.click();	
	
}
}
