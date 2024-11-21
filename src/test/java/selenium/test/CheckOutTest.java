package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutTest {

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
    public  void checkOutTest() throws InterruptedException {

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


        //Go to cart
        driver.findElement(By.id("shopping_cart_container")).click();


        //Check out
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
        Thread.sleep(2000);

        //Click on first name field

        driver.findElement(By.id("first-name")).click();

        //Insert on first name field
        driver.findElement(By.id("first-name")).sendKeys("Milica");

        //Click on last name field

        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Milica");

        //Click on zip code  field
        driver.findElement(By.id("postal-code")).click();
        driver.findElement(By.id("postal-code")).sendKeys("11070");
        Thread.sleep(2000);

        // Click to Continue
        driver.findElement(By.id("continue")).click();

        //Click to Finish
        driver.findElement(By.id("finish")).click();


        //Thanks message
        driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).isDisplayed();
        Thread.sleep(2000);



    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }

    }
