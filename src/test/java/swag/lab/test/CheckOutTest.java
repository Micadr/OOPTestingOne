package swag.lab.test;

import org.testng.annotations.Test;
import swag.lab.test.utilty.BeforeAll;
import swag.lab.test.utilty.fun.CartFun;
import swag.lab.test.utilty.fun.CheckoutFun;
import swag.lab.test.utilty.fun.LogInFun;
import swag.lab.test.utilty.fun.PlpFun;

public class CheckOutTest extends BeforeAll {


    @Test
    public  void checkOutTest() {

         // LogIn
        LogInFun.logInValidAccount(driver,wait);

        //Add to Cart
        PlpFun.addToCart(driver,wait);

        //Go to Cart
        CartFun.goToCart(driver);

        //Check out
        CheckoutFun.checkOutProduct(driver);

    }
}
