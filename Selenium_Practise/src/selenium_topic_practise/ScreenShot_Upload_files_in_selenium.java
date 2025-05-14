package selenium_topic_practise;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot_Upload_files_in_selenium {

	public static void main(String agrs[]) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Take full page of screenshot 
//		TakesScreenshot sc=driver;
//		File sourcefile=sc.getScreenshotAs(OutputType.FILE);
//		File mainfile= new File(System.getProperty("user.dir")+"\\Screenshot\\Ramdon1.png");
//		sourcefile.renameTo(mainfile);
//		driver.quit();
		// Take a particular element screenshot 
		Thread.sleep(4000);
		WebElement e1=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='narbar-menu']")));
		File sourcefile=e1.getScreenshotAs(OutputType.FILE);
		File Mainfile=new File(System.getProperty("user.dir") +"//Screenshot\\random3.jpg");
		sourcefile.renameTo(Mainfile);
		driver.quit();
		
		
		
		
		
		
	}
}
