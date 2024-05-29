package Tests.CartTests;

import Pages.Cart.CheckoutStepTwoPage;
import Tests.TestBase;
import Utils.Log;
import org.testng.annotations.Test;

public class CheckoutSecondStepPageTest extends TestBase {


    @Test
    //Test για την εξακρίβωση τιμών προϊόντων
    public void CheckoutStepTwoValidation(){

        Log.info("Start Test Case : 'Checkout Step Two Validation Test' ");

        //Επιτυχή συμπλήρωση της φόρμα στοιχείων
        CheckoutFirstStepPageTest cartStepOne = new CheckoutFirstStepPageTest();
        cartStepOne.CheckoutStepOneValidation(driver,2);

        //Εμφάνιση τιμών προϊόντων ατομικά και συνολικά
        CheckoutStepTwoPage checkoutStepTwo = new CheckoutStepTwoPage(driver);
        checkoutStepTwo.CheckPrices();

        Log.info("End Test Case : 'Checkout Step Two Validation Test' ");
    }
}
