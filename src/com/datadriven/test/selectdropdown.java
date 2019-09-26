package com.datadriven.test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.excelexceutil.Xls_Reader1;


public class selectdropdown {
	static Xls_Reader1 reader;
	public static void main(String[] args) {
		 reader=new Xls_Reader1("C:\\Users\\Kiran\\workspace\\data driven framework\\src\\com\\testdata\\halfebaytestdata.xlsx");
      reader.addSheet("srirambandaru");
	  reader.addColumn("srirambandaru", "colname");
      
	  System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
       WebElement day= driver.findElement(By.id("day"));
       Select select=new Select(day);
       List<WebElement> listopt=select.getOptions();
      int count=listopt.size()-1;
      
      
       for(int i=0;i<listopt.size();i++){
    	  String dayval= listopt.get(i).getText();
    	  System.out.println(dayval);
          
           reader.setCellData("srirambandaru", "colname", i, dayval);
    	  
    	  
       }

		
		
		
		
	}

}
