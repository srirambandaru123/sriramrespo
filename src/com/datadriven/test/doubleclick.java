package com.datadriven.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(driver);
		/*action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).perform();
	Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
	alert.accept();*/
	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	action.contextClick(rightclick).sendKeys(Keys.ARROW_DOWN).click().build().perform();
	
	
	}

}
