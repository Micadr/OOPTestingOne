package swag.lab.test.utilty.POM;

import org.openqa.selenium.By;

public class PLPageObject {

    public static By PLPageField = By.xpath("//span[contains(text(),'Products')]");
    public static By Burgermenu = By.id("react-burger-menu-btn");
    public static By LogoutButton = By.id("logout_sidebar_link");
    public static By addToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

}
