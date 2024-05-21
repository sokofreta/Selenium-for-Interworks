package Tests.CartTests;

import Pages.Cart.CheckoutStepOnePage;
import Pages.Cart.CheckoutStepTwoPage;
import Tests.TestBase;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutStepOnePageTest extends TestBase {

    private String validFirstName = "Sokratis";
    private String validLastName = "Seitanidis";
    private String validZIPName = "57400";
    private String invalidZipName = "";

    //Test για τη λανθασμένη εισαγωγή στοιχείων
    @Test
    public void CheckoutStepOneErrorValidation(){
        Log.info("Start Test Case : 'StepOneErrorValidation Test' ");

        //Επισκόπηση του καλαθιού αγορών
        CartTest cartTest = new CartTest();
        cartTest.TestCheckout(driver,1);

        //Εισαγωγή λανθασμένων στοιχείων στη φόρμα
        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.StepOne(validFirstName,validLastName,invalidZipName);

        //Έλεγχος εμφάνισης μηνύματος σφάλματος
        cartStepOne.ErrorStepOneValidation();

        //Ενημέρωση για τη λανθασμένη εισαγωγή στοιχείων
        Log.info("Invalid inputs of forum");

        Log.info("End Test Case : 'StepOneErrorValidation Test' ");

    }

    //Test για τη σωστή ολοκλήρωση εισαγωγής στοιχείων
    @Test
    public void CheckoutStepOneValidation(WebDriver driver,int TestCase){

        //Επισκόπηση του καλαθιού αγορών σύμφωνα με το testCase
        CartTest cartTest = new CartTest();
        cartTest.TestCheckout(driver,TestCase);

        //Εισαγωγή έγκυρων στοιχείων στη φόρμα
        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.StepOne(validFirstName,validLastName,validZIPName);

        //Έλεγχος μετάβασης στο σωστό URL
        CheckoutStepTwoPage cartStepTwo = new CheckoutStepTwoPage(driver);
        cartStepTwo.VerifyCurrentUrl(cartStepTwo.checkoutStepTwoPageUrl);

        //Ενημέρωση για τη σωστή εισαγωγή στοιχείων
        Log.info("Valid inputs of forum");
    }
}
