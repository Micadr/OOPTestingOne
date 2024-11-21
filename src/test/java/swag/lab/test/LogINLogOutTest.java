package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogINLogOutTest {

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
    public void validLogInLogOutTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on userNAME field

        driver.findElement(By.id("user-name")).click();
        //Insert on userNAME field username

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        //Click on password field
        driver.findElement(By.id("password")).click();

        //Insert on password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        //Click on login button
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        //Click on burger menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        //Click on LogOut
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(2000);

        //is log in button present again?
        driver.findElement(By.id("login-button")).isDisplayed();


    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }

}


