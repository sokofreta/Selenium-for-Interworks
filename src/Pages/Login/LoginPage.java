package Pages.Login;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {


    //URL of the correct page
    public String loginPageUrl = "https://www.saucedemo.com/";


    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;


    //Default constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Function to try login into the page
    public void Login(String userName, String password) {

        //Tell the driver where to go
        driver.get(loginPageUrl);
        driver.navigate().refresh();

        //Insert values to the form
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);

        //try to navigate into inventory page
        loginButton.click();
    }
}