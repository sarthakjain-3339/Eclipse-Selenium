package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionsclass  {
    static WebDriver driver;
    @BeforeTest
    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }


    @AfterTest
            public void logout(){
        driver.quit();
    }

}
