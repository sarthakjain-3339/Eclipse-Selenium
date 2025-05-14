package selenium_topic_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String agrs[]) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//eclipse-selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement desktop = driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
		desktop.sendKeys("hi John");
		WebElement mac = driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(desktop).moveToElement(mac).click().perform();
		Thread.sleep(2000);
		WebElement ne = driver.findElement(By.xpath("//*[contains(normalize-space(text()),'Product Compare (0)')]"));
		Thread.sleep(2000);
		ac.contextClick().perform();
		ac.doubleClick().perform();
		driver.close();
       
	}
}
