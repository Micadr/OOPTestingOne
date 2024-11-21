package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoaderTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://qa-practice.netlify.app/loader";

    }

    @Test
    public void LoaderTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on files upload
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));
        driver.findElement(By.id("myDiv")).isDisplayed();
        Thread.sleep(3000);

    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
