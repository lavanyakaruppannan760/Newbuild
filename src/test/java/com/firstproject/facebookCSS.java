package com.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookCSS {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement UN=driver.findElement(By.cssSelector("input#email"));
UN.sendKeys("lavanya");
WebElement PW=driver.findElement(By.cssSelector("input.inputtext"));
PW.sendKeys("lavanya1");
WebElement userName = driver.findElement(By.cssSelector("input.inputtext[name='email']"));
userName.sendKeys("lavanya2");
//WebElement SUB=driver.findElement(By.cssSelector("button[type='submit']"));
//SUB.click();
WebElement SUB1=driver.findElement(By.cssSelector("button._42ft[type='submit']"));
SUB1.click();
}
}