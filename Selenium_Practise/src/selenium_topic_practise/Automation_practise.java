package selenium_topic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Automation_practise {
    public static void main(String agrs[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='category']")));
//        Thread.sleep(2000);
        driver.quit();

    }
}
