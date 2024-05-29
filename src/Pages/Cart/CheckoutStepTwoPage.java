package Pages.Cart;

import Pages.BasePage;

import Utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutStepTwoPage extends BasePage {

    //URL of the correct page
    public String checkoutStepTwoPageUrl = "https://www.saucedemo.com/checkout-step-two.html";

    @FindBy(className = "inventory_item_price")
    List<WebElement> AllPrices;

    @FindBy(className = "summary_total_label")
    WebElement totalPrice;

    //Default constructor
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    //Function that print the prices of the items in the cart after a successful checkout and the total price
    public void CheckPrices(){

        //Insert values to the form
        driver.get(checkoutStepTwoPageUrl);
        driver.navigate().refresh();

        //Helping variable
        int count =1;

        //Get all values of the Items in the checkout and print it
        for(WebElement price : AllPrices){
            Log.info("Item " + count + ": " + price.getText());
            count++;
        }

        //Print the total value of the items
        Log.info(totalPrice.getText());


    }

}
