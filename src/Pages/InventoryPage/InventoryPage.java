package Pages.InventoryPage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    public String inventoryPageUrl = "https://www.saucedemo.com/inventory.html";

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBackPack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addToCartFleeceJacket;

    @FindBy(id = "shopping_cart_container")
    private WebElement Cart;

    public void AddItems(int TestCase){
        driver.get(inventoryPageUrl);
        driver.navigate().refresh();
        if(TestCase == 1){
            addToCartBikeLight.click();
        }
        if(TestCase == 2) {
            addToCartBackPack.click();
            addToCartFleeceJacket.click();
        }

        Cart.click();
    }


}