package swag.lab.test.utilty.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utilty.POM.LogInPageObject;

public class LogInFun {

    public static void logInValidAccount(WebDriver driver, WebDriverWait wait){

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



    }
}
