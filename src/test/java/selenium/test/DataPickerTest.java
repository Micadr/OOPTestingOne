package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataPickerTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void SetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://qa-practice.netlify.app/";

    }

    @Test
    public void dataPickerTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on files upload
        driver.findElement(By.id("date-picker")).click();
        Thread.sleep(3000);
        //Click on calendar
        driver.findElement(By.id("range-date-calendar")).click();
        //Click on calendar
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")).click();

        //Click on apply
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        Thread.sleep(3000);
        //Click on basic calendar
        driver.findElement(By.id("calendar")).click();
        //Click on date
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")).click();
        Thread.sleep(3000);

    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}