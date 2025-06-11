

package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");WebDriver driver = new ChromeDriver();// To achieve dynamic binding
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(2000);
		WebElement show = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		show.click();
		Thread.sleep(2000);
		WebElement popUp = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		popUp.click();
	
	}

}