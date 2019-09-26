package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testutil.testngutildataprovider;


public class testngdatadriven {
	static WebDriver driver ;
	@BeforeMethod
		public void setup(){
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
    		driver.manage().window().maximize();
    		driver.manage().deleteAllCookies();
    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1");
       
			
		}
	@DataProvider
	public Iterator<Object[]> gettestdata(){
		ArrayList<Object[]> testdata=testngutildataprovider.getdatafromexcel();
		return testdata.iterator();
		
	}
	
	@Test(dataProvider="gettestdata")
	public void logintestcase(String firstname,String lastname,String emailid,String password){
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("fname");
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("lname");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("emailid");
		driver.findElement(By.id("PASSWORD")).clear();
		driver.findElement(By.id("PASSWORD")).sendKeys("pwd");
	
	}
	
	
	
	
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	
	
	
}
