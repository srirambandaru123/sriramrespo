package com.datadriven.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gurupractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.findElement(By.xpath("//a[contains(text(),'Payment Gateway Project')]")).click();
		WebElement ele=driver.findElement(By.name("quantity"));
		Select sel=new Select(ele);
		sel.selectByIndex(4);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.name("card_nmuber")).sendKeys("9876543456789076");
		WebElement web=driver.findElement(By.xpath("//select[@name='month']"));
		Select sel1=new Select(web);
		sel1.selectByIndex(4);

		List<WebElement> opt=sel1.getOptions();
		
		int count=opt.size();
		for(int i=0;i<count;i++){
			String month=opt.get(i).getText();
			System.out.println(month);
			
		}
		WebElement grt=driver.findElement(By.id("year"));
		Select sel2=new Select(grt);
		sel2.selectByIndex(4);
		driver.findElement(By.name("cvv_code")).sendKeys("798");
		driver.findElement(By.name("submit")).click();
		boolean b1=driver.findElement(By.xpath("//h2[contains(text(),'Payment successfull!')]")).isDisplayed();
		
		if(b1==true){
			String text=driver.findElement(By.cssSelector("#three > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > h3 > strong")).getText();
			System.out.println(text);
		}else{
			System.out.println("payment not done");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
