package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutStepOnePage extends BasePage {

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

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void ErrorStepOneValidation(){
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed on the page.");
        VerifyCurrentUrl(CartStepOnePageUrl);
    }

    public void StepOne(String firstname,String lastname,String zipcode){
        driver.get(CartStepOnePageUrl);
        driver.navigate().refresh();
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        postalCode.sendKeys(zipcode);

        btn_continue.click();
    }
}
