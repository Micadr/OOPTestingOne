package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SliderTest {


    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://demoqa.com/slider";


    }

    @Test
    public void SliderTest () throws InterruptedException {
        driver.get(baseURL);

        //Click on Slider Value
        driver.findElement(By.id("sliderValue")).click();
        Thread.sleep(2000);

        WebElement slider = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
        Thread.sleep(2000);

        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(slider, 30, 0).build();
        action.perform();


    }




    @AfterTest
    public  void andTest(){

        driver.quit();

    }


    }
