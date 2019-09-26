package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excelexceutil.Xls_Reader1;

public class prioritisetest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
      
	
		Xls_Reader1 reader=new Xls_Reader1("C:\\Users\\Kiran\\workspace\\data driven framework\\src\\com\\testdata\\halfebaytestdata.xlsx");
          int rowcount=reader.getRowCount("Sheet1");
          for(int rownum=2;rownum<=rowcount;rownum++){
        	  System.out.println("======");
        	  String firstname=reader.getCellData("Sheet1", "firstname", rownum);
        	  System.out.println(firstname);
        	  
        	  String lname=reader.getCellData("Sheet1", "lastname", rownum);
      		System.out.println(lname);
      	
      		
      		String emailid=reader.getCellData("Sheet1", "emailid", rownum);
      		System.out.println(emailid);
      		
      		String pwd=reader.getCellData("Sheet1", "password", rownum);
      		System.out.println(pwd);
      		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1");
      		
      		
      		driver.findElement(By.id("firstname")).clear();
    		driver.findElement(By.id("firstname")).sendKeys(firstname);
    		driver.findElement(By.id("lastname")).clear();
    		driver.findElement(By.id("lastname")).sendKeys(lname);
    		driver.findElement(By.id("email")).clear();
    		driver.findElement(By.id("email")).sendKeys(emailid);
    		driver.findElement(By.id("PASSWORD")).clear();
    		driver.findElement(By.id("PASSWORD")).sendKeys(pwd);
    		driver.findElement(By.id("ppaFormSbtBtn")).click();
    		
          }
	}

}
