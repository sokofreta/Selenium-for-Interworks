package Tests;

import Pages.BasePage;
import Pages.InventoryPage.InventoryPage;
import Pages.Login.LoginPage;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Cart.CartPage;

public class InventoryPageTest extends TestBase {

    private String validUserName = "standard_user";
    private String validPassword = "secret_sauce";

    @Test

    public void AddItemsToCart(WebDriver driver,boolean display,int numberOfItems){
        if(display){
            Log.info("Start Test : 'Add Item to Cart'");
        }
        LoginPageTests loginTest = new LoginPageTests();
        loginTest.TestSuccessfulLogin(driver,false);

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.AddItems(numberOfItems);

        CartPage cart = new CartPage(driver);
        cart.VerifyCurrentUrl(cart.CartPageUrl);
        Log.info("Add Item(s) to cart");
        if(display){
            Log.info("End Test : 'Add Item to Cart'");
        }
    }

}
