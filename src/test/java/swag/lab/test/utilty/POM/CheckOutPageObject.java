package swag.lab.test.utilty.POM;

import org.openqa.selenium.By;

public class CheckOutPageObject {


    public static By CheckOutButton = By.id("checkout");
    public static String FirstName = "Milica";
    public static String LastName = "Milica";
    public static String PostalCode = "11070";

    public static By ContinueButton = By.id("continue");
    public static By FinishButton = By.id("finish");
    public static By ThanksText = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    public static By FirstNameField = By.id ("first-name");
    public static By LastNameField = By.id ("last-name");
    public static By PostalCodeField = By.id ("postal-code");
}
