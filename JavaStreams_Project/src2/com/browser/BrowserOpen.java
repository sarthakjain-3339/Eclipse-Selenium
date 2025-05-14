package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserOpen {
	static WebDriver driver;
public static void main() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/eclipse-selenium/Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
}	
	
	
	
	
	
	

}
