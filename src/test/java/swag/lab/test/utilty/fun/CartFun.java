package swag.lab.test.utilty.fun;

import org.openqa.selenium.WebDriver;
import swag.lab.test.utilty.POM.CartPageObject;

public class CartFun {

    public static void goToCart (WebDriver driver){

        //Go to cart
        driver.findElement(CartPageObject.shopCartIcon).click();

    }
}
