package com.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch5 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\java\\com\\sample\\sample1.java");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
/*String url="https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(2000);
		String currentUrl= driver.getCurrentUrl();		
		if(url.equals(currentUrl)) {
			System.out.println("Same url");			
		}else {
			System.out.println("Different url");
		}*/
}
}