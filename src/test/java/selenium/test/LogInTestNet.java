package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInTestNet {


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
    public  void logInTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on forms
        driver.findElement(By.id("forms")).click();
        //Click on register
        driver.findElement(By.id("register")).click();
        Thread.sleep(2000);
        //Click on First Name filed
        driver.findElement(By.id("firstName")).click();
        //Insert on First name field
        driver.findElement(By.id("firstName")).sendKeys("Milica");
        Thread.sleep(2000);
        //Click on Last Name filed
        driver.findElement(By.id("lastName")).click();
        //Insert on Last Name field
        driver.findElement(By.id("lastName")).sendKeys("Milica");
        Thread.sleep(2000);
        //Click on Phone number filed
        driver.findElement(By.id("phone")).click();
        //Insert on Phone number field
        driver.findElement(By.id("phone")).sendKeys("1111111");
        Thread.sleep(2000);
        //Click on country
        driver.findElement(By.id("countries_dropdown_menu")).click();
        //Click on country
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[4]/select[1]/option[133]")).click();
        Thread.sleep(2000);
        //Click on email filed
        driver.findElement(By.id("emailAddress")).click();
        //Insert on email field
        driver.findElement(By.id("emailAddress")).sendKeys("vezbica222@yopmail.com");
        //Click on password filed
        driver.findElement(By.id("password")).click();
        //Insert on password field
        driver.findElement(By.id("password")).sendKeys("Vezbica.222");
       //Click on checkbox
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(2000);
        //Click to register button
        driver.findElement(By.id("registerBtn")).click();
        Thread.sleep(2000);




    }
    @AfterTest
    public  void andTest(){

        driver.quit();

    }

    }
