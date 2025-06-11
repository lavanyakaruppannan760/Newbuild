package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/alert.xhtml");
	WebElement alert = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
	alert.click();
	Thread.sleep(2000);
	Alert promptAlert = driver.switchTo().alert();
	promptAlert.sendKeys("sundar");
	Thread.sleep(2000);
	promptAlert.accept();
}
}