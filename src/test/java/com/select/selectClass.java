package com.select;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\maven-selenium\\Seleniumproj1\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(2000);
		/*WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruits);
		Thread.sleep(2000);*/
		//s.selectByIndex(5);
		//s.selectByValue("1");
		//s.selectByVisibleText("Orange");
		/*List<WebElement> options = s.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());

		}*/
		WebElement superHeros = driver.findElement(By.id("superheros"));
		Select select = new Select(superHeros);
		System.out.println(select.isMultiple());
		
		
		
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("aq");
		Thread.sleep(2000);
		select.selectByVisibleText("The Avengers");
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement option : allSelectedOptions) {
			System.out.println(option.getText());

			/*select.deselectByValue("aq");
			select.deselectByIndex(0);
			select.deselectByVisibleText("The Avengers");*/
			
			select.deselectAll();
			
		}



		

	}

}
