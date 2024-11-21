package selenium.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class CreateNewAccountParabank {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://parabank.parasoft.com/parabank/index.htm";

    }

    @Test

    public void CreateNewAccountTest() throws InterruptedException {
        driver.get(baseURL);

      // Click to Register
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(2000);

       //Click on first name field

        driver.findElement(By.id("customer.firstName")).click();

        //Insert on first name field
        driver.findElement(By.id("customer.firstName")).sendKeys("Milica");

        //Click on last name field

        driver.findElement(By.id("customer.lastName")).click();

        //Insert on last name field
        driver.findElement(By.id("customer.lastName")).sendKeys("Milica");
        Thread.sleep(2000);

        //Click on Address filed
        driver.findElement(By.id("customer.address.street")).click();

        //Insert on Adress field
        driver.findElement(By.id("customer.address.street")).sendKeys("Omladinskih brigada 90");

        // Click on City field
        driver.findElement(By.id("customer.address.city")).click();

        //Insert on City field
        driver.findElement(By.id("customer.address.city")).sendKeys("Novi Beograd");

          // Click on State field
        driver.findElement(By.id("customer.address.state")).click();

        //Insert on State field
        driver.findElement(By.id("customer.address.state")).sendKeys("Srbija");

        // Click on Zip Code field
        driver.findElement(By.id("customer.address.zipCode")).click();

        //Insert on Zip Code field
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11070");
        Thread.sleep(2000);

        // Click on Phone field
        driver.findElement(By.id("customer.phoneNumber")).click();

        //Insert on Phone field
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("063252525");
        Thread.sleep(2000);

        // Click on SSN field
        driver.findElement(By.id("customer.ssn")).click();

        //Insert on SSN field
        driver.findElement(By.id("customer.ssn")).sendKeys("SNN Vezba");
        Thread.sleep(2000);

        // Click on Username field
        driver.findElement(By.id("customer.username")).click();

       String prefix= "myName_";
       String username =prefix + RandomStringUtils.randomAlphanumeric(7).toLowerCase();



        //Insert on Username field
        driver.findElement(By.id("customer.username")).sendKeys(username);
        Thread.sleep(2000);

        // Click on Password field
        driver.findElement(By.id("customer.password")).click();

        //Insert on Password field
        driver.findElement(By.id("customer.password")).sendKeys("Vezba222!");
        Thread.sleep(2000);

        // Click on Confirm field
        driver.findElement(By.id("repeatedPassword")).click();

        //Insert on Confirm field
        driver.findElement(By.id("repeatedPassword")).sendKeys("Vezba222!");
        Thread.sleep(2000);

        // Click on Register
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
        Thread.sleep(2000);

         //Thanks message
        driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")).isDisplayed();
        Thread.sleep(2000);

    }




    @AfterTest
    public  void andTest(){

        driver.quit();

    }





}
