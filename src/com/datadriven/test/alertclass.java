package com.datadriven.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id='login1']")).click();
		Alert alert=driver.switchTo().alert();
		alert.getText();
		alert.notify();
		alert.accept();
		alert.dismiss();



	}

}
