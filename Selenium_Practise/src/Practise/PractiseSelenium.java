package Practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseSelenium {
	public static void main(String agrs[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement radiobutton=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkBoxOption2']")));
		radiobutton.click();
		driver.navigate().refresh();
		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
