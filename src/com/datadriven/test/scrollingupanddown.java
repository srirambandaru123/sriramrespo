package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrollingupanddown {

	@Test
	public void Test() throws Throwable{
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jes=(JavascriptExecutor)driver;
		

	
		// to scroll down the page by using pixels
		//jes.executeScript("window.scrollBy(0,500)");
		//Thread.sleep(4000);
		WebElement web=driver.findElement(By.xpath("//button[@name='websubmit']"));
		//to scroll to the certain element
		 //jes.executeScript("arguments[0].scrollIntoView();", web);
		 Thread.sleep(4000);
		 //to scroll to the end of the page
		//jes.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//jes.executeScript("window.scrollBy(0,-500)");
		/*WebElement send=driver.findElement(By.name("q"));
		WebElement click=driver.findElement(By.xpath("//a[@title='Google apps']"));
		jes.executeScript("arguments[0].value='sriram'", send);
		jes.executeScript("arguments[0].click()", click);*/
		

		
	}

	}


