package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlinks {
	static WebDriver driver;
	
	
 public static void findlinks(){
	 driver.get("https://www.flipkart.com/");
	 List<WebElement> count=driver.findElements(By.xpath("//a"));
	 System.out.println(count.size());
	 driver.quit();
	}
 /*public static void linktextandurls(){
	 driver.get("https://www.flipkart.com/");
	 driver.findElements(By.linkText(linkText))
	 */
	 
	 
	 
	 
	 
	 
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		 driver=new ChromeDriver();
		 findlinks();


    	 
     
	}

}
