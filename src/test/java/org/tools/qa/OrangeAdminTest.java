package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeAdminTest {


    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public  void SetUp()   {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait (driver, (Duration.ofSeconds(10)));
        baseURL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    }


    @Test

    public  void orangeadmintest () throws InterruptedException {

        driver.get(baseURL);

        //Click on userNAME field
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).click();
        //Insert on userNAME field username
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
        //Click on password field
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
        //Insert on password field
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
        //Click on login button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        Thread.sleep(2000);
      //Click to left slide
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]")).click();
     //Click to right slide
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
        Thread.sleep(2000);
        //Click to Search field
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]")).click();
        //Insert admin in field
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("admin");
        //Click to admin
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        // Check is position on site
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/span[1]/h6[1]")).isDisplayed();
        Thread.sleep(2000);
        //Check text
        String myText = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/span[1]/h6[1]")).getText();
        System.out.println(myText);
        Assert.assertEquals(myText,"Admin");




    }


    @AfterTest
    public  void andTest(){

        driver.quit();

    }


}
