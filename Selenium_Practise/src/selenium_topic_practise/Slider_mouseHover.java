package selenium_topic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Slider_mouseHover {
	public static void main(String agr[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Actions ac = new Actions(driver);
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement startpoint = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider-range']/span[1]")));
		WebElement endpoint = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider-range']/span[2]")));
		
		System.out.println(startpoint.getLocation());
		ac.dragAndDropBy(startpoint, 200, 288).perform();
		driver.quit();
		
		
		
		

	}
}
