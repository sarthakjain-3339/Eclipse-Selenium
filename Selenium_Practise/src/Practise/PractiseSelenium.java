package Practise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PractiseSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Windows.html");
		String title=driver.getTitle();
		waits.until(ExpectedConditions.titleIs(title));
		driver.findElement(By.xpath("//div[@id=\"Tabbed\"]//button")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String s:windows){
			driver.switchTo().newWindow(WindowType.WINDOW);
			Thread.sleep(4000);
		}
		driver.quit();
	}
}
