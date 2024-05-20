package Tests;

import Pages.Cart.CheckoutStepOnePage;
import Pages.Cart.CheckoutStepTwoPage;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutStepOnePageTest extends TestBase{

    private String validFirstName = "Sokratis";
    private String validLastName = "Seitanidis";
    private String validZIPName = "57400";
    private String invalidZipName = "";


    @Test
    public void CheckoutStepOneErrorValidation(){
        Log.info("Start Test Case : 'StepOneErrorValidation Test' ");

        CartTest cartTest = new CartTest();
        cartTest.TestCheckout(driver,false,1);


        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.StepOne(validFirstName,validLastName,invalidZipName);

        cartStepOne.ErrorStepOneValidation();
        Log.info("Invalid inputs of forum");

        Log.info("End Test Case : 'StepOneErrorValidation Test' ");

    }

    @Test
    public void CheckoutStepOneValidation(WebDriver driver,boolean display,int numberOfItems){
        if(display){
            Log.info("Start Test Case : 'StepOneErrorValidation Test' ");
        }

        CartTest cartTest = new CartTest();
        cartTest.TestCheckout(driver,false,numberOfItems);

        CheckoutStepOnePage cartStepOne = new CheckoutStepOnePage(driver);
        cartStepOne.StepOne(validFirstName,validLastName,validZIPName);

        CheckoutStepTwoPage cartStepTwo = new CheckoutStepTwoPage(driver);
        cartStepTwo.VerifyCurrentUrl(cartStepTwo.checkoutStepTwoPageUrl);

        Log.info("Valid inputs of forum");

        if(display){
            Log.info("End Test Case : 'StepOneErrorValidation Test' ");
        }

    }
}
