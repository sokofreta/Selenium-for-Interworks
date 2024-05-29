package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    //URL of the correct page
    public String CartPageUrl = "https://www.saucedemo.com/cart.html";

    @FindBy(id = "checkout")
    private WebElement checkout;

    //Default constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //Function that navigate to check out to pay
    public void Checkout(){

        //Tell the driver where to go
        driver.get(CartPageUrl);
        driver.navigate().refresh();

        //Navigate to the Checkout page
        checkout.click();
    }


}
