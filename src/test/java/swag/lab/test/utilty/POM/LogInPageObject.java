package swag.lab.test.utilty.POM;

import org.openqa.selenium.By;

public class LogInPageObject {

    public static By hederText = By.xpath("//div[contains(text(),'Swag Labs')]");
    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By logInButton = By.id("login-button");
    public static String userName = "standard_user";
    public static String password = "secret_sauce";



}
