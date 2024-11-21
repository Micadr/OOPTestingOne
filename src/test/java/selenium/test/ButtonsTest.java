package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonsTest {

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
    public  void buttonTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on forms
        driver.findElement(By.id("buttons")).click();
        //Click on checkboxes
        driver.findElement(By.id("checkboxes")).click();
       //Click on checkbox 1
        driver.findElement(By.id("checkbox1")).click();
        Thread.sleep(2000);
        //Click on checkbox2
        driver.findElement(By.id("checkbox2")).click();
        Thread.sleep(2000);
        //Click on checkbox3
        driver.findElement(By.id("checkbox3")).click();
        Thread.sleep(2000);
        //Click on reset
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
