package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RecoveryPassword {

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
        //Click on recover password
        driver.findElement(By.id("recover-password")).click();
        //Click on recover password field
        driver.findElement(By.id("email")).click();
        //Insert on recover password field
        driver.findElement(By.id("email")).sendKeys("vezbica222@yopmail.com");
        Thread.sleep(2000);
        //Click on recover password button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/button[1]")).click();
        Thread.sleep(2000);
        //Message
        driver.findElement(By.id("message")).isDisplayed();
        Thread.sleep(2000);

    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
