package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragAndDrop {



    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://demoqa.com/droppable";
        driver.get(baseURL);

    }


    @Test
    public void draganddrop() throws InterruptedException {

        driver.get(baseURL);

     // Actions class method to drag and drop
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to= driver.findElement(By.id("draggable"));

        // Perform drag and drop
         builder.dragAndDrop(from,to).perform();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Dropped!')]")));
        Thread.sleep(3000);

    }


    @AfterTest
    public void andTest() {

        driver.quit();

    }




}


