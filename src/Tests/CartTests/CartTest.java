package Tests.CartTests;

import Pages.Cart.CheckoutStepOnePage;
import Tests.InventoryTests.InventoryPageTest;
import Tests.TestBase;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Cart.CartPage;

public class CartTest extends TestBase {

    @Test
    public void TestCheckout(WebDriver driver,boolean display,int numberOfItems){
        if(display){
            Log.info("Start Test Case : 'TestCheckoutStepOne' ");
        }
        InventoryPageTest inventoryTest = new InventoryPageTest();
        inventoryTest.AddItemsToCart(driver,false,numberOfItems);

        CartPage cart = new CartPage(driver);
        cart.Checkout();

        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.VerifyCurrentUrl(cartStepOne.CartStepOnePageUrl);
        Log.info("Passing to Step One");
        if(display) {
            Log.info("End Test Case : 'TestCheckoutStepOne' ");
        }

    }

}
