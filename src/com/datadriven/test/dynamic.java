package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelexceutil.Xls_Reader1;

public class dynamic {
	static Xls_Reader1 reader;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		 reader=new Xls_Reader1("C:\\Users\\Kiran\\workspace\\data driven framework\\src\\com\\testdata\\halfebaytestdata.xlsx");
reader.addSheet("dynamic");
reader.addColumn("dynamic", "city");
reader.addColumn("dynamic", "country");
// //*[@id="content"]/table/tbody/tr[1]/th
		// //*[@id="content"]/table/tbody/tr[2]/th
		String before_xpath="//*[@id='content']/table/tbody/tr[";
		String after_xpath="]/th";
		String before_xpathcountry="//*[@id='content']/table/tbody/tr[";
		String after_xpathcountry="]/td[1]";
		for(int i=2;i<=4;i++){
			String actual_path=before_xpath+i+after_xpath;
			String structure=driver.findElement(By.xpath(actual_path)).getText();
			System.out.println(structure);
			reader.setCellData("dynamic", "city", i, structure);
			// //*[@id="content"]/table/tbody/tr[1]/td[1]
			// //*[@id="content"]/table/tbody/tr[2]/td[1]
			String actual_pathcountry=before_xpathcountry+i+after_xpathcountry;
			String country=driver.findElement(By.xpath(actual_pathcountry)).getText();
			System.out.println(country);
			reader.setCellData("dynamic", "country", i,country);
			
			
			
			
		}
	}

}
