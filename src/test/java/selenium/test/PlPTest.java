package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlPTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public  void SetUp()   {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait (driver, (Duration.ofSeconds(10)));
        baseURL= "https://rahulshettyacademy.com/seleniumPractise/#/";

    }

    @Test
    public  void addItemToCartAndRemove() throws InterruptedException {

        driver.get(baseURL);

        //Click on Search field
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).click();
        //Insert on Serach field
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("cucumber");
        Thread.sleep(2000);
        //Click on add to cart
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(2000);
        //Click to cart
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/a[4]/img[1]")).click();
        Thread.sleep(2000);
        //Click to proceed to checkout
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/button[1]")).click();
        Thread.sleep(2000);
         //Click to place order
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        //Click to select country
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[contains(text(),'Serbia')]")).click();
        //Click to Agree to the Terms & Conditions
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        Thread.sleep(2000);
        //Click to procced
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
    }




    @AfterTest
    public  void andTest(){

        driver.quit();

    }

}
