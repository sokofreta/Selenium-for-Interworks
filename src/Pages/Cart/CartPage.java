package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public String CartPageUrl = "https://www.saucedemo.com/cart.html";

    @FindBy(id = "checkout")
    private WebElement checkout;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void Checkout(){
        driver.get(CartPageUrl);
        driver.navigate().refresh();
        checkout.click();
    }


}
