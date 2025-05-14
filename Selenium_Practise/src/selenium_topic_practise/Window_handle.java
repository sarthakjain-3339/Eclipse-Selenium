package selenium_topic_practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_handle {

	public static void main(String args[] ) throws Exception{
		WebDriver driver=new ChromeDriver();
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		waits.until(ExpectedConditions.urlToBe("https://demo.opencart.com/"));
		Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB)	;
		driver.get("https://google.com/");
//		driver.close();
//		Thread.sleep(2000);
//		driver.quit();
		List<String> windowcount=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowcount.get(0));
		WebElement txtbox=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'search')]")));
		txtbox.sendKeys("My name is Sprinklr");
		Thread.sleep(3000);
		driver.switchTo().window(windowcount.get(1));
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.close();
		driver.close();
		
		
		


	}
}
