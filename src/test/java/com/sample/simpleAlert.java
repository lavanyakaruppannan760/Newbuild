package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/alert.xhtml");
	WebElement alert = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
	alert.click();
	Thread.sleep(2000);
	Alert simpleAlert = driver.switchTo().alert();
	simpleAlert.accept();
}
}