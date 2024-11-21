package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUploadTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public  void SetUp()   {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait (driver, (Duration.ofSeconds(10)));
        baseURL= "https://qa-practice.netlify.app/";

    }
    @Test
    public  void fileduploadTest() throws InterruptedException {

        driver.get(baseURL);
        //Click on files upload
        driver.findElement(By.id("file-upload-item")).click();
        //Upload File
        WebElement uploadFileButton= driver.findElement(By.id("file_upload"));

        // Uploading the file using sendKeyes
        uploadFileButton.sendKeys("C:\\Users\\QA1.5\\Desktop\\Pretraga.png");
        Thread.sleep(3000);

        //Click on submit button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("file_upload_response")).isDisplayed();

    }

    @AfterTest
    public  void andTest(){

        driver.quit();

    }
}
