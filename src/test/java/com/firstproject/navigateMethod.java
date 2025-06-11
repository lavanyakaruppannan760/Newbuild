package com.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Maximize
driver.manage().window().maximize();
//Get Method
driver.navigate().to("https://www.google.com/");
//getURL
String url="https://www.facebook.com/";
driver.get(url);
Thread.sleep(2000);
//Back
driver.navigate().back();
Thread.sleep(2000);
//Forward
driver.navigate().forward();
Thread.sleep(2000);
//Refresh
driver.navigate().refresh();
//Quit
driver.quit();

}
}