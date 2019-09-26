package com.testutil;

import java.util.ArrayList;

import com.excelexceutil.Xls_Reader1;

public class testutilitydataprovider {
	 static Xls_Reader1 reader;

	public static ArrayList<Object[]>getdatafromexcel(){
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		 reader=new Xls_Reader1("C:\\Users\\Kiran\\workspace\\data driven framework\\src\\com\\testdata\\halfebaytestdata.xlsx");
		for(int rowNum=2;rowNum>=reader.getRowCount("Sheet1");rowNum++){
		String firstname= reader.getCellData("Sheet1", "firstname", rowNum);
		String lastname= reader.getCellData("Sheet1", "lastname", rowNum);
		 
		String emailid= reader.getCellData("Sheet1", "emailid", rowNum);
		String pwd= reader.getCellData("Sheet1", "password", rowNum);
		 
		 Object ob[]={firstname,lastname,emailid,pwd};
		 mydata.add(ob);
		
		}
		return mydata;
		
		

		 

		
		

	}

}
