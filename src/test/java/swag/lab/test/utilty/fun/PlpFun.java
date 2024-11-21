package swag.lab.test.utilty.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utilty.POM.PLPageObject;

public class PlpFun {

    public static void addToCart (WebDriver driver, WebDriverWait wait) {

        //Add item to cart
        driver.findElement(PLPageObject.addToCartButton).click();

    }
}
