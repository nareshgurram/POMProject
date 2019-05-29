package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseControl {
	
	public static WebDriver driver;
	public static Properties prop1;
	
	public BaseControl() throws IOException{
			prop1 = new Properties();
			
			FileInputStream prop = new FileInputStream("D:/training/p1/src/main/java/com/properties/Config.properties");
			prop1.load(prop);
			
			System.out.println("reaced constructor");
			}
	
	public static void intialization(){
		
		String browsername =prop1.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop1.getProperty("url"));
		
		
		
		
	}
	

}
