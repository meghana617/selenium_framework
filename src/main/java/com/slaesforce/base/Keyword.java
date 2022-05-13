package com.slaesforce.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
	
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
   public void open() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium_java\\chromedriver.exe");
	 driver = new ChromeDriver();
	 try {
		fis =new FileInputStream("C:\\18 jan java class\\salesforce\\src\\main\\java\\com\\slaesforce\\base\\ObjectRepository.properties");
	  prop = new Properties();
	  prop.load(fis);
	 } catch (Exception e) {
     e.printStackTrace();
	}
}
     public void url(String httpurl) {
	driver.get(httpurl);//it lunch the browser and it navigate to the url salesforce
}
     public void input(String testdata, String objectName) {
	driver.findElement(By.xpath(objectName)).sendKeys("testdata ");
}
	public void click(String objectName) {
     driver.findElement(By.xpath(objectName)).click();		
	}
	public void closebrowser() {
     driver.close();		
	}
}
