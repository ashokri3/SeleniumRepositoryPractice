package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class LoginPage {


        WebDriver driver;
        WaitUtils wait;

        // Locators
        By username = By.cssSelector("input[placeholder='Username']");
        By password = By.name("password");
        By loginButton = By.cssSelector("button[type='submit']");


       // @FindBy(cssSelector("input[placeholder='Username']"));

        // Constructor
        public LoginPage(WebDriver driver) {
            this.driver = driver;
            wait = new WaitUtils(driver);
        }

        // Actions
        public void enterUsername(String usernameValue) {
            wait.type(username, usernameValue);
        }

        public void enterPassword(String passwordValue) {
            wait.type(password, passwordValue);
        }

        public void clickLogin() {
            wait.click(loginButton);
        }
}





















