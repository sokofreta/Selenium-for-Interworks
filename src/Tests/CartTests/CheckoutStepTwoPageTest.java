package Tests.CartTests;

import Pages.Cart.CheckoutStepTwoPage;
import Tests.TestBase;
import Utils.Log;
import org.testng.annotations.Test;

public class CheckoutStepTwoPageTest extends TestBase {

    //Test για την εξακρίβωση τιμών προϊόντων
    @Test
    public void CheckoutStepTwoValidation(){

        Log.info("Start Test Case : 'StepOneErrorValidation Test' ");

        //Επιτυχή συμπλήρωση της φόρμα στοιχείων
        CheckoutStepOnePageTest cartStepOne = new CheckoutStepOnePageTest();
        cartStepOne.CheckoutStepOneValidation(driver,2);

        //Εμφάνιση τιμών προϊόντων ατομικά και συνολικά
        CheckoutStepTwoPage checkoutStepTwo = new CheckoutStepTwoPage(driver);
        checkoutStepTwo.CheckPrices();

        Log.info("End Test Case : 'StepOneErrorValidation Test' ");
    }
}
