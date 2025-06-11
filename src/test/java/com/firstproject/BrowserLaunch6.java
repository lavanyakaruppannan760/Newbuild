package com.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch6 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\java\\com\\sample\\sample1.java");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.amazon.in/");
String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "Facebook – log in or sign up";

		if (title.equals(expectedTitle)) {
			System.out.println("Same Title");
		} else {
			System.out.println("Different Title");
		}
}
}