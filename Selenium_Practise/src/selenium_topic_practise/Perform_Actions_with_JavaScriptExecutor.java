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




public class Perform_Actions_with_JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement txt1= waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'search')]")));
		WebElement button=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search']/button")));
		js.executeScript("arguments[0].setAttribute('value','John')", txt1);
		js.executeScript("arguments[0].click()", button);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
