package Pages.InventoryPage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InventoryPage extends BasePage {


    //URL of the correct page
    public String inventoryPageUrl = "https://www.saucedemo.com/inventory.html";

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBackPack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addToCartFleeceJacket;

    @FindBy(id = "shopping_cart_container")
    private WebElement Cart;


    //Default constructor
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    //Function that adds the correct items depends on the test case
    public void AddItems(int TestCase){
        //Tell the driver where to go
        driver.get(inventoryPageUrl);
        driver.navigate().refresh();

        //If the TestCase is the first add only the one item
        if(TestCase == 1){
            addToCartBikeLight.click();
        }

        //If the TestCase is the second add the two items
        if(TestCase == 2) {
            addToCartBackPack.click();
            addToCartFleeceJacket.click();
        }

        //Navigate to Cart page
        Cart.click();
    }


}