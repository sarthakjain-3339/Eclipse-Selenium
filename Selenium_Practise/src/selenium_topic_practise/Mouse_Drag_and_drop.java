package selenium_topic_practise;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Drag_and_drop {
//	 static WebDriver  driver;
     public static void main(String agrs[]) throws InterruptedException {
    	 WebDriver  driver=new ChromeDriver();
    	  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
    	  
    	  Actions ac=new Actions(driver);
    	  Thread.sleep(2000);
    	  WebElement one=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='box6']")));

    	  Thread.sleep(2000);
    	  WebElement rightone=driver.findElement(By.xpath("//*[@id='box103']"));
    	  Thread.sleep(3000);
    	  ac.dragAndDrop(one, rightone).perform();
    	  driver.quit();
    	 
    	  
    	 
     }
}
