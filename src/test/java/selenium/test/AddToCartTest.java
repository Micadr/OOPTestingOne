package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest {


    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public  void SetUp()   {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait (driver, (Duration.ofSeconds(10)));
        baseURL= "https://www.saucedemo.com/";
    }

    @Test
        public  void addItemToCartAndRemove() throws InterruptedException {

        driver.get(baseURL);
        //Click on userNAME field

        driver.findElement(By.id("user-name")).click();
        //Insert on userNAME field username

        driver.findElement(By.id("user-name")).sendKeys("standard_user");


        //Click on password field
        driver.findElement(By.id("password")).click();

        //Insert on password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");


        //Click on login button
        driver.findElement(By.id("login-button")).click();

        //Add item to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        //Go to cart
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")));

        //Remove item from Cart
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")));
        Thread.sleep(2000);






    }


    @AfterTest
    public  void andTest(){

        driver.quit();

    }



}




