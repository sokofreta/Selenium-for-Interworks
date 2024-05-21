package Tests.InventoryTests;

import Pages.InventoryPage.InventoryPage;
import Tests.LoginTests.LoginPageTests;
import Tests.TestBase;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Cart.CartPage;

public class InventoryPageTest extends TestBase {

    //Test για την εισαγωγή αντικειμένων στο καλάθι
    @Test
    public void AddItemsToCart(WebDriver driver,int TestCase){

        //Προσπάθεια για την επιτυχή σύνδεση του χρήστη
        LoginPageTests loginTest = new LoginPageTests();
        loginTest.TestSuccessfulLogin(driver);

        //Εισαγωγή αντικειμένων ανάλογα με το Test
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.AddItems(TestCase);

        //Έλεγχος μετάβασης στο σωστό URL
        CartPage cart = new CartPage(driver);
        cart.VerifyCurrentUrl(cart.CartPageUrl);

        //Ενημέρωση για την εισαγωγή αντικειμένων
        Log.info("Add Item(s) to cart");

    }

}
