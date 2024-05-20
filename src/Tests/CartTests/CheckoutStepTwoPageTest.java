package Tests.CartTests;

import Pages.Cart.CheckoutStepTwoPage;
import Tests.TestBase;
import Utils.Log;
import org.testng.annotations.Test;

public class CheckoutStepTwoPageTest extends TestBase {

    @Test
    public void CheckoutStepTwoValidation(){
        Log.info("Start Test Case : 'StepOneErrorValidation Test' ");

        CheckoutStepOnePageTest cartStepOne = new CheckoutStepOnePageTest();
        cartStepOne.CheckoutStepOneValidation(driver,false,2);

        CheckoutStepTwoPage checkoutStepTwo = new CheckoutStepTwoPage(driver);
        checkoutStepTwo.CheckPrices();

        Log.info("End Test Case : 'StepOneErrorValidation Test' ");
    }
}
