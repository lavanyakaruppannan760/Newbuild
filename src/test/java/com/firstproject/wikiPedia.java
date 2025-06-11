package com.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikiPedia {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.wikipedia.com/");

WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
search.sendKeys("selenium");

WebElement SUB=driver.findElement(By.xpath("//button[@type='submit']"));
SUB.click();
System.out.println("sample");


/*WebElement S1=driver.findElement(By.xpath("//input[@aria-label='Tools']));
S1.click();*/

WebElement S1=driver.findElement(By.xpath("//a[text()='tellurium']"));
S1.click();	
System.out.println("sample1");

WebElement S2 = driver.findElement(By.xpath("//img[@width='220' and @height='220']"));
S2.click();

/*WebElement S1=driver.findElement(By.xpath("//input[@aria-label='Tools']));
S1.click();*/






}
}