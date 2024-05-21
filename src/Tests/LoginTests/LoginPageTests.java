package Tests.LoginTests;

import Pages.InventoryPage.InventoryPage;
import Pages.Login.LoginPage;
import Tests.TestBase;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {
    private String validUserName = "standard_user";
    private String validPassword = "secret_sauce";

    //Test για την επιτυχή σύνδεση του χρήστη
    @Test
    public void TestSuccessfulLogin(WebDriver driver) {

        //Σύνδεση του χρήστη με έγκαιρα στοιχεία
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login(validUserName, validPassword);

        //Έλεγχος αν μεταφερθήκαμε στο σωστό URL
        InventoryPage inventoryPage = new InventoryPage(driver);
        loginPage.VerifyCurrentUrl(inventoryPage.inventoryPageUrl);

        //Ενημέρωση για την επιτυχή σύνδεση του χρήστη
        Log.info("User successfully login");
    }
}