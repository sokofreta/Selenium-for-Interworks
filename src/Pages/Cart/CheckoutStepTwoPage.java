package Pages.Cart;

import Pages.BasePage;

import Utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutStepTwoPage extends BasePage {

    private int count =1;

    @FindBy(className = "inventory_item_price")
    List<WebElement> AllPrices;

    @FindBy(className = "summary_total_label")
    WebElement totalPrice;
    public String checkoutStepTwoPageUrl = "https://www.saucedemo.com/checkout-step-two.html";

    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    public void CheckPrices(){
        driver.get(checkoutStepTwoPageUrl);
        driver.navigate().refresh();
        for(WebElement price : AllPrices){
            Log.info("Item " + count + ": " + price.getText());
            count++;
        }
        Log.info(totalPrice.getText());


    }

}
