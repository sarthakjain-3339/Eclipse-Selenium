package selenium_topic_practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyboard_actions_class {

	public static void main(String agrs[]) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait waits= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement txt1= waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'text1')]")));
		txt1.sendKeys("Welcome to zomota");
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		Thread.sleep(6000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		Thread.sleep(6000);
		driver.quit();		
		
		
	}
}
