package com.salesforce;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.slaesforce.base.ExcelReader;
import com.slaesforce.base.Keyword;

public class CreateTrailAccount {
	@Test
public void CreateTrailAccount(){
		//open open how may times there thats its open web pages
	ArrayList data = ExcelReader.getData("C:\\salesforcetest\\Book2.xlsx");
	
	
	Keyword Key =new Keyword();
	//System.out.println(data);
	
	for (int i = 0; i < data.size(); i++) {
		if(data.get(i).equals("open")) {
		System.out.println(data.get(i));
		Key.open();
	}
	   if(data.get(i).equals("url")) {
		   String httpurl = data.get(i+1).toString();
		   //System.out.println(httpurl);//its prints url address
		   Key.url(httpurl);
	   }
	   if(data.get(i).equals("input")) {//the input is given to username and password also so that it opens both
		   String testdata = data.get(i+1).toString();
		   String objectName = data.get(i+2).toString();
		   Key.input(testdata, objectName);
	 }
	   if(data.get(i).equals("click")) {
		   String objectName = data.get(i+2).toString();
		   Key.click(objectName);
	   }
	   if(data.get(i).equals("closebrowser")) {
		   Key.closebrowser();// control 1 for create one method automatically in keywords

	   }
	
	}
}
}
