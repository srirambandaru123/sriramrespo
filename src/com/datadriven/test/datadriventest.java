package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelexceutil.Xls_Reader1;




public class datadriventest {

	public static void main(String[] args) {
		
		Xls_Reader1 reader=new Xls_Reader1("C:\\Users\\Kiran\\workspace\\data driven framework\\src\\com\\testdata\\halfebaytestdata.xlsx");
		
		String fname=reader.getCellData("Sheet1", "firstname", 2);
		System.out.println(fname);
		String lname=reader.getCellData("Sheet1", "lastname", 2);
		System.out.println(lname);
		String emailid=reader.getCellData("Sheet1", "emailid", 2);
		System.out.println(emailid);
		String pwd=reader.getCellData("Sheet1", "password", 2);
		System.out.println(pwd);
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1");
      
		driver.findElement(By.id("firstname")).sendKeys("sriram");
		driver.findElement(By.id("lastname")).sendKeys("bandaru");
		driver.findElement(By.id("email")).sendKeys("bandarufg@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("PASSWORD");
		
		
		
	}

}
