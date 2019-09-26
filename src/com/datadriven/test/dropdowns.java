package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select sc=new Select(ele);
		List<WebElement> lt=sc.getOptions();
		int size=lt.size();
		
		for(int i=0;i<size;i++){
			String str=lt.get(i).getText();
			System.out.println(str);
			sc.selectByVisibleText("Option 1");
			
			
		}
		//sc.selectByValue("Option 1");
		sc.selectByIndex(2);
//driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
//driver.findElement(By.xpath("//input[1]")).click();
//driver.findElement(By.xpath("//input[2]")).click();


		
		
		
		


	}

}
