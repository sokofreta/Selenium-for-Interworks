package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutStepOnePage extends BasePage {

    //URL of the correct page
    public String CartStepOnePageUrl = "https://www.saucedemo.com/checkout-step-one.html";

    @FindBy(id = "continue")
    private WebElement btn_continue;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    //Default constructor
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    //function that checks if the navigation to the next page failed
    public void ErrorStepOneValidation(){

        //Checks if the error message is displayed
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed on the page.");

        //Super function : checks if the current URL of the driver is the same with the given URL
        VerifyCurrentUrl(CartStepOnePageUrl);
    }

    //Function that insert the given values into the form to validation
    public void StepOne(String firstname,String lastname,String zipcode){
        //Tell the driver where to go
        driver.get(CartStepOnePageUrl);
        driver.navigate().refresh();

        //Insert values to the form
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        postalCode.sendKeys(zipcode);

        //Try to navigate next step of Checkout
        btn_continue.click();
    }
}
