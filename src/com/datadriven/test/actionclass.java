package com.datadriven.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		driver.get("http://the-internet.herokuapp.com/context_menu");
		WebElement ele=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		/* action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 action.sendKeys(Keys.ARROW_DOWN).build().perform();


		 action.sendKeys(Keys.ENTER).build().perform();
		*/
		
		
		
		
		
		
		
	}

}
