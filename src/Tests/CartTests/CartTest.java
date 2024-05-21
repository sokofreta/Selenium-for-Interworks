package Tests.CartTests;

import Pages.Cart.CheckoutStepOnePage;
import Tests.InventoryTests.InventoryPageTest;
import Tests.TestBase;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Cart.CartPage;

public class CartTest extends TestBase {

    //Test για την επισκόπηση του καλαθιού αγορών σύμφωνα με το testCase
    @Test
    public void TestCheckout(WebDriver driver,int TestCase){

        //Προσθήκη αντικειμένων σύμφωνα με το TestCase
        InventoryPageTest inventoryTest = new InventoryPageTest();
        inventoryTest.AddItemsToCart(driver,TestCase);

        //Μετάβαση στη σελίδα για πληρωμή
        CartPage cart = new CartPage(driver);
        cart.Checkout();

        //Έλεγχος μετάβασης στο σωστό URL
        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.VerifyCurrentUrl(cartStepOne.CartStepOnePageUrl);

        //Ενημέρωση επιτυχούς μεταφοράς στο στάδιο πληρωμής
        Log.info("Passing to Step One");

    }

}
