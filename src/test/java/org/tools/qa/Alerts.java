package org.tools.qa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {


    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://demoqa.com/alerts";
    }


    @Test
    public void alerts() throws InterruptedException {

        driver.get(baseURL);

        // Alert button
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // Time Alert
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Confirm Alert
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmResult")).isDisplayed();
        Thread.sleep(2000);


        //Prompt Alert
        driver.findElement(By.id("promtButton")).click();

        //Print message from Alert
        String myText = driver.switchTo().alert().getText();
        System.out.println(myText);

        //Enter Text
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("text");
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.id("promptResult")).isDisplayed();
        Thread.sleep(2000);








    }

    @AfterTest
    public void andTest() {

        driver.quit();

    }

}


