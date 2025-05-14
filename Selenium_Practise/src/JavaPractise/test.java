package JavaPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String []agrs) {
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
