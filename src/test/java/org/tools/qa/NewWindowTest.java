package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NewWindowTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void setUp() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://demoqa.com/browser-windows";

    }

    @Test
    public void newTabTest () throws InterruptedException {

        driver.get(baseURL);

        //Click on New Tab Button
        driver.findElement(By.id("tabButton")).click();

        //list of tabs
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        //Switch to new tab
        driver.switchTo().window(browserTabs.get(1));
        // Check is it correct page
        String myURL = driver.getCurrentUrl();
        System.out.println(myURL);
        Assert.assertNotEquals(myURL, baseURL);
        driver.findElement(By.id("sampleHeading"));
        //Close tab and get back
        driver.close();
        driver.switchTo().window(browserTabs.getFirst());

        }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }

}

