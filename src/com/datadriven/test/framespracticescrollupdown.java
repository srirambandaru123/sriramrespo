package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framespracticescrollupdown {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		WebElement ele=driver.findElement(By.xpath("//iframe[@src='default.asp']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//a[@title='HTML Tutorial'and @href='/html/default.asp']")).click();
	  JavascriptExecutor jes=(JavascriptExecutor)driver;
	  Thread.sleep(4000);
	  jes.executeScript("window.scrollBy(0,500)");	
	  /*Thread.sleep(4000);
	  jes.executeScript("window.scrollBy(0,-500)");	 
	  driver.switchTo().defaultContent();
	  Thread.sleep(4000);
	  jes.executeAsyncScript("window.scrollBy(0,700)");*/
	  //System.out.println(driver.findElement(By.xpath("//a[@href='html_colors.asp']")).getText());
	  
	  

		


	
	
	
	
	}

}
