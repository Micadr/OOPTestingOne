package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import swag.lab.test.utilty.BeforeAll;
import swag.lab.test.utilty.POM.LogInPageObject;
import swag.lab.test.utilty.POM.PLPageObject;

import java.time.Duration;

public class LogInLogOutTest extends BeforeAll {




    @Test(priority = 1, description = "logintest")
public void validLogInLogOutTest() throws InterruptedException {

    driver.get(baseURL);
    //Click on userNAME field

    driver.findElement(LogInPageObject.userNameField).click();
    //Insert on userNAME field username

    driver.findElement(LogInPageObject.userNameField).sendKeys(LogInPageObject.userName);


    //Click on password field
    driver.findElement(LogInPageObject.passwordField).click();

    //Insert on password field
    driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.password);


    //Click on login button
    driver.findElement(LogInPageObject.logInButton).click();


    wait.until(ExpectedConditions.visibilityOfElementLocated(PLPageObject.PLPageField));


    }


        @Test(priority = 2, description = "logouttest")
        public void validLogOutTest() throws InterruptedException {
    //Click on burger menu
    driver.findElement(PLPageObject.Burgermenu).click();


    //Click on LogOut
        driver.findElement(PLPageObject.LogoutButton).click();


        // Log OUT button
        driver.findElement(LogInPageObject.logInButton).isDisplayed();


    }



}
