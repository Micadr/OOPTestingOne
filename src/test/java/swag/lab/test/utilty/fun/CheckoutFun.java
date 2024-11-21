package swag.lab.test.utilty.fun;

import org.openqa.selenium.WebDriver;
import swag.lab.test.utilty.POM.CartPageObject;
import swag.lab.test.utilty.POM.CheckOutPageObject;

public class CheckoutFun {

    public static void checkOutProduct (WebDriver driver) {

        driver.findElement(CartPageObject.checkoutBtn).click();

        //Click on first name field
        driver.findElement(CheckOutPageObject.FirstNameField).click();
        //Insert on first name field
        driver.findElement(CheckOutPageObject.FirstNameField).sendKeys(CheckOutPageObject.FirstName);
        //Click on last name field

        driver.findElement(CheckOutPageObject.LastNameField).click();
        driver.findElement(CheckOutPageObject.LastNameField).sendKeys(CheckOutPageObject.FirstName);

        //Click on zip code  field
        driver.findElement(CheckOutPageObject.PostalCodeField).click();
        driver.findElement(CheckOutPageObject.PostalCodeField).sendKeys(CheckOutPageObject.PostalCode);

        // Click to Continue
        driver.findElement(CheckOutPageObject.ContinueButton).click();

        //Click to Finish
        driver.findElement(CheckOutPageObject.FinishButton).click();


        //Thanks message
        driver.findElement(CheckOutPageObject.ThanksText).isDisplayed();





    }
}
