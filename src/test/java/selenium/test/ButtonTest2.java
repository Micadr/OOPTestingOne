package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonTest2 {

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
    public  void buttonTest2() throws InterruptedException {

        driver.get(baseURL);
        //Click on buttons
        driver.findElement(By.id("buttons")).click();
       //Click on  radio buttons
        driver.findElement(By.id("radio-buttons")).click();
        Thread.sleep(2000);
        //Click on radio buttons1
        driver.findElement(By.id("radio-button1")).click();
        Thread.sleep(2000);
        //Click on radio buttons2
        driver.findElement(By.id("radio-button2")).click();
        Thread.sleep(2000);
        //Click on radio buttons3
        driver.findElement(By.id("radio-button3")).click();
        Thread.sleep(2000);





    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
