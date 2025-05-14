package selenium_topic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TablePrintInConsole {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//ADMIN//eclipse-selenium//Selenium_Practise//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//task 1 start here
		/*	driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int cellcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();


		for (int i=2;i<=rowcount;i++) {
			for(int j=1;j<=cellcount;j++) {
				Thread.sleep(2000);
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+ ("                              "));
			}
			System.out.println("");
		}
		driver.quit();*/ //Task 1 code end here
		//"C:\Users\ADMIN\eclipse-selenium\Driver\chromedriver.exe"
		//task 2: 
		Thread.sleep(2000);
		//driver.get("https://www.google.com/");
	}

	//Task 2: check the user is enable or disable in the given tabel reference : video of pankaj Selenium Webdriver Handling Web Table

}
