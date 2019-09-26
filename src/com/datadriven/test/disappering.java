package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class disappering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*Actions action=new Actions(driver);
		WebElement web=driver.findElement(By.id("column-a"));
		WebElement web1=driver.findElement(By.id("column-b"));
		action.clickAndHold(web).moveToElement(web1).release(web).build().perform();
		*/
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		String arr[]={"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

		Select select=new Select(ele);
		List<WebElement> great=select.getOptions();
		great.size();
		for(int i=1;i<great.size();i++){
			
			
			Assert.assertEquals(arr[i], great.get(i).getText());
			
			
			
			
		}
		//driver.close();
		
		
		
		


		
		
		
		
		
		
		
		

	}

}
