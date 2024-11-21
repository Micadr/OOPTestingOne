package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTest {
    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public  void SetUp()   {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait (driver, (Duration.ofSeconds(10)));
        baseURL= "https://qa-practice.netlify.app/";

    }

    @Test
    public  void alertsTest() throws InterruptedException {

        driver.get(baseURL);
          // Click to Alert
        driver.findElement(By.id("alerts")).click();
        Thread.sleep(2000);

        // Click to Alert button
        driver.findElement(By.id("alert-btn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);



        // Click to confirm button
        driver.findElement(By.id("confirm-btn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);


    }


    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
