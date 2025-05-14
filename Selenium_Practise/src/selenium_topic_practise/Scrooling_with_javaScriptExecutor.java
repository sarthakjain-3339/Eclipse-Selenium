package selenium_topic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scrooling_with_javaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search']/button")));
		
//		js.executeScript("window.scrollBy(0,400)" );
		WebElement brandsfotter=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='iPhone']")));
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView()", brandsfotter);
		Thread.sleep(4000);
		Assert.assertEquals(brandsfotter.getText(), "iPhone");
		driver.quit();
		
		
		
		
		
		
	}
}
