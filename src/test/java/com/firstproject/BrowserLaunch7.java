package com.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch7 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
String pageSource = driver.getPageSource();
System.out.println(pageSource);
}
}