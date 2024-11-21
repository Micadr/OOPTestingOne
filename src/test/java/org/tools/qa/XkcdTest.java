package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.time.Duration;

public class XkcdTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://xkcd.com/";

    }

    @Test

    public void XkcdRandomTest() throws InterruptedException {

        driver.get(baseURL);

        // Get pictures name
        String myFirstPicture = driver.findElement(By.xpath("//body/div[@id='middleContainer']/div[@id='comic']/img[1]")).getAttribute("src");
        System.out.println(myFirstPicture);
        //Click Random Button
        driver.findElement(By.xpath("//body/div[@id='middleContainer']/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(2000);
        //Get second pictures name
        String mySecondPictures = driver.findElement(By.xpath("//body/div[@id='middleContainer']/div[@id='comic']/img[1]")).getAttribute("src");
        System.out.println(mySecondPictures);
        Assert.assertNotEquals(myFirstPicture,mySecondPictures);




    }



    @AfterTest
    public  void andTest(){

        driver.quit();

    }



}