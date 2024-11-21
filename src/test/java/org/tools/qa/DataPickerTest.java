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

public class DataPickerTest {
    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void dataPickerTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://demoqa.com/date-picker";

    }

    @Test
    public void DataPickerTest () throws InterruptedException {
        driver.get(baseURL);

        //Click on Date And Time field
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        Thread.sleep(2000);
        //Click on month
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")).click();
        Thread.sleep(2000);
        //Click on may
        driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
        Thread.sleep(2000);

        //Click on 1990
        driver.findElement(By.xpath("//option[contains(text(),'1990')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")).click();

        // Check
        String myDate = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        System.out.println(myDate);
        Thread.sleep(2000);
        Assert.assertEquals(myDate,"05/15/1990");


    }


            @AfterTest
            public  void andTest(){

            driver.quit();

        }

    }
