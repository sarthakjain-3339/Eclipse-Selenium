package interview;


import org.testng.annotations.Test;

public class Test1 extends loginpage {
    @Test
    public void searchongoogle() throws InterruptedException {
        Thread.sleep(2000);
       driver.findElement(loginpage.search).sendKeys("Hi");
    }
}
